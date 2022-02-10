package com.ranggacikal.memorynotes.framework

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ranggacikal.core.data.Note
import com.ranggacikal.core.repository.NoteRepository
import com.ranggacikal.core.usecase.AddNote
import com.ranggacikal.core.usecase.GetAllNote
import com.ranggacikal.core.usecase.GetNote
import com.ranggacikal.core.usecase.RemoveNote
import com.ranggacikal.memorynotes.framework.di.ApplicationModule
import com.ranggacikal.memorynotes.framework.di.DaggerViewModelComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class ListViewModel(application: Application) : AndroidViewModel(application) {

    private val coroutineScope = CoroutineScope(Dispatchers.IO)

    @Inject
    lateinit var useCases: UseCases

    init {
        DaggerViewModelComponent.builder()
            .applicationModule(ApplicationModule((getApplication())))
            .build()
            .inject(this)
    }

    val notes = MutableLiveData<List<Note>>()

    fun getNotes(){
        coroutineScope.launch {
            val noteList = useCases.getAllNote()
            notes.postValue(noteList)
        }
    }

}