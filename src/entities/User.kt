package entities

/**
 * Created by liljom on 2017. 06. 05..
 */

data class User(
        var UserId: Int,
        var Username: String,
        var Email: String,
        var Name: String,
        var Surname: String,
        var DoB: String,
        var Password: String,
        var Address: String
)