package id.itguy.elearning.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.repository.UserMetadataRepository

class RegisterViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: UserMetadataRepository =
        UserMetadataRepository(ApplicationLocalDatabase.getDatabase(application))



}