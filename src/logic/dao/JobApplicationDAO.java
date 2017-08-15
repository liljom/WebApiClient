package logic.dao;

import entities.JobApplication;
import logic.RestService;

import java.util.List;

public class JobApplicationDAO {

    private String url = "http://localhost:64848/api/jobs";
    RestService restService = new RestService();

    public List<JobApplication> getCompleted() {
        String fullUrl = url + "/pending";
        return restService.getList(JobApplication.class, fullUrl);
    }
}
