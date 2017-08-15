package entities

data class JobApplication(
        var id: Int,
        var jobId: Int = 0,
        var applicantId: Int = 0,
        var status: String
)