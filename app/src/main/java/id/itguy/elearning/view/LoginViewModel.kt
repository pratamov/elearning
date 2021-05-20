package id.itguy.elearning.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import id.itguy.elearning.database.ApplicationLocalDatabase
import id.itguy.elearning.model.LoginModel
import id.itguy.elearning.model.User
import id.itguy.elearning.model.entity.UserMetadata
import id.itguy.elearning.repository.UserMetadataRepository

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: UserMetadataRepository =
        UserMetadataRepository(ApplicationLocalDatabase.getDatabase(application))

    var loginModel: LoginModel = LoginModel("", "", "", "", false, false, false)
    var loginModelLiveData: MutableLiveData<LoginModel> = MutableLiveData(loginModel)


    fun loginUsernamePassword() {
        loginModel = loginModelLiveData.value!!

        var username = loginModel.username
        var password = loginModel.password

        loginModel.showLoading = true
        loginModelLiveData.postValue(loginModel)

        Thread {
            // GET /login
            var user = User(username, username + "@gmail.com", "")

            repository.insert(UserMetadata("USERNAME", user.username))
            repository.insert(UserMetadata("EMAIL", user.email))
            repository.insert(UserMetadata("LOGGEDIN", "TRUE"))
            repository.insert(UserMetadata("TOKEN", "a07f6dcb-39f5-4b66-bcb5-4b399ad4e5e4"))

            loginModel.showLoading = false
            loginModel.loggedIn = true
            loginModelLiveData.postValue(loginModel)

        }.start()
    }

}