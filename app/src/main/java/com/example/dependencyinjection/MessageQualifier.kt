package com.example.dependencyinjection

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier
//apne anotation ko qualifier bnane ke liye
//documented means ye hmare java doc me ayegaa ki nhi
//annotation ka timeline define krta hai,ki wo kb tk valid rhegii
//classis to prevent typo
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class MessageQualifier()
