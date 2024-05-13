package com.example.tugasku.komposisi

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AudioFile
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tugasku.R
import com.example.tugasku.navigasi.NavigationItem
import com.example.tugasku.navigasi.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TugasKuApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {


    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text( "BestRecom") }, //
                actions = {
                }
            )
        },
        bottomBar = {
            BottomBar(navController)
        },
        modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController)
            }

            composable(Screen.Penyanyi.route) {
                PenyanyiScreen()
            }

            composable(Screen.Profile.route) {
                ProfileScreen()
            }

            composable(
                Screen.Rincians.route + "/{dramaId}",
                arguments = listOf(navArgument("dramaId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DramaDetailScreen(
                    navController = navController,
                    dramaasId = navBackStackEntry.arguments?.getInt("dramaId")
                )
            }
        }
    }
}


@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationrincian = listOf(
            NavigationItem(
                title = stringResource(id = R.string.home), // Menggunakan stringResource untuk mendapatkan judul
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.penyanyi), // Menggunakan stringResource untuk mendapatkan judul
                icon = Icons.Default.AudioFile,
                screen = Screen.Penyanyi
            ),
            NavigationItem(
                title =stringResource(id = R.string.profile), // Menggunakan stringResource untuk mendapatkan judul
                icon = Icons.Default.AccountBox,
                screen = Screen.Profile
            )
        )

        navigationrincian.forEach { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TugasKuAppPrev() {
    TugasKuApp()
}
