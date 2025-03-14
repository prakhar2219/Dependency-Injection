package com.example.dependencyinjection;

import javax.inject.Inject

public class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                                      private val emailService: EmailService){
    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.send(email,"welcomeprakhar@gmail.com","User Registered")
    }
}
