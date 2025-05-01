package com.example.lion.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lion.R


@Composable
fun CardPerformance(
    cor: Color = Color.Red,
    materia: String = "",
    nota: String = "",
    isFilled: Boolean = false

) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(top = 5.dp)
            .fillMaxWidth()
    ){
        Text(
            text = materia,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier
                .width(6.dp)
        )
        Card(
            modifier = Modifier
                .width(220.dp)
                .height(40.dp)
                .padding( start = 10.dp,
                    bottom = 5.dp),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Card (
                modifier = Modifier
                    .width(100.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Red
                )
            ){}
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(3.dp)
        ) {
            Text(
                text = nota,
                modifier = Modifier.padding(end = 8.dp),
                color = Color.White,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview
@Composable
private fun CardPerformancePreview() {
    CardPerformance()
}