package com.roh.petpeople.data.source

import com.roh.petpeople.data.User
import com.roh.petpeople.data.source.remote.LoginRemoteDataSource
import io.reactivex.Completable

class LoginRepositoryImpl(private val loginRemoteDataSource: LoginRemoteDataSource) :
    LoginRepository {
    override fun kakaoLogin(): Session = loginRemoteDataSource.kakaoLogin()
    override fun insertUser(user: User): Completable = loginRemoteDataSource.insertUser(user)
    override fun updateFCM(): Completable = loginRemoteDataSource.updateFCM()
}