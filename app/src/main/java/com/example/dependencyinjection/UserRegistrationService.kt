package com.example.dependencyinjection;

import javax.inject.Inject

public class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                                      private val notificationService: NotificationService){
    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        notificationService.send(email,"welcomeprakhar@gmail.com","User Registered")
    }
}
