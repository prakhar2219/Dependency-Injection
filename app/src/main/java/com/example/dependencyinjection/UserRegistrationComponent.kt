package com.example.dependencyinjection

import dagger.BindsInstance
import dagger.Component

@Component(modules = [NotificationServiceModule::class, UserRepositoryServiceModule::class])
interface UserRegistrationComponent {
//    fun getUserRegistrationService(): UserRegistrationService
//    fun getEmailService(): EmailService

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
    }
    }

}