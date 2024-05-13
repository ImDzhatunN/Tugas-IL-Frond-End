package com.example.tugasku.komposisi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.tugasku.data.DataAwal
import com.example.tugasku.item.Drama

@Composable
fun DramaDetailScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    dramaasId: Int?
) {
    val dramaBaruList = DataAwal.tugasDrama.filter{ drama ->
        drama.id == dramaasId
    }
    Column(
        modifier = modifier
    ) {
        DetailDramaBerikut(dramaBaruList =  dramaBaruList)
    }
}

@Composable
private fun DetailDramaBerikut(
    dramaBaruList: List<Drama>,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = dramaBaruList[0].photo)
                .build(),
            modifier = Modifier
                .size(height = 100.dp, width = 120.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "PhotoDrama"
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = dramaBaruList[0].title,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "(${dramaBaruList[0].tahunrilis})",
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "(${dramaBaruList[0].sinopsis}",
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 12.sp,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DramaDetailBerikutPreview() {
    DetailDramaBerikut(dramaBaruList = DataAwal.tugasDrama)
}