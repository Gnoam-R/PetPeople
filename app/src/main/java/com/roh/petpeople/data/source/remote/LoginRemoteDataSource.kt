package com.roh.petpeople.data.source.remote

import com.kakao.auth.Session
import com.roh.petpeople.data.User
import io.reactivex.Completable

interface LoginRemoteDataSource {
    fun kakaoLogin(): Session
    fun insertUser(user: User): Completable
    fun updateFCM(): Completable
}