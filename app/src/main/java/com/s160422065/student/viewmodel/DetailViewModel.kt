package com.s160422065.student.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.s160422065.student.model.Student

class DetailViewModel : ViewModel(){
    val studentLD = MutableLiveData<Student>()

    fun fetch(){
        val student1 = Student("160422041", "Nathan de Gayman", "2003/09/11", "08123456789", "http://dummyimage.com/75x100.jpg/cc0000/ffffff")
        studentLD.value = student1
    }
}