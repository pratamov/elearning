package id.itguy.elearning.model

data class LoginModel(
    var username: String,
    var password: String,
    var message: String,
    var colorMessage: String,
    var showMessage: Boolean,
    var showLoading: Boolean,
    var loggedIn: Boolean
)