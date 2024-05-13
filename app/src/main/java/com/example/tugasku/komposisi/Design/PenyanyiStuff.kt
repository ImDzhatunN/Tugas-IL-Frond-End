package com.example.tugasku.komposisi.Design

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasku.R
import com.example.tugasku.item.Penyanyi
import com.example.tugasku.ui.theme.TugasKUTheme

@Composable
fun PenyanyiStuff(
    penyanyi: Penyanyi,
    modifier: Modifier= Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = penyanyi.photo),
            contentDescription = penyanyi.name,
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = penyanyi.name,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = penyanyi.debut.toString(),
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
private fun CourseItemPreview() {
   TugasKUTheme {
        PenyanyiStuff(
            penyanyi = Penyanyi(
                1,
                "Loco, Kwon Hyuk-woo",
                2012,
                R.drawable.loco
            )
        )
    }
}