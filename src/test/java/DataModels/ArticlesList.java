package DataModels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ArticlesList {

    @SerializedName("articles")
    @Expose
    private List<ArticleData> articles = null;
    @SerializedName("articlesCount")
    @Expose
    private Integer articlesCount;

    public List<ArticleData> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticleData> articles) {
        this.articles = articles;
    }

    public Integer getArticlesCount() {
        return articlesCount;
    }

    public void setArticlesCount(Integer articlesCount) {
        this.articlesCount = articlesCount;
    }


}
