package id.itguy.elearning.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "challenge_table")
data class Challenge(
    @PrimaryKey(autoGenerate = false)
    val id: Integer,
    val content_question_id: Integer,
    val provider_course_id: Integer,
    val title: String,
    val description: String,
    val price: Double,
    val created: LocalDateTime,
    val purchased: LocalDateTime
)