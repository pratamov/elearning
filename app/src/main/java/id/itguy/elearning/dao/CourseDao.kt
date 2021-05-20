package id.itguy.elearning.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.itguy.elearning.model.entity.Course

@Dao
interface CourseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(course: Course)

    @Query("SELECT * FROM course_table WHERE id = :id LIMIT 1")
    fun findOneById(id: Integer): LiveData<Course>

    @Query("SELECT * FROM course_table ORDER BY created ASC")
    fun findAll(): LiveData<List<Course>>

    @Query("SELECT * FROM course_table WHERE purchased IS NOT NULL")
    fun findAllPurchased(): LiveData<List<Course>>

    @Query("SELECT * FROM course_table WHERE purchased IS NULL")
    fun findAllNotPurchased(): LiveData<List<Course>>

}