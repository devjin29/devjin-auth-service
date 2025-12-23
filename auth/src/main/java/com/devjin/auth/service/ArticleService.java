package com.devjin.auth.service;

import com.devjin.auth.Repository.ArticleRepository;
import com.devjin.auth.domain.Article;
import com.devjin.auth.dto.AddArticleRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public Article save(AddArticleRequest request) {
        return articleRepository.save(request.toEntity());
    }
}
