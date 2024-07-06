package com.example.topAppBar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.top_bar.CustomList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarScreen(modifier: Modifier = Modifier) {

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Box(modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ){
                    Text(text = "Top App Bar",
                        fontWeight = FontWeight.Bold,

                    )
                }

            },
                modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp)),

                navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription ="Menu"
                    )
                }
            },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription ="Favorite",
                            tint = Color.Red
                        )
                    }

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription ="Search",
                            tint = Color.Blue

                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFF1C077)
                )
            )
        }
    ) {it
//        CustomList(paddingValues = it)

    }

}

@Preview(showBackground = true)
@Composable
fun TopAppBarScreenPreview(modifier: Modifier = Modifier) {
    TopAppBarScreen()
}