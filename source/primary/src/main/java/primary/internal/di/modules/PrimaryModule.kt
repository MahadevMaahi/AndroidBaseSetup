package primary.internal.di.modules

import com.google.gson.GsonBuilder
import com.sai.sample.primary.BuildConfig
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import primary.internal.data.remote.api.PrimaryApi
import primary.internal.data.repo.PrimaryRepositoryImpl
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal interface PrimaryModule {

    @Provides
    @Singleton
    fun providePrimaryApi() = Retrofit.Builder()
        .baseUrl(BuildConfig.PRIMARY_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(PrimaryApi::class.java)

    @Binds
    @Singleton
    fun bindsPrimaryRepositoryImpl(impl: PrimaryRepositoryImpl)
}