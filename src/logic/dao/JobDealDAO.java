package logic.dao;

import entities.JobDeal;
import logic.RestService;

import java.util.List;

/**
 * Created by liljom on 2017. 06. 01..
 */
public class JobDealDAO {

    private String url = "http://evro0002examproject0517.azurewebsites.net/api/jobdeals";
    RestService restService = new RestService();

    public List<JobDeal> getCompleted() {
        String fullUrl = url + "?status=completed";
        return restService.getList(JobDeal.class, fullUrl);
    }
}
