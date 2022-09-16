package com.applegarthapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.applegarthapps.data.NoteDataSource
import com.applegarthapps.data.model.local.Note
import com.applegarthapps.presentation.screens.NoteScreen
import com.applegarthapps.presentation.ui.theme.TheNoteBookTheme
import com.applegarthapps.presentation.ui.theme.newBackgroundColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheNoteBookTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.newBackgroundColor
                ) {
                    val notes = remember { mutableStateListOf<Note>() }
                    NoteScreen(
                        notes = notes,
                        onAddNote = {
                            notes.add(it)
                        },
                        onRemoveNote = {
                            notes.remove(it)
                        },
                    )
                }
            }
        }
    }
}


