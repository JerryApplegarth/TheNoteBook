package com.applegarthapps.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.applegarthapps.R
import com.applegarthapps.presentation.components.NoteButton
import com.applegarthapps.presentation.components.NoteInputText
import com.applegarthapps.presentation.ui.theme.TheNoteBookTheme
import com.applegarthapps.presentation.ui.theme.newBackgroundColor

@Composable
fun NoteScreen() {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .padding(0.dp)
    ) {
        TopAppBar(
            title = {
                Text(text = stringResource(id = R.string.app_name))
            },
            actions = {

            },
            backgroundColor = MaterialTheme.colors.primary

        )
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(6.dp))
            NoteInputText(
                text = title,
                label = "Title",
                onTextChange = { title = it },


                )
            NoteInputText(
                text = description,
                label = "Add Your Note",
                onTextChange = { description = it },

                )

            Spacer(modifier = Modifier.height(16.dp))
            NoteButton(
                text = "Save Note",
                onClick = { /*TODO*/ })
            Spacer(modifier = Modifier.height(16.dp))
            Divider(
                modifier = Modifier
                    .fillMaxWidth(),

                color = MaterialTheme.colors.primary,
                thickness = 2.dp
            )


        }

    }


}

@Preview(
    showSystemUi = true,
    showBackground = true,
    name = "Note Screen"
)
@Composable
fun NoteScreenPreview() {
    TheNoteBookTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.newBackgroundColor
        ) {
            NoteScreen()
        }
    }
}