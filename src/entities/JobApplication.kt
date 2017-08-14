package entities

data class JobApplication(
        var Id: Int,
        var JobId: Int = 0,
        var ApplicantId: Int = 0,
        var Status: String
)