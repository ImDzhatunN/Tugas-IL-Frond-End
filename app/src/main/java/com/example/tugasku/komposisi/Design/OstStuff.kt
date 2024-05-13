package com.example.tugasku.komposisi.Design

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasku.R
import com.example.tugasku.item.Ost
import com.example.tugasku.ui.theme.TugasKUTheme


@Composable
fun OstStuff(
    ost: Ost,
    modifier: Modifier = Modifier

) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Image(
            painter = painterResource(id = ost.photo),
            contentDescription = ost.title, modifier = Modifier
                .clip(RoundedCornerShape(4.dp))
                .size(100.dp)
        )
        Text(
            text = ost.title,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(100.dp),
            maxLines = 1
        )
        Text  (
            text = ost.tahunrilis.toString(),
            style = MaterialTheme.typography.bodyMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(100.dp),
            maxLines = 1
        )
        Text(
            text = ost.penyanyi,
            style = MaterialTheme.typography.titleSmall,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(100.dp),
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun OstItemHorizontalPreview() {
    TugasKUTheme {
        OstStuff(
            ost = Ost(1,
                "Lady Luck",
                2014,
                "EXO CHEN",
                R.drawable.bestluck
            )
        )
    }
}