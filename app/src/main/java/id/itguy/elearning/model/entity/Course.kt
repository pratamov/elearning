package id.itguy.elearning.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "course_table")
data class Course(
    @PrimaryKey(autoGenerate = false)
    val id: Integer,
    val name: String,
    val description: String,
    val language: String,
    val price: Double,
    val created: LocalDateTime,
    val purchased: LocalDateTime
)