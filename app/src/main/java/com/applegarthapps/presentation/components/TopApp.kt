package com.applegarthapps.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Note
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.applegarthapps.R

@Composable
fun TopApp() {

    TopAppBar(
        modifier = Modifier
            .background(MaterialTheme.colors.secondary)
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            fontSize = 24.sp,
            modifier = Modifier
                .padding(start = 6.dp)
                .weight(0.3f)
                .background(color = Color.Transparent)
        )

    }

}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Top App Bar"
)
@Composable
fun TopAppPreview() {
    TopApp()
}