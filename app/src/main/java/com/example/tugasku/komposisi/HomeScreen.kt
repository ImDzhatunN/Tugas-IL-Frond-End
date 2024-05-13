package com.example.tugasku.komposisi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugasku.data.DataAwal
import com.example.tugasku.item.Drama
import com.example.tugasku.item.Ost
import com.example.tugasku.komposisi.Design.DramaStuff
import com.example.tugasku.komposisi.Design.OstStuff
import com.example.tugasku.navigasi.Screen


@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    osts: List<Ost> = DataAwal.tugasOst,
    dramas: List<Drama> = DataAwal.tugasDrama,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(20.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth() //
            ) {
                items(osts, key = { it.id }) {
                    OstStuff(ost = it, modifier = Modifier.fillMaxSize())
                }
            }
        }
        items(dramas, key = { it.id }) {
            DramaStuff(drama = it) { dramaId ->
                navController.navigate("${Screen.Rincians.route}/$dramaId")
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun HomeScreenPreview() {
    MaterialTheme {
        val navController = rememberNavController() // Inisialisasi NavController
        val osts = DataAwal.tugasOst // Data Ost untuk preview
        val dramas = DataAwal.tugasDrama // Data Drama untuk preview

        HomeScreen(navController = navController, osts = osts, dramas = dramas)
    }
}