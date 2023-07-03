package com.dalbitresb.ebfunda.models;

import java.util.List;

import lombok.Data;

@Data
public class Recommendation {
  private final User user;
  private final List<Product> products;
}
