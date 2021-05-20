package id.itguy.elearning.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "syllabus_table")
data class Syllabus(
    @PrimaryKey(autoGenerate = false)
    val id: Integer,
    val course_id: Integer,
    val content_id: Integer,
    val content_type: String,
    val group: String,
    val title: String,
    val description: String,
    val order_index: Integer
)