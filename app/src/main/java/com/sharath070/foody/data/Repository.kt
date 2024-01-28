package com.sharath070.foody.repository

import com.sharath070.foody.data.network.LocalDataSource
import com.sharath070.foody.data.network.RemoteDataSource
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource,
    localDataSource: LocalDataSource
) {

    val remote = remoteDataSource

    val local = localDataSource

}