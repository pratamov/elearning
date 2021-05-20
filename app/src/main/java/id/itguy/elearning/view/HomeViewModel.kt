package id.itguy.elearning.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.repository.ChallengeRepository
import id.itguy.elearning.repository.CourseRepository
import id.itguy.elearning.repository.UserMetadataRepository

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private val courseRepository: CourseRepository =
        CourseRepository(ApplicationLocalDatabase.getDatabase(application))

    private val challengeRepository: ChallengeRepository =
        ChallengeRepository(ApplicationLocalDatabase.getDatabase(application))

    private val userMetadataRepository: UserMetadataRepository =
        UserMetadataRepository(ApplicationLocalDatabase.getDatabase(application))

    fun refresh() {

    }

}