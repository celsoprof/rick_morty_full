package br.dev.celso.rickandmorty.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.celso.rickandmorty.screens.components.CharacterCard

@Composable
fun CharactersScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color.DarkGray)
        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                modifier = Modifier
//                    .padding(top = 0.dp)
//            ) {
//                Icon(
//                    imageVector = Icons.Default.People,
//                    contentDescription = "",
//                    tint = Color.White
//                )
//                Text(
//                    text = "Personagens",
//                    fontSize = 18.sp,
//                    color = Color.White,
//                    modifier = Modifier
//                        .padding(start = 8.dp)
//                )
//            }
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .padding(top = 0.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                trailingIcon = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                },
                label = {
                    Text(
                        text = "Nome do personagem"
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF42EE44),
                    focusedLabelColor = Color(0xFF42EE44)
                )
            )
            LazyColumn(
                modifier = Modifier
                    .padding(top = 16.dp)
            ) {
                items(10){
                    CharacterCard()
                }
            }
        }
    }
}

@Preview
@Composable
private fun CharacterScreenPreview() {
    CharactersScreen()
}