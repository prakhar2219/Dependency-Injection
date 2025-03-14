package com.example.dependencyinjection;


import android.util.Log;
import javax.inject.Inject
interface UserRepository{
    fun saveUser(email:String,password:String)
}
public class SQLRepository @Inject constructor():UserRepository{

     override fun saveUser(email:String, password:String){
        Log.d("UserRepo", "save user in db");
    }
}
class FirebaseRepository:UserRepository{
    override fun saveUser(email:String,password:String){
        Log.d("UserRepo", "save user in firebase");
    }

}