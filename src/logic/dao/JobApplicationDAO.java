package logic.dao;

import entities.JobApplication;
import logic.RestService;

import java.util.List;

public class JobApplicationDAO {

    private String url = "http://evro0002examproject0517.azurewebsites.net/api/jobdeals";
    RestService restService = new RestService();

    public List<JobApplication> getCompleted() {
        String fullUrl = url + "?status=completed";
        return restService.getList(JobApplication.class, fullUrl);
    }
}
