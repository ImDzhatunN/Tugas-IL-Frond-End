package com.example.tugasku.komposisi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasku.data.DataAwal
import com.example.tugasku.item.Penyanyi
import com.example.tugasku.komposisi.Design.PenyanyiStuff
import com.example.tugasku.ui.theme.TugasKUTheme

@Composable
fun PenyanyiScreen(
    modifier: Modifier = Modifier,
    penyanyian: List<Penyanyi> = DataAwal.tugasPenyanyi
) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        columns = GridCells.Adaptive(90.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(penyanyian, key = { it.id} ) { penyanyi ->
            Card(
                modifier = Modifier
                    .padding(0.dp), //
                shape = RoundedCornerShape(8.dp),
            ) {
                PenyanyiStuff(penyanyi = penyanyi)
            }
        }
    }

}
@Preview(showSystemUi = true)
@Composable
private fun PenyanyiScreenPreview() {
    TugasKUTheme {
       PenyanyiScreen(penyanyian = DataAwal.tugasPenyanyi)
    }
}