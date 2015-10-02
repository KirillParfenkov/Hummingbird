package by.parf.repository;

import by.parf.beans.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by parf on 2.10.15.
 */
@RepositoryRestResource(collectionResourceRel="article", path = "article")
public interface ArticleRepository extends MongoRepository<Article, String> {
    List<Article> findByTitle(@Param("title") String name);
}
