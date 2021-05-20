package id.itguy.elearning.repository

import androidx.lifecycle.LiveData
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.model.entity.QuestionEssay

class QuestionEssayRepository(private val database: ApplicationLocalDatabase) {

    fun findOneById(id: Integer): LiveData<QuestionEssay> {
        return database.questionEssayDao().findOneById(id)
    }
}