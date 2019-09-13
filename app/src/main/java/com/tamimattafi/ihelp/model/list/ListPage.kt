package com.tamimattafi.ihelp.model.list

data class ListPage<T>(
    val total : Long,
    val list : ArrayList<T>
)