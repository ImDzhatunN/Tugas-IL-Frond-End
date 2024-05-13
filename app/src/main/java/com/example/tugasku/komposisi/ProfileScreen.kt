package com.example.tugasku.komposisi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasku.data.DataAwal
import com.example.tugasku.item.Profile
import com.example.tugasku.ui.theme.TugasKUTheme

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
    profiles: List<Profile> = DataAwal.tugasProfile
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        profiles.forEach { profile ->
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
            ) {
                Column(modifier = Modifier.padding(35.dp)) {
                    Image(
                        painter = painterResource(id = profile.photo),
                        contentDescription = profile.name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(200.dp)
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(16.dp))
                    )
                    Divider(color = MaterialTheme.colorScheme.onSurface, thickness = 0.3.dp)
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = profile.name.uppercase(),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = profile.email,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = profile.kampus,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = profile.jurusan,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                }

            }
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
            ) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Text(
                        text = profile.catatan,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                }

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ProfileScreenPreview() {
    TugasKUTheme{
        ProfileScreen(profiles = DataAwal.tugasProfile)
    }
}

