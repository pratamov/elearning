package id.itguy.elearning.repository

import androidx.lifecycle.LiveData
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.model.entity.UserMetadata

class UserMetadataRepository(
    private val database: ApplicationLocalDatabase
) {

    fun insert(userMetadata: UserMetadata) {
        database.userMetadataDao().insert(userMetadata)
    }

    fun findOneByKey(key: String): LiveData<UserMetadata> {
        return database.userMetadataDao().findOneByKey(key)
    }

    fun findAll(): LiveData<List<UserMetadata>> {
        return database.userMetadataDao().findAll()
    }

}