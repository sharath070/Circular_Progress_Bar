package com.sharath070.foody.repository

import com.sharath070.foody.data.network.RemoteDataSource
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Repository @Inject constructor( remoteDataSource: RemoteDataSource) {

    val remote = remoteDataSource

}