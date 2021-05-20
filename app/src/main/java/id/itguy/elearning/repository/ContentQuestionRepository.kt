package id.itguy.elearning.repository

import androidx.lifecycle.LiveData
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.model.entity.ContentPdf
import id.itguy.elearning.model.entity.ContentQuestion

class ContentQuestionRepository(private val database: ApplicationLocalDatabase) {

    fun findOneById(id: Integer): LiveData<ContentQuestion> {
        return database.contentQuestionDao().findOneById(id)
    }
}