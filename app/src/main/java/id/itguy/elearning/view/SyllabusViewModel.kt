package id.itguy.elearning.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.model.entity.Syllabus
import id.itguy.elearning.repository.CourseRepository
import id.itguy.elearning.repository.SyllabusRepository

class SyllabusViewModel(application: Application, course_id: Integer) :
    AndroidViewModel(application) {

    private val courseRepository: CourseRepository =
        CourseRepository(ApplicationLocalDatabase.getDatabase(application))

    private val syllabusRepository: SyllabusRepository =
        SyllabusRepository(ApplicationLocalDatabase.getDatabase(application))

    private val syllabus: LiveData<List<Syllabus>> = syllabusRepository.findByCourseId(course_id)

}