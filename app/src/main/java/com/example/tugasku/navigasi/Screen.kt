package com.example.tugasku.navigasi

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Penyanyi: Screen("penyanyi")
    data object Rincian: Screen("rincian_ost")
    data object Rincians: Screen("rincian_drama")
    data object Profile: Screen("Profile")
}