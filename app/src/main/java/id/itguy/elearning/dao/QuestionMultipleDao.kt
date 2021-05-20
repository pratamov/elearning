package id.itguy.elearning.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.itguy.elearning.model.entity.QuestionMultiple

@Dao
interface QuestionMultipleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(questionMultiple: QuestionMultiple)

    @Query("SELECT * FROM multiple_question_table WHERE id = :id LIMIT 1")
    fun findOneById(id: Integer): LiveData<QuestionMultiple>
}