package com.example.dependencyinjection

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    //Field Injection
    @Inject
    lateinit var userRegistrationService: UserRegistrationService
    @Inject
    lateinit var emailService: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Manual Injection
//        val userRepository=UserRepository()
//        val emailService=EmailService()
//        val userRegistrationService=UserRegistrationService(userRepository,emailService)

        //Dagger Injection

        val component=DaggerUserRegistrationComponent.builder()
            .notificationServiceModule(NotificationServiceModule(3))
            .build()
component.Inject(this)
//        val userRegistrationService=component.getUserRegistrationService()
//        val emailService=component.getEmailService()

        userRegistrationService.registerUser("Prakhar","1111")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}