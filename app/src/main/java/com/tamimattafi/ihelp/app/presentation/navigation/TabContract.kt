package com.tamimattafi.ihelp.app.presentation.navigation

interface TabContract {

    interface TabController {
        fun goToTab(tab: Int)
    }

    interface TabRequestProvider {
        var tabController: TabController?
        fun attachTabController(tabController: TabController) {
            this.tabController = tabController
        }
    }
}