package id.itguy.elearning.repository

import androidx.lifecycle.LiveData
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.model.entity.Syllabus

class SyllabusRepository(private val database: ApplicationLocalDatabase) {

    fun insert(syllabus: Syllabus) {
        database.syllabusDao().insert(syllabus)
    }

    fun findByCourseId(course_id: Integer): LiveData<List<Syllabus>> {
        return database.syllabusDao().findByCourseId(course_id)
    }

}