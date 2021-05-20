package id.itguy.elearning.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "content_question_table")
data class ContentQuestion(
    @PrimaryKey(autoGenerate = false)
    val id: Integer,
    val description: String
)