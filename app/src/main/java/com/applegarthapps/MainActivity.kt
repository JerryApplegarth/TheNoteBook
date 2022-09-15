package com.applegarthapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
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
                    NoteScreen(notes = emptyList(),
                        onAddNote = {},
                        onRemoveNote = {},)
                }
            }
        }
    }
}


