package br.dev.celso.rickandmorty.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.PersonalVideo
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    var navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    var currentRoute = navBackStackEntry?.destination?.route ?: ""

    var isBottomBarVisible = when (currentRoute) {
        "character_details" -> false
        else -> true
    }

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
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            if (!isBottomBarVisible) {
                                IconButton(
                                    onClick = {
                                        navController.navigate("characters")
                                    }
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.ArrowBackIosNew,
                                        contentDescription = "",
                                        tint = Color.Cyan
                                    )
                                }
                            }
                            Text(
                                text = title.value,
                                color = Color(0xFF42EE44)
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color(0xFF2B2B2B)
                    )
                )
            },
            bottomBar = {
                if (isBottomBarVisible && isBottomBarVisible != null) {
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
            }
        ) {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                NavHost(
                    navController = navController,
                    startDestination = "characters"
                ) {
                    composable(
                        route = "characters"
                    ) {
                        CharactersScreen(navController)
                    }
                    composable(
                        route = "episodes"
                    ) {
                        EpisodesScreen()
                    }
                    composable(
                        route = "locations"
                    ) {
                        LocationsScreen()
                    }
                    composable(
                        route = "character_details"
                    ) {
                        DetailsCharacterScreen()
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