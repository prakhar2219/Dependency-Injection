package com.example.dependencyinjection

import dagger.Component

@Component(modules = [NotificationServiceModule::class, UserRepositoryServiceModule::class])
interface UserRegistrationComponent {
//    fun getUserRegistrationService(): UserRegistrationService
//    fun getEmailService(): EmailService

    fun Inject(mainActivity: MainActivity)

}