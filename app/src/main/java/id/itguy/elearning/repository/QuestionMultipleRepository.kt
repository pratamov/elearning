package id.itguy.elearning.repository

import androidx.lifecycle.LiveData
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.model.entity.Course
import id.itguy.elearning.model.entity.QuestionMultiple

class QuestionMultipleRepository(private val database: ApplicationLocalDatabase) {

    fun findOneById(id: Integer): LiveData<QuestionMultiple> {
        return database.questionMultipleDao().findOneById(id)
    }
}