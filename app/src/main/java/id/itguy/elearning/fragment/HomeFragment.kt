package id.itguy.elearning.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import id.itguy.elearning.R
import id.itguy.elearning.model.entity.UserMetadata
import id.itguy.elearning.view.UserViewModel

class HomeFragment : Fragment() {

    private lateinit var userViewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        val debugText = view.findViewById<TextView>(R.id.debug)
        val usernameObserver = Observer<UserMetadata> { metadata ->
            debugText.text = metadata.value
        }
        userViewModel.getUsername().observe(viewLifecycleOwner, usernameObserver)

        return view
    }
}