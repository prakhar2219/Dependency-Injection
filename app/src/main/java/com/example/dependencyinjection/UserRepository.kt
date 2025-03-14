package com.example.dependencyinjection;


import android.util.Log;
import javax.inject.Inject

public class UserRepository @Inject constructor(){
    fun saveUser(email:String,password:String){
        Log.d("UserRepo", "save user in db");
    }
}
