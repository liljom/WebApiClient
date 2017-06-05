package logic.dao;

import entities.Post;
import logic.RestService;
import java.util.List;

/**
 * Created by liljom on 2017. 06. 05..
 */
public class PostDAO {

    private String url = "http://jsonplaceholder.typicode.com/posts";
    RestService restService = new RestService();

    public Post get(int id) {

        String fullUrl = url + "/" + id;
        return restService.getSingle(Post.class, fullUrl);
    }

    public List<Post> getAllForUser(int userID) {

        String fullUrl = url + "?userId=" + userID;
        return restService.getList(Post.class, fullUrl);
    }
}
