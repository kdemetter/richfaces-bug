package com.kdemetter.article.vo;

public class Article {

    private String shortName;
    private String articleNumber;
    private Integer quantity;

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public String getShortName() {
        return shortName;
    }
}
