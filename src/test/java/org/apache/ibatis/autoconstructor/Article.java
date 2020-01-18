package org.apache.ibatis.autoconstructor;

/**
 * @className: Article
 * @description:
 * @author: guanfeng
 * @date: 2020/1/17 15:14
 * @version: V1.0.0
 **/
public class Article {

    private Integer id;
    private String title;
    private String content;
    /** 一篇文章对应一个作者 */
    private Author author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
