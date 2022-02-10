package com.ranggacikal.memorynotes.framework

import com.ranggacikal.core.usecase.AddNote
import com.ranggacikal.core.usecase.GetAllNote
import com.ranggacikal.core.usecase.GetNote
import com.ranggacikal.core.usecase.RemoveNote

data class UseCases(
    val addNote: AddNote,
    val getAllNote: GetAllNote,
    val getNote: GetNote,
    val removeNote: RemoveNote
)