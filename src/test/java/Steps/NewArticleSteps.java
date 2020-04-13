package Steps;

import API.NewArticleApi;
import DataModels.*;
import Drivers.TestContext;
import io.cucumber.java.en.When;

public class NewArticleSteps {

    private TestContext testContext;
    private ValidatedUser validatedUser;
    private NewArticleParentData article;
    private NewArticleApi api;
    private ArticleParent articleParent;
    public NewArticleSteps(TestContext testContext, ValidatedUser validatedUser, NewArticleParentData article,
                           NewArticleApi api, ArticleParent articleParent){
        this.testContext = testContext;
        this.validatedUser = validatedUser;
        this.article = article;
        this.api = api;
        this.articleParent = articleParent;
    }
    @When("I post an article")
    public void i_post_an_article() {

        //Create the article data
        article.getArticle().setBody("The body of the API message");
        article.getArticle().setDescription("This was set via API");
        article.getArticle().setTitle("API Injected Data");

        articleParent = api.CreateArticle(article);
    }
}
