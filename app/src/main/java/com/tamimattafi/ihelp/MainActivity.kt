package com.tamimattafi.ihelp

import android.os.Bundle
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationActivity

class MainActivity : NavigationActivity() {

    override val layoutId: Int = R.layout.activity_main
    override var rootId: Int = R.id.root

    override fun onViewCreated(savedInstanceState: Bundle?) {

    }


}
