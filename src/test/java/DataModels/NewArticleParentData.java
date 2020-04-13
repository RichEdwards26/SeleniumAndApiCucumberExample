package DataModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewArticleParentData {
    @SerializedName("article")
    @Expose
    private NewArticleData article;

    public NewArticleData getArticle() {
        return article;
    }

    public void setArticle(NewArticleData article) {
        this.article = article;
    }

    public NewArticleParentData()
    {
        article = new NewArticleData();
    }

}
