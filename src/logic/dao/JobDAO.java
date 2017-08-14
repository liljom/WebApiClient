package logic.dao;

import entities.Job;
import logic.RestService;

public class JobDAO {

    private String url = "http://evro0002examproject0517.azurewebsites.net/api/jobs";
    RestService restService = new RestService();

    public Job get(int id) {

        String fullUrl = url + "/" + id;
        return restService.getSingle(Job.class, fullUrl);
    }
}
