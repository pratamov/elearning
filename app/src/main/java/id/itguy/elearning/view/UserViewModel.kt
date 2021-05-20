package id.itguy.elearning.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.model.User
import id.itguy.elearning.model.entity.UserMetadata
import id.itguy.elearning.repository.UserMetadataRepository

class UserViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: UserMetadataRepository =
        UserMetadataRepository(ApplicationLocalDatabase.getDatabase(application))
    private val userMetadata: LiveData<List<UserMetadata>> = repository.findAll()

    fun loginUsernamePassword(username: String, password: String): String {
        // GET /login
        var user = User(username, username + "@gmail.com", "")

        Thread {
            repository.insert(UserMetadata("USERNAME", user.username))
            repository.insert(UserMetadata("EMAIL", user.email))
            repository.insert(UserMetadata("LOGGEDIN", "TRUE"))
        }.start()
        return "OK"
    }

    fun loginEmailPassword(email: String, password: String): String {
        // GET /login
        var user = User(email, email, "")
        Thread {
            repository.insert(UserMetadata("USERNAME", user.username))
            repository.insert(UserMetadata("EMAIL", user.email))
            repository.insert(UserMetadata("LOGGEDIN", "TRUE"))
        }.start()
        return "OK"
    }

    fun logout() {
        Thread {
            var statusMetadata = UserMetadata("LOGGEDIN", "FALSE")
            repository.insert(statusMetadata)
        }.start()
    }

    fun getUsername(): LiveData<UserMetadata> {
        return repository.findOneByKey("USERNAME")
    }

}