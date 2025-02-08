package com.example.jetnote.data

import com.example.jetnote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "Teste", description = "Teste"),
            Note(title = "Teste", description = "Teste"),
            Note(title = "Teste", description = "Teste"),
            Note(title = "Teste", description = "Teste"),
            Note(title = "Teste", description = "Teste"),
            Note(title = "Teste", description = "Teste"),
            Note(title = "Teste", description = "Teste"),
            Note(title = "Teste", description = "Teste"),
            Note(title = "Teste", description = "Teste")


        )
    }
}