package API;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class ApiHelper {

    private CloseableHttpClient client;
    private HttpPost post;
    private HttpGet get;
    private HttpUriRequest request;
    private CloseableHttpResponse response;
    private int expectedStatusCode;

    public ApiHelper()
    {
        client = HttpClients.createDefault();
        //default code to 200
        setExpectedStatusCode(HttpStatus.SC_OK);
    }

    public int getExpectedStatusCode() {
        return expectedStatusCode;
    }

    public void setExpectedStatusCode(int expectedStatusCode) {
        this.expectedStatusCode = expectedStatusCode;
    }

    public void addHeader(String name, String value){
        request.setHeader(name, value);
    }

    public void createPostRequest(String json, String ApiUrl) {
        StringEntity entity = null;
        try {
            entity = new StringEntity(json);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        post = new HttpPost(ApiUrl);
        post.setEntity(entity);
        //post.setHeaders(request.getAllHeaders());
        //default the JSON headers
        post.setHeader("Accept", "application/json");
        post.setHeader("Content-type", "application/json");

        request = post; //?This work? TBD!!!!
    }

    public void createGetRequest(){
        get.setHeaders(request.getAllHeaders());
        request = get;
    }

    public String executePost() {
        try {
            response = client.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String responseString = null;
        HttpEntity entity = response.getEntity();
        try {
            responseString = EntityUtils.toString(entity, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertTrue("Expect status code: " + getExpectedStatusCode(),
                response.getStatusLine().getStatusCode() == getExpectedStatusCode());

        return responseString;
    }
}
