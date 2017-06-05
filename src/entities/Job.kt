package entities

/**
 * Created by liljom on 2017. 06. 05..
 */
data class Job(
        var JobId: Int,
        var Title: String,
        var Description: String,
        var DateStart: String,
        var DateEnd: String,
        var Hours: Int,
        var Price: Double,
        var CategoryId: Int,
        var UserID: Int
)