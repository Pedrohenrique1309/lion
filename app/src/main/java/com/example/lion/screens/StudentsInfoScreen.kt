package com.example.lion.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lion.R
import com.example.lion.screens.components.CardPerformance
import com.example.lion.screens.components.Logo


@Composable
fun StudentInfoScreen (){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ){

        Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {
                Logo(
                    modifier = Modifier
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(20.dp),
                color = colorResource(R.color.amarelo)
            )
            Card(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth()
            ){}
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(15.dp)
            ) {
                Card(
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp),
                    shape = RoundedCornerShape(100.dp),
                    border = BorderStroke(5.dp, colorResource(R.color.amarelo))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ellipse),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Text(
                    text = "Luana Oliveira Dias",
                    fontSize = 24.sp,
                    color = colorResource(R.color.azul_logo),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(5.dp)
                )
                Text(
                    text = "001 - Técnico em Desenvolvimento de Sistemas",
                    color = colorResource(R.color.azul_logo),
                    fontWeight = FontWeight.SemiBold
                )
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(500.dp)
                        .padding(10.dp, top = 60.dp),
                    colors = CardDefaults.cardColors(colorResource(R.color.azul_students))
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(30.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            text = stringResource(R.string.desempenho),
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                        Column (
                            modifier = Modifier
                                .padding(top = 35.dp),
                            verticalArrangement = Arrangement.SpaceBetween
                        ){
                            CardPerformance(
                                materia = "SIOP",
                                nota = "77"
                            )
                            CardPerformance(
                                materia = "SIOP",
                                nota = "77"
                            )
                            CardPerformance(
                                materia = "SIOP",
                                nota = "77"
                            )
                            CardPerformance(
                                materia = "SIOP",
                                nota = "77"
                            )
                            CardPerformance(
                                materia = "SIOP",
                                nota = "77"
                            )
                            CardPerformance(
                                materia = "SIOP",
                                nota = "77"
                            )
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.End,
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .padding(top = 30.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.ok),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(15.dp)
                                    .height(15.dp)

                            )
                            Text(
                                text = stringResource(R.string.concluido),
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }

        }

    }

}

@Preview(showSystemUi = true)
@Composable
private fun StudentInfoScreenPreview (){
    StudentInfoScreen()
}