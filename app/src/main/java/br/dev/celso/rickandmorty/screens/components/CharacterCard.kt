package br.dev.celso.rickandmorty.screens.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.celso.rickandmorty.R

@Composable
fun CharacterCard(onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color.DarkGray
        ),
        shape = RoundedCornerShape(0.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(110.dp)
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row {
                    Card(
                        shape = CutCornerShape(
                            topEnd = 24.dp,
                            topStart = 24.dp,
                            bottomStart = 24.dp,
                            bottomEnd = 24.dp
                        ),
                        border = BorderStroke(
                            width = 2.dp,
                            color = Color(0xFF42EE44)
                        )
                    ) {
                        Image(
                            painter = painterResource(R.drawable.rick),
                            contentDescription = ""
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 16.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Rick Sanchez",
                            fontSize = 18.sp,
                            color = Color(0xFF42EE44),
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(bottom = 4.dp)
                        )
                        Text(
                            text = "Human",
                            color = Color.Gray
                        )
                    }
                }
                IconButton(
                    onClick = onClick
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForwardIos,
                        contentDescription = "",
                        tint = Color.White
                    )
                }
            }
            HorizontalDivider(
                color = Color.Gray,
                thickness = 0.8.dp
            )
        }
    }
}

@Preview
@Composable
private fun CharacterCardPreview() {
    CharacterCard(onClick = {})
}