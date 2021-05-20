package id.itguy.elearning.repository

import androidx.lifecycle.LiveData
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.model.entity.Course

class CourseRepository(private val database: ApplicationLocalDatabase) {

    fun findOneById(id: Integer): LiveData<Course> {
        return database.courseDao().findOneById(id)
    }

    fun findAllPurchased(): LiveData<List<Course>> {
        return database.courseDao().findAllPurchased()
    }

    fun findAllNotPurchased(): LiveData<List<Course>> {
        return database.courseDao().findAllNotPurchased()
    }
    
}