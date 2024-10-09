package com.example.greenlife.app.screens.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenlife.ui.theme.FieldGrey
import com.example.greenlife.ui.theme.Green
import com.example.greenlife.ui.theme.HintGrey

@Composable
fun CategoryItem(categoryName: String, isSelected: Boolean, onCategorySelected: () -> Unit) {
    Surface(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 4.dp)
            .clickable { onCategorySelected() },
        color = if (isSelected) Green else FieldGrey,
        shape = RoundedCornerShape(13.dp),
    ) {
        Box(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = categoryName,
                color = if (isSelected) Color.White else HintGrey,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun Categories(categories: List<String>) {
    val scrollState = rememberScrollState()
    var selectedCategory by remember { mutableStateOf(categories[0]) }

    Row(
        modifier = Modifier.fillMaxWidth().padding(10.dp).horizontalScroll(scrollState),
        horizontalArrangement = Arrangement.Center
    ) {
        categories.forEach { category ->
            CategoryItem(
                categoryName = category,
                isSelected = category == selectedCategory,
                onCategorySelected = {
                    selectedCategory = category
                }
            )
        }
    }
}

