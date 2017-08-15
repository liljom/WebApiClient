package entities

data class Job(
        var id: Int,
        var title: String,
        var description: String,
        var dateStart: String,
        var dateEnd: String,
        var hours: Int,
        var price: Double,
        var categoryId: Int,
        var status: String,
        var createdBy: Int,
        var userID: Int,
        var longitude: String,
        var latitude: String
)