package uz.gita.minichat.presentation.fragment.registr

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.minichat.R
import uz.gita.minichat.databinding.FragmentRegistrBinding
import uz.gita.minichat.presentation.fragment.registr.viewmodel.RegistrViewModel
import javax.inject.Inject

@AndroidEntryPoint
class RegistrFragment : Fragment(R.layout.fragment_registr) {

    @Inject
    lateinit var viewModel: RegistrViewModel

    private val binding by viewBinding(FragmentRegistrBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val auth = Firebase.auth

        binding.apply {

            sign.setOnClickListener {

                val number = email.text.toString().trim()
                val password = password.text.toString().trim()


            }

        }

    }

}