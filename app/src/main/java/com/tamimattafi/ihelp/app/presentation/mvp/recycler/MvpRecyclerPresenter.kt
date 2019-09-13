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

    override fun loadMoreRecyclerData(recycler: MvpRecyclerContract.RecyclerAdapter<HOLDER>) {
        with(recycler as MvpRecyclerContract.InternetRecyclerAdapter<HOLDER>) {
            if (!allData && !isLoading && !networkError) {

                isLoading = true

                repository.getNextPage()

            }

        }
    }

    override fun refresh(recycler: MvpRecyclerContract.RecyclerAdapter<HOLDER>) {
        dataList.clear()
        repository.refresh()
        view.setRefreshing(true)
        loadMoreRecyclerData(recycler)
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