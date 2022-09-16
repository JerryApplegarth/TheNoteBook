package com.applegarthapps.data

import com.applegarthapps.data.model.local.Note

class NoteDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "My First Note", description = "This is my first note."),
            Note(title = "My Second Note", description = "This is my second nte."),
            Note(title = "My Third Note", description = "This is my third note."),
            Note(title = "My First Note", description = "This is my first note."),
            Note(title = "My Second Note", description = "This is my second nte."),
            Note(title = "My Third Note", description = "This is my third note."),
            Note(title = "My First Note", description = "This is my first note."),
            Note(title = "My Second Note", description = "This is my second nte."),
            Note(title = "My Third Note", description = "This is my third note."),
        )
    }
}