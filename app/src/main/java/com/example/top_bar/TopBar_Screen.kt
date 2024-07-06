package com.example.top_bar

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar_Screen() {

    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold (
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                scrollBehavior = scrollBehavior,
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = " Menu"
                        )
                    }
                },
                title = {
                    Text(text = "Home")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(3.dp)
                )
            )
        },
        content = {
            CustomList(paddingValues = it)
            
        }
    )

}

@Preview(showBackground = true)
@Composable
fun TopBar_ScreenPreview(modifier: Modifier = Modifier) {
    TopBar_Screen()
}

@Composable
fun CustomList(paddingValues: PaddingValues) {

    val number = remember { mutableStateListOf(11,22,34,45,65,61,74,1,2,3,4,5,6,7,8,9) }

    LazyColumn(modifier = Modifier.padding(top = paddingValues.calculateTopPadding())) {
        items(items = number, key = {it.hashCode()}){
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 24.dp),
                text ="$it",
                style = TextStyle(
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = FontWeight.Medium
                )
            )

        }
    }
}