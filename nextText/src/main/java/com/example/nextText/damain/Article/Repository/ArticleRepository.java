package com.example.nextText.damain.Article.Repository;


import com.example.nextText.damain.Article.Entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}