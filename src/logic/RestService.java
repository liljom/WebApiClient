package logic;

import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/**
 * Created by liljom on 2017. 06. 05..
 */
public class RestService {

    Gson gson = new Gson();

    public <T> T getSingle(Class<T> clazz, String url) {
        String json = getJson(url);
        return gson.fromJson(json, clazz);
    }

    public <T> List<T> getList(Class<T> clazz, String url) {
        String json = getJson(url);
        T[] array = (T[]) Array.newInstance(clazz, 0);
        T[] result = gson.fromJson(json, (Type) array.getClass());
        return Arrays.asList(result);
    }

    private String getJson(String url){
        String json = new String();
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            HttpGet request = new HttpGet(url);
            request.addHeader("content-type", "application/json");
            HttpResponse result = httpClient.execute(request);
            json = EntityUtils.toString(result.getEntity(), "UTF-8");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return json;
    }
}
