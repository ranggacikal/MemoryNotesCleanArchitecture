package com.ranggacikal.memorynotes.framework.di

import android.app.Application
import com.ranggacikal.core.repository.NoteRepository
import com.ranggacikal.memorynotes.framework.RoomNoteDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {
    @Provides
    fun provideRepository(app: Application) = NoteRepository(RoomNoteDataSource(app))
}