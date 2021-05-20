package id.itguy.elearning.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.model.entity.Course
import id.itguy.elearning.repository.CourseRepository

class CoursesViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: CourseRepository =
        CourseRepository(ApplicationLocalDatabase.getDatabase(application))
    private val courses: LiveData<List<Course>> = repository.findAllNotPurchased()

    fun selectCourse(courseId : Integer) {
        var course = repository.findOneById(courseId)
    }

}