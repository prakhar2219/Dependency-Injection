package com.example.dependencyinjection;

import javax.inject.Inject
import javax.inject.Named

public class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                                     @Named("message") private val notificationService: NotificationService){
//    specifying ki hmko notification service me se kis type kaa object bna ke do
    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        notificationService.send(email,"welcomeprakhar@gmail.com","User Registered")
    }
}
