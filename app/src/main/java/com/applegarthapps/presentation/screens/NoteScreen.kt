package com.applegarthapps.presentation.screens

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.applegarthapps.R
import com.applegarthapps.data.NoteDataSource
import com.applegarthapps.data.model.local.Note
import com.applegarthapps.presentation.components.NoteButton
import com.applegarthapps.presentation.components.NoteInputText
import com.applegarthapps.presentation.components.NoteRow
import com.applegarthapps.presentation.ui.theme.TheNoteBookTheme
import com.applegarthapps.presentation.ui.theme.cardBackground
import com.applegarthapps.presentation.ui.theme.newBackgroundColor

@Composable
fun NoteScreen(
    notes: List<Note>,
    onAddNote: (Note) -> Unit,
    onRemoveNote: (Note) -> Unit,
//    onEditNote: (Note) -> Unit


) {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    val context = LocalContext.current
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
                onClick = {
                    if (title.isNotEmpty() && description.isNotEmpty()) {
                        onAddNote(Note(
                            title = title,
                            description = description
                        ))
                        Toast.makeText(context, "Your Note has been added", Toast.LENGTH_SHORT).show()
                        title = ""
                        description = ""

                    }
                })
            Spacer(modifier = Modifier.height(16.dp))
            Divider(
                modifier = Modifier
                    .fillMaxWidth(),

                color = MaterialTheme.colors.primary,
                thickness = 2.dp
            )
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
            ) {
                items(notes) { note ->
                    NoteRow(note = note, onNoteClick = {
                        onRemoveNote(note)
                    })


                }


            }
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
            NoteScreen(
                notes = NoteDataSource().loadNotes(),
                onAddNote = {},
                onRemoveNote = {},

                )
        }
    }
}