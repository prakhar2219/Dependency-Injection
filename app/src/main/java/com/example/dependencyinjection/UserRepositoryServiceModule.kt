package com.example.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryServiceModule {
//    since dagger ko pta hai ki sql kaa object kaise bnana hai since hmlog ne wha pr @inject kaa use kiya hua hai
    //    ,isliye wo se bna lega just hume usko methid me pass krna hoga
//    aur jaise hi hum function ko call kre ,hume usme sql repo kaa object pass krna hoga
//    dagger jaise hi uske functions ko call kregaa wo usme check kregaa ki kya usme koi dependency hai jiska wo object bna skta hai, agr haan to
//    to woh hmko bna ke dedo
//    basically hmlog us object ko ,jo dagger ne hume bna kr diya hai usko bind kr rhe hai userRepo ke sath

//@Provides
//    fun getFirebaseService():UserRepository{
//        return FirebaseRepository()
//    }


//    @Provides
//    fun getSqlService(sqlRepository: SQLRepository):UserRepository{
//        return SQLRepository()
//    }

//    to use binds annotation we make the methods abstract and the class as well.
//    which simply means that we have bind our userRepository with the sql repository
//    binds annotation kaa use tbhi krte hai jb dagger uska object khud bna skta ho

    @Binds
    abstract fun getSqlService(sqlRepository: SQLRepository): UserRepository

}