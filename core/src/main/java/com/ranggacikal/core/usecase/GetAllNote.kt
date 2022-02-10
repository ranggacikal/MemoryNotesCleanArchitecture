package com.ranggacikal.core.usecase

import com.ranggacikal.core.repository.NoteRepository

class GetAllNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke() = noteRepository.getAllNotes()
}