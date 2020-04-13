package DataModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArticleParentData {
    @SerializedName("article")
    @Expose
    private ArticleData article;

    public ArticleData getArticle() {
        return article;
    }

    public void setArticle(ArticleData article) {
        this.article = article;
    }

    public ArticleParentData()
    {
        article = new ArticleData();
    }

}
