package com.dalbitresb.ebfunda.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dalbitresb.ebfunda.models.Product;
import com.dalbitresb.ebfunda.models.Recommendation;
import com.dalbitresb.ebfunda.models.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RecommendationsService {
  private final ProductsService productsService;
  private final UsersService usersService;

  public Optional<Recommendation> getRecommendationsForUser(String id) {
    Optional<User> user = usersService.getById(id);
    if (!user.isPresent()) {
      return Optional.empty();
    }
    List<String> categories = user.get().getCategorias();
    List<Product> products = new ArrayList<Product>();
    for (String category : categories) {
      products.addAll(productsService.getBySubcategory(category));
    }
    return Optional.of(new Recommendation(user.get(), products));
  }
}
