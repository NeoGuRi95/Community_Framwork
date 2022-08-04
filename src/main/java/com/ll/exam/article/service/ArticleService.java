package com.ll.exam.article.service;

import com.ll.exam.annotation.Autowired;
import com.ll.exam.annotation.Service;
import com.ll.exam.article.dto.ArticleDto;
import com.ll.exam.article.repository.ArticleRepository;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<ArticleDto> getArticles() {
        return articleRepository.getArticles();
    }

    public ArticleDto getArticleById(long id) {
        return articleRepository.getArticleById(id);
    }

    public long getArticlesCount() {
        return articleRepository.getArticlesCount();
    }

    public long write(String title, String body, boolean isBlind) {
        return articleRepository.write(title, body, isBlind);
    }

    public void modify(int id, String title, String body, boolean b) {
        articleRepository.modify(id, title, body, b);
    }

    public void delete(int id) {
        articleRepository.delete(id);
    }

    public ArticleDto getBeforeArticle(int id) {
        return articleRepository.getBeforeId(id);
    }

    public ArticleDto getAfterArticle(int id) {
        return articleRepository.getAfterId(id);
    }
}