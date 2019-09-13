package com.tamimattafi.ihelp.app.presentation.mvp.recycler

import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import com.tamimattafi.ihelp.repository.api.global.RepositoryContract

abstract class MvpRecyclerPresenter<T : MvpRecyclerContract.Object<Int>,
        VIEW : MvpRecyclerContract.RefreshableView<HOLDER>,
        HOLDER : MvpRecyclerContract.Holder>(
    override var view: VIEW,
    protected val repository: RepositoryContract.RepositoryBase<T>
) : BasePresenter<VIEW>(view), MvpRecyclerContract.Presenter<HOLDER> {

    protected var dataList: ArrayList<T> = ArrayList()

    override fun loadMoreRecyclerData() {
        with(view.getAdapter()) {
            if (!allData && !isLoading && !networkError) {
                isLoading = true
                repository.getNextPage().setOnListCompleteListener {
                    isLoading = true
                    dataList.addAll(ArrayList(it))
                    setDataCount(dataList.size)
                    allData = it.size < repository.paginationSize
                    isLoading = false
                    view.setRefreshing(false)
                }.setOnFailureListener {
                    networkError = true
                    isLoading = false
                    setDataCount(dataList.size)
                    view.showError(it)
                }
            }
        }
    }

    override fun refresh() {
        dataList.clear()
        repository.refresh()
        view.setRefreshing(true)
        loadMoreRecyclerData()
    }

    override fun onDestroyView() {
        repository.stopListening()
        super.onDestroyView()
    }

    override fun onDestroy() {
        repository.destroy()
        dataList.clear()
    }

}