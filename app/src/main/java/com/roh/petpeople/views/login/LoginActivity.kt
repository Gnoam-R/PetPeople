package com.roh.petpeople.views.login

import com.roh.petpeople.R
import com.roh.petpeople.base.BaseActivity
import com.roh.petpeople.databinding.ActivityLoginBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : BaseActivity<ActivityLoginBinding> (R.layout.activity_login) {
    private val viewModel: LoginViewModel by viewModel()
    private lateinit var auth: FirebaseAuth
}