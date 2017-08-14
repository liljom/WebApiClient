package logic.dao;

import entities.User;
import logic.RestService;

public class UserDAO {

    private String url = "http://evro0002examproject0517.azurewebsites.net/api/users";
    RestService restService = new RestService();

    public User get(int userID) {

        String fullUrl = url + "/" + userID;
        return restService.getSingle(User.class, fullUrl);
    }
}
