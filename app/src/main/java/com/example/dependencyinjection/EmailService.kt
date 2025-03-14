package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, body: String?)
}

class EmailService @Inject constructor() : NotificationService {
    @Override
    fun send(to: String, from: String, body: String?) {
        Log.d("EmailService", "Email sent...")

    }
}

class MessageService @Inject constructor() : NotificationService {
    @Override
    fun send(to: String, from: String, body: String?) {
        Log.d("MessageService", "Message sent...")
    }
}