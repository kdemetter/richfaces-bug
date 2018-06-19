package com.kdemetter.article.backing;

import com.kdemetter.article.vo.Article;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@ManagedBean
public class ProductModifyBean implements Serializable {

    private List<Article> articles;

    @PostConstruct()
    public void prepare() {

        if(articles == null) {

            articles = new ArrayList<Article>();
            Article art;

            for(int i = 1 ; i < 100 ;i++) {

                art = new Article();
                art.setArticleNumber("100" + i);
                art.setShortName("Article " + i);
                art.setQuantity(i);
                articles.add(art);
            }

        }


    }

    public void modifyProduct() {

    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}