package entities

data class User(
        var UserId: Int,
        var Username: String,
        var Email: String,
        var Name: String,
        var Surname: String,
        var DateOfBirth: String
)