package com.ranggacikal.memorynotes.framework.di

import com.ranggacikal.memorynotes.framework.ListViewModel
import com.ranggacikal.memorynotes.framework.NoteViewModel
import dagger.Component

@Component(modules = [ApplicationModule::class, RepositoryModule::class, UseCasesModule::class])
interface ViewModelComponent {
    fun inject(noteViewModel: NoteViewModel)
    fun inject(listViewModel: ListViewModel)
}