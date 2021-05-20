package id.itguy.elearning.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "multiple_question_table")
data class QuestionMultiple(
    @PrimaryKey(autoGenerate = false)
    val id: Integer,
    val content_question_id: Integer,
    val question: String,
    val choice_a: String,
    val choice_b: String,
    val choice_c: String,
    val choice_d: String,
    val choice_e: String,
    val last_answer: Integer,
    val correct_answer: Integer,
    val explanation_resource_file: String
)