package id.itguy.elearning.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.itguy.elearning.model.entity.ContentPdf
import id.itguy.elearning.model.entity.ContentQuestion

@Dao
interface ContentQuestionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(contentQuestion: ContentQuestion)

    @Query("SELECT * FROM content_question_table WHERE id = :id LIMIT 1")
    fun findOneById(id: Integer): LiveData<ContentQuestion>
}