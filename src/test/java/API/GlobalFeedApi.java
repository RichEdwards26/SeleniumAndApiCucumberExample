package API;

import DataModels.ArticleParent;
import DataModels.ArticlesList;
import DataModels.ValidatedUser;
import Drivers.TestContext;
import com.google.gson.Gson;

public class GlobalFeedApi {


    private TestContext testContext;
    public GlobalFeedApi(TestContext testContext)
    {
        this.testContext = testContext;
    }

    public ArticlesList GetGlobalFeed(String limit, String offset){
        ApiHelper api = new ApiHelper();
        api.createGetRequest(testContext.getApiBaseUrl() + "articles?limit="+limit+"&offset="+offset);
        api.addGetHeader("authorization", "Token " + testContext.getApiToken());
        String response = api.executePost();

        Gson gson = new Gson();
        ArticlesList articlesList = new ArticlesList();
        articlesList= gson.fromJson(response, new ArticlesList().getClass());
        return articlesList;
    }

}
