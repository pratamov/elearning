package id.itguy.elearning.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "content_pdf_table")
data class ContentPdf(
    @PrimaryKey(autoGenerate = false)
    val id: Integer,
    val content_pdf_file: String
)