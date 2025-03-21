package br.dev.celso.rickandmorty.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Details
import androidx.compose.material.icons.filled.DoubleArrow
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.List
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.celso.rickandmorty.R
import br.dev.celso.rickandmorty.screens.components.EpisodeCard

@SuppressLint("Range")
@Composable
fun DetailsCharacterScreen(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff4E8E45))
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(
                bottomEnd = 0.dp,
                bottomStart = 0.dp
            ),
            colors = CardDefaults
                .cardColors(
                    containerColor = Color.DarkGray
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .padding(
                            top = 8.dp,
                            bottom = 16.dp
                        )
                        .width(123.dp)
                        .height(130.dp)
                ) {
                    Card(
                        modifier = Modifier
                            .size(123.dp),
                        shape = CircleShape,
                        border = BorderStroke(
                            width = 4.dp,
                            color = Color.Cyan
                        )
                    ) {
                        Image(
                            painter = painterResource(R.drawable.rick),
                            contentDescription = ""
                        )
                    }
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .fillMaxWidth()
                            .align(
                                alignment = Alignment.BottomCenter
                            ),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0xff4E8E45)
                            )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Alive",
                                fontSize = 12.sp,
                                color = Color.White,
                                modifier = Modifier
                                    .padding(2.dp)
                            )
                        }
                    }
                }
                Text(
                    text = "Rick Sanchez",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )
            }
        }
        @Composable
        fun Modifier.paralax(scrollState: ScrollState, rate: Int) =
            layout { measurable, constraints ->
                val placeable = measurable.measure(constraints)
                val height = if (rate > 0) scrollState.value / rate else scrollState.value
                layout(placeable.width, placeable.height){
                    placeable.place(0, height)
                }
            }

        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(scrollState)
        ) {
            Card(
                modifier = Modifier
                    .padding(horizontal = 0.dp)
                    .fillMaxWidth()
                    .paralax(scrollState, 2),
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color.DarkGray
                    ),
                shape = RectangleShape
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier

                    ) {
                        Icon(
                            imageVector = Icons.Default.DoubleArrow,
                            contentDescription = "",
                            tint = Color.Green,
                            modifier = Modifier
                                .padding(end = 8.dp)
                        )
                        Text(
                            text = "Character details",
                            fontSize = 18.sp,
                            color = Color.White
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Born in",
                            fontSize = 14.sp,
                            color = Color.Cyan
                        )
                        Text(
                            text = "Earth (C-137)",
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    }
                    HorizontalDivider(modifier = Modifier.padding(top = 4.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Gender",
                            fontSize = 14.sp,
                            color = Color.Cyan
                        )
                        Text(
                            text = "Male",
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    }
                    HorizontalDivider(modifier = Modifier.padding(top = 4.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Living in",
                            fontSize = 14.sp,
                            color = Color.Cyan
                        )
                        Text(
                            text = "Citadel of Ricks",
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    }
                    HorizontalDivider(modifier = Modifier.padding(top = 4.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Species",
                            fontSize = 14.sp,
                            color = Color.Cyan
                        )
                        Text(
                            text = "Human",
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                ,colors = CardDefaults
                    .cardColors(
                        containerColor = Color.DarkGray
                    ),
                shape = RectangleShape
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    Row {
                        Icon(
                            imageVector = Icons.Default.List,
                            contentDescription = "",
                            tint = Color.Green,
                            modifier = Modifier
                                .padding(end = 8.dp)
                        )
                        Text(
                            text = "Episodes List",
                            fontSize = 18.sp,
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    LazyColumn {
                        items(15){
                            EpisodeCard()
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun DetailsCharacterScreenPreview() {
    DetailsCharacterScreen(

    )
}