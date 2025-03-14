package com.example.dependencyinjection

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {
//    provide means that it will provide the necessary object as of demanded
    @Provides
    fun getMessageService(): NotificationService {
//        aur bhi kuch agr krana ho object creation ke time to wo bhi kr skte hai
        return MessageService()
    }
}