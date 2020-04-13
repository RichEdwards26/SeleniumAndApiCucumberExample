package Steps;

import API.GlobalFeedApi;
import DataModels.ArticleData;
import DataModels.ArticleParent;
import DataModels.ArticlesList;
import DataModels.NewArticleParentData;
import Drivers.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GlobalFeedSteps {

    private TestContext testContext;
    private ArticleParent articleParent;
    private GlobalFeedApi api;
    private NewArticleParentData article;
    public GlobalFeedSteps(TestContext testContext, ArticleParent articleParent, GlobalFeedApi api, NewArticleParentData article) {
        this.testContext = testContext;
        this.articleParent = articleParent;
        this.api = api;
        this.article = article;
    }

    @Then("The post is available in the global feed")
    public void the_post_is_available_in_the_global_feed() {

        ArticlesList articlesList = api.GetGlobalFeed("10","0");

        //Loop to find expected in list - just check title for now
        boolean isFound = false;
        for (ArticleData articleItem : articlesList.getArticles()) {
            if(articleItem.getTitle().equals(article.getArticle().getTitle()))
            {
                isFound = true;
                break;
            }
        }

        Assert.assertTrue("Validate post is available in global feed", isFound);
    }
}
