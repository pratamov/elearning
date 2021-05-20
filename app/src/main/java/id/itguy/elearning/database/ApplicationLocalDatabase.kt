package id.itguy.elearning.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import id.itguy.elearning.dao.*
import id.itguy.elearning.model.entity.*

@Database(
    entities = [Challenge::class, ContentPdf::class, ContentQuestion::class, Course::class, QuestionEssay::class, QuestionMultiple::class, Syllabus::class, UserMetadata::class],
    version = 1,
    exportSchema = false
)
abstract class ApplicationLocalDatabase : RoomDatabase() {

    abstract fun challengeDao(): ChallengeDao
    abstract fun contentPdfDao(): ContentPdfDao
    abstract fun contentQuestionDao(): ContentQuestionDao
    abstract fun courseDao(): CourseDao
    abstract fun questionEssayDao(): QuestionEssayDao
    abstract fun questionMultipleDao(): QuestionMultipleDao
    abstract fun syllabusDao(): SyllabusDao
    abstract fun userMetadataDao(): UserMetadataDao

    companion object {

        private var instance: ApplicationLocalDatabase? = null

        fun getDatabase(context: Context): ApplicationLocalDatabase {

            if (instance != null) {
                return instance!!
            }

            synchronized(this) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    ApplicationLocalDatabase::class.java,
                    "default_database"
                ).build()
                return instance!!
            }

        }
    }

}