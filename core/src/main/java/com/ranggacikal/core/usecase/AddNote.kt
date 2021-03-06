package com.ranggacikal.core.usecase

import com.ranggacikal.core.data.Note
import com.ranggacikal.core.repository.NoteRepository

class AddNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.addNote(note)
}