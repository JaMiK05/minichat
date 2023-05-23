package uz.gita.minichat.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.minichat.presentation.fragment.registr.viewmodel.RegistrViewModel
import uz.gita.minichat.presentation.fragment.registr.viewmodel.impl.RegistrViewModelImpl
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface BindModul {

    @[Binds Singleton]
    fun bindRegistrFragmentViewModel(impl: RegistrViewModelImpl): RegistrViewModel

}