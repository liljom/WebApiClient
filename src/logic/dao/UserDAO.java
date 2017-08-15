package logic.dao;

import entities.UserDetail;
import logic.RestService;

public class UserDAO {

    private String url = "http://localhost:64848/api/user";
    RestService restService = new RestService();

    public UserDetail get(int userID) {

        String fullUrl = url + "/details?userId=" + userID;
        return restService.getSingle(UserDetail.class, fullUrl);
    }
}
