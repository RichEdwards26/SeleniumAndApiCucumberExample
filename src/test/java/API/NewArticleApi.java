package API;

import DataModels.ArticleParent;
import DataModels.NewArticleParentData;
import Drivers.TestContext;
import com.google.gson.Gson;

public class NewArticleApi {

    private TestContext testContext;
    public NewArticleApi(TestContext testContext)
    {
        this.testContext = testContext;
    }

    public ArticleParent CreateArticle(NewArticleParentData article)
    {
        Gson gson = new Gson();
        ApiHelper api = new ApiHelper();
        api.createPostRequest(gson.toJson(article), testContext.getApiBaseUrl() + "articles/");

        //Just manage cookie as a string for now - todo is implement basic cookie store in api helper or standalone
        api.addPostHeader("Set-Cookie",testContext.getCookie());
        api.addPostHeader("authorization", "Token " + testContext.getApiToken());
        String response = api.executePost();
        ArticleParent articleParent = new ArticleParent();
        articleParent = gson.fromJson(response, new ArticleParent().getClass());
        return articleParent;
    }
}

