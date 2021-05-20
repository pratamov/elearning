package id.itguy.elearning.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.itguy.elearning.model.entity.QuestionEssay

@Dao
interface QuestionEssayDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(questionEssay: QuestionEssay)

    @Query("SELECT * FROM essay_question_table WHERE id = :id LIMIT 1")
    fun findOneById(id: Integer): LiveData<QuestionEssay>
}