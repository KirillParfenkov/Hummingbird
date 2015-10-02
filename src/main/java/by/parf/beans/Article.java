package by.parf.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by parf on 2.10.15.
 */
@Document(collection = "article")
public class Article {

    @Id
    private String id;
    private String title;
    private User author;

    public Article() {

    }

    public Article(String title) {
        this.title = title;
    }

    public Article(String title, User author) {
        this.title = title;
        this.author = author;
    }

    public Article(String id, String title, User author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
