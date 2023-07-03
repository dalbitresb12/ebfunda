package com.dalbitresb.ebfunda.api;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dalbitresb.ebfunda.models.Recommendation;
import com.dalbitresb.ebfunda.services.RecommendationsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/recomendaciones")
@RequiredArgsConstructor
public class RecommendationController {
  private final RecommendationsService service;

  @GetMapping("{id}")
  public ResponseEntity<?> getByUserId(@PathVariable String id) {
    Optional<Recommendation> recommendation = service.getRecommendationsForUser(id);
    if (!recommendation.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(recommendation.get());
  }
}
