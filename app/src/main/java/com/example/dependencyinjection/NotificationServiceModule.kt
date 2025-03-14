package com.example.dependencyinjection

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule(private val retryCount: Int) {
//    provide means that it will provide the necessary object as of demanded
    @Named("message")
    @Provides
    fun getMessageService(): NotificationService {
//        aur bhi kuch agr krana ho object creation ke time to wo bhi kr skte hai
        return MessageService(retryCount)
    }
//    Defining a qualifier
//    hmlog object bnate time ye specify kr skte hai ki hmko konsa wala method chahiye
    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return EmailService()
    }
}