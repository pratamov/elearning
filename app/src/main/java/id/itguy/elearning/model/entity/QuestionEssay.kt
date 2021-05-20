package id.itguy.elearning.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "essay_question_table")
data class QuestionEssay(
    @PrimaryKey(autoGenerate = false)
    val id: Integer,
    val content_question_id: Integer,
    val question: String,
    val last_answer_image_file: String,
    val correct_answer: Integer,
    val explanation_pdf_file: String
)