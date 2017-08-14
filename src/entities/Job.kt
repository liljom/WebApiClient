package entities

data class Job(
        var Id: Int,
        var Title: String,
        var Description: String,
        var DateStart: String,
        var DateEnd: String,
        var Hours: Int,
        var Price: Double,
        var CategoryId: Int,
        var Status: String,
        var CreatedBy: Int,
        var UserID: Int,
        var Longitude: String,
        var Latitude: String
)