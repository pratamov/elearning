package id.itguy.elearning.repository

import androidx.lifecycle.LiveData
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.model.entity.Challenge

class ChallengeRepository(private val database: ApplicationLocalDatabase) {

    fun findOneById(id: Integer): LiveData<Challenge> {
        return database.challengeDao().findOneById(id)
    }

    fun findAll(): LiveData<List<Challenge>> {
        return database.challengeDao().findAll()
    }
}