package id.itguy.elearning.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_metadata_table")
data class UserMetadata(
    @PrimaryKey
    val key: String,
    val value: String
)