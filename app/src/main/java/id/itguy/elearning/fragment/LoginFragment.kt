package id.itguy.elearning.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import id.itguy.elearning.R
import id.itguy.elearning.view.UserViewModel


class LoginFragment : Fragment() {

    private lateinit var userViewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        val loginButton = view.findViewById<Button>(R.id.loginButton)
        val usernameInput = view.findViewById<EditText>(R.id.usernameInput)
        val passwordInput = view.findViewById<EditText>(R.id.passwordInput)

        loginButton.setOnClickListener {
            val message = userViewModel.loginUsernamePassword(
                usernameInput.text.toString(),
                passwordInput.text.toString()
            )

            if (message == "OK") {
                Toast.makeText(requireContext(), "Logged IN", Toast.LENGTH_LONG)
                Navigation.findNavController(view).navigate(R.id.homeFragment)
            } else {
                Toast.makeText(requireContext(), message, Toast.LENGTH_LONG)
            }

        }

        return view
    }

}