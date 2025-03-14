package com.example.dependencyinjection

import dagger.Component

@Component
interface UserRegistrationComponent {
//    fun getUserRegistrationService(): UserRegistrationService
//    fun getEmailService(): EmailService

    fun Inject(mainActivity: MainActivity)

}