package br.dev.celso.rickandmorty.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.PersonalVideo
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    var navController = rememberNavController()

    var title = remember {
        mutableStateOf("Personagens")
    }

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0xFF2B2B2B)
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = title.value,
                            color = Color(0xFF42EE44)
                        )
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color(0xFF2B2B2B)
                    )
                )
            },
            bottomBar = {
                NavigationBar(
                    containerColor = Color(0xFF2b2b2b)
                ) {
                    NavigationBarItem(
                        onClick = {
                            navController.navigate("characters")
                            title.value = "Personagens"
                        },
                        selected = false,
                        icon = {
                            Icon(
                                imageVector = Icons.Default.People,
                                contentDescription = "",
                                tint = Color(0xFF42EE44),
                                modifier = Modifier
                                    .size(32.dp)
                            )
                        },
                        label = {
                            Text(
                                text = "Personagens",
                                color = Color(0xFF42EE44)
                            )
                        }
                    )
                    NavigationBarItem(
                        onClick = {
                            navController.navigate("locations")
                            title.value = "Locações"
                        },
                        selected = false,
                        icon = {
                            Icon(
                                imageVector = Icons.Default.LocationOn,
                                contentDescription = "",
                                tint = Color(0xFF42EE44),
                                modifier = Modifier
                                    .size(32.dp)
                            )
                        },
                        label = {
                            Text(
                                text = "Locações",
                                color = Color(0xFF42EE44)
                            )
                        }
                    )
                    NavigationBarItem(
                        onClick = {
                            navController.navigate("episodes")
                            title.value = "Episódios"
                        },
                        selected = false,
                        icon = {
                            Icon(
                                imageVector = Icons.Default.PersonalVideo,
                                contentDescription = "",
                                tint = Color(0xFF42EE44),
                                modifier = Modifier
                                    .size(32.dp)
                            )
                        },
                        label = {
                            Text(
                                text = "Episódios",
                                color = Color(0xFF42EE44)
                            )
                        }
                    )
                }
            }
        ) {
            Surface(
                modifier = Modifier.fillMaxSize().padding(it)
            ) {
                NavHost(
                    navController = navController,
                    startDestination = "characters"
                ){
                    composable(
                        route = "characters"
                    ){
                        CharactersScreen()
                    }
                    composable(
                        route = "episodes"
                    ){
                        EpisodesScreen()
                    }
                    composable(
                        route = "locations"
                    ){
                        LocationsScreen()
                    }
                }
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    MainScreen()
}