package id.itguy.elearning.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.itguy.elearning.model.entity.Syllabus

@Dao
interface SyllabusDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(syllabus: Syllabus)

    @Query("SELECT * FROM user_metadata_table WHERE course_id = :course_id ORDER BY order_index ASC")
    fun findByCourseId(course_id: Integer): LiveData<List<Syllabus>>

}