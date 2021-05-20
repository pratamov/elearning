package id.itguy.elearning.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.model.entity.Course
import id.itguy.elearning.repository.CourseRepository

class MyCoursesViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: CourseRepository =
        CourseRepository(ApplicationLocalDatabase.getDatabase(application))
    private val courses: LiveData<List<Course>> = repository.findAllPurchased()


}