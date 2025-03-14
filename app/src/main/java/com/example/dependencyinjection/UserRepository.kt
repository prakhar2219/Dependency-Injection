package com.example.dependencyinjection;


import android.util.Log;
import javax.inject.Inject

//ensures that we don't have to write custom code to save data in a database and call it at thw time of creation of object,
// we will just call the object and leave it to dagger to inject the dependency ,without specifying which service /class of that
//interface is to be called ,this leads to aproblem of binding i.e. which service to be called and when
interface UserRepository {
    fun saveUser(email: String, password: String)
}

public class SQLRepository @Inject constructor() : UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d("UserRepo", "save user in db");
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("UserRepo", "save user in firebase");
    }

}