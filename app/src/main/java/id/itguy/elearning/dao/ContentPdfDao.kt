package id.itguy.elearning.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.itguy.elearning.model.entity.ContentPdf

@Dao
interface ContentPdfDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(contentPdf: ContentPdf)

    @Query("SELECT * FROM content_pdf_table WHERE id = :id LIMIT 1")
    fun findOneById(id: Integer): LiveData<ContentPdf>

}