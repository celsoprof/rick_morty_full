package br.dev.celso.rickandmorty.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DoubleArrow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.celso.rickandmorty.R

@Composable
fun DetailsCharacterScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.DarkGray
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically
//            ){
//                Icon(
//                    imageVector = Icons.Default.DoubleArrow,
//                    contentDescription = "",
//                    tint = Color(0xFF42EE44)
//                )
//                Spacer(modifier = Modifier.width(8.dp))
//                Text(
//                    text = "Character details",
//                    color = Color.White,
//                    fontSize = 24.sp
//                )
//            }
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color(0xff4E8E45)
                    ),
                border = BorderStroke(
                    width = 1.dp,
                    color = Color.Cyan
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .size(200.dp),
                        shape = CircleShape
                    ) {
                        Image(
                            painter = painterResource(R.drawable.rick),
                            contentDescription = "",
                            contentScale = ContentScale.Crop
                        )
                    }
                    Card(
                        modifier = Modifier
                            .height(28.dp)
                            .width(56.dp)
                            .offset(y = -10.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color.White
                            )
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Alive",
                            )
                        }
                    }
                }
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Rick Sanchez",
                        fontSize = 24.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 0.dp)
                    )
                    HorizontalDivider(
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                            .width(200.dp)
                    )
                    Row(
                        modifier = Modifier
                            .padding(
                                top = 16.dp,
                                start = 16.dp,
                                end = 16.dp
                            )
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Born in",
                            fontWeight = FontWeight.Bold,
                            color = Color.Cyan
                        )
                        Text(
                            text = "Earth (C-137)",
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 16.dp, vertical = 2.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Species",
                            fontWeight = FontWeight.Bold,
                            color = Color.Cyan,
                        )
                        Text(
                            text = "Human",
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White,
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 16.dp, vertical = 2.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Gender",
                            fontWeight = FontWeight.Bold,
                            color = Color.Cyan,
                        )
                        Text(
                            text = "Male",
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White,
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 16.dp, vertical = 2.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Living in",
                            fontWeight = FontWeight.Bold,
                            color = Color.Cyan,
                        )
                        Text(
                            text = "Citadel of Ricks",
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White,
                        )
                    }
                }
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
private fun DetailsCharacterScreenPreview() {
    DetailsCharacterScreen()
}