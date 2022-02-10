package com.ranggacikal.memorynotes.framework.di

import com.ranggacikal.core.repository.NoteRepository
import com.ranggacikal.core.usecase.AddNote
import com.ranggacikal.core.usecase.GetAllNote
import com.ranggacikal.core.usecase.GetNote
import com.ranggacikal.core.usecase.RemoveNote
import com.ranggacikal.memorynotes.framework.UseCases
import dagger.Module
import dagger.Provides

@Module
class UseCasesModule {
    @Provides
    fun getUseCases(repository: NoteRepository) = UseCases(
        AddNote(repository),
        GetAllNote(repository),
        GetNote(repository),
        RemoveNote(repository)
    )
}