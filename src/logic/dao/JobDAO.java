package logic.dao;

import entities.Job;
import entities.JobApplication;
import logic.RestService;

import java.util.List;

public class JobDAO {

    private String url = "http://localhost:64848/api/jobs";
    RestService restService = new RestService();

    public Job get(int id) {

        String fullUrl = url + "/" + id;
        return restService.getSingle(Job.class, fullUrl);
    }

    public List<Job> getPending() {
        String fullUrl = url + "/pending";
        return restService.getList(Job.class, fullUrl);
    }
}
