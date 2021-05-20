package id.itguy.elearning.repository

import androidx.lifecycle.LiveData
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.model.entity.ContentPdf

class ContentPdfRepository(private val database: ApplicationLocalDatabase) {

    fun findOneById(id: Integer): LiveData<ContentPdf> {
        return database.contentPdfDao().findOneById(id)
    }

}