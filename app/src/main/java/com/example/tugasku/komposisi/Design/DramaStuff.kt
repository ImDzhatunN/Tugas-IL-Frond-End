package com.example.tugasku.komposisi.Design

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasku.R
import com.example.tugasku.item.Drama
import com.example.tugasku.ui.theme.TugasKUTheme


@Composable
fun DramaStuff(
    drama: Drama,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.clickable {
            onItemClicked(drama.id)
        }
    ) {
        Image(
            painter = painterResource(id = drama.photo),
            contentDescription = drama.title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(10.dp)
                .clip(RoundedCornerShape(6.dp))
                .size(height = 170.dp, width = 130.dp)
        )
        Spacer(modifier = Modifier.width(6.dp))
        Column {
            Text(text = drama.title, style = MaterialTheme.typography.titleMedium)
            Text(text = drama.tahunrilis.toString(), style = MaterialTheme.typography.titleMedium )
            Text(text = drama.sinopsis, style = MaterialTheme.typography.bodySmall)

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DramaStuffPreview() {
    TugasKUTheme {
        DramaStuff(
            drama = Drama(
                1,
                "Queen of Tears",
                2024,
                "Kisah kehidupan pasangan suami istri yang menghadapi konflik di usia tiga tahun pernikahannya.\n" +
                        "Mereka adalah Baek Hyun Woo dan Hong Hae In. Keduanya berasal dari keluarga dengan dunia dengan latar belakang yang berbeda,\n" +
                        "Yang dipersatukan dalam ikatan pernikahan penuh suka cita",
                R.drawable.queenfftears
            ),
            onItemClicked = { dramaId ->
                println("Drama Id : $dramaId")
            }
        )
    }
}









