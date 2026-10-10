package com.example.pertemuan4tugas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardWidget(
    name: String,
    phone: String,
    location: String,
    bgColor: Color,
    nameColor: Color,
    phoneColor: Color,
    locationColor: Color,
    nameFontFamily: FontFamily,
    nameFontWeight: FontWeight
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        colors = CardDefaults.cardColors(containerColor = bgColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(80.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            // Teks tengah
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(text = name)
                Text(text = phone)
                Text(text = location)
            }

            Spacer(modifier = Modifier.width(16.dp))

            // Logo kanan
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(80.dp)
            )
        }
    }
}

@Composable
fun AktivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Judul
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 22.sp
        )

        Spacer(modifier = Modifier.height(25.dp))

        // Card 1 - ADI
        CardWidget(
            name = stringResource(id = R.string.name1),
            phone = "",
            location = stringResource(id = R.string.location1),
            bgColor = colorResource(id = R.color.card_1_bg),
            nameColor = Color.White,
            phoneColor = Color.Transparent,
            locationColor = colorResource(id = R.color.text_yellow),
            nameFontFamily = FontFamily.Cursive,
            nameFontWeight = FontWeight.Normal
        )

        // Card 2 - Dega
        CardWidget(
            name = stringResource(id = R.string.name2),
            phone = stringResource(id = R.string.phone2),
            location = stringResource(id = R.string.location2),
            bgColor = colorResource(id = R.color.card_2_bg),
            nameColor = Color.White,
            phoneColor = colorResource(id = R.color.text_cyan),
            locationColor = colorResource(id = R.color.text_cream),
            nameFontFamily = FontFamily.Default,
            nameFontWeight = FontWeight.Bold
        )

        // Card 3 - Ericha
        CardWidget(
            name = stringResource(id = R.string.name3),
            phone = stringResource(id = R.string.phone3),
            location = stringResource(id = R.string.location3),
            bgColor = colorResource(id = R.color.card_3_bg),
            nameColor = Color.White,
            phoneColor = colorResource(id = R.color.text_cyan),
            locationColor = Color.White,
            nameFontFamily = FontFamily.Default,
            nameFontWeight = FontWeight.Bold
        )

        // Card 4 - Apid
        CardWidget(
            name = stringResource(id = R.string.name4),
            phone = stringResource(id = R.string.phone4),
            location = stringResource(id = R.string.location4),
            bgColor = colorResource(id = R.color.card_4_bg),
            nameColor = Color.White,
            phoneColor = colorResource(id = R.color.text_cyan),
            locationColor = colorResource(id = R.color.text_cream),
            nameFontFamily = FontFamily.Default,
            nameFontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.weight(1f))

        // Copyright
        Text(
            text = stringResource(id = R.string.copy),
            modifier = Modifier
                .padding(bottom = 50.dp)
        )
    }
}
