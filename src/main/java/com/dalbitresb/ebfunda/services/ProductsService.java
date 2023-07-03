package com.dalbitresb.ebfunda.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dalbitresb.ebfunda.models.Product;

@Service
public class ProductsService {
  private static List<Product> products = Arrays.asList(
      new Product("GGOEGFKA086699", "Google Home", "Asistente Google Home", "Asistente de voz Google Home para casa",
          "Tecnologia", "accesorios", "Asistente, IA, Home, parlante", "260", "GoogleHome"),
      new Product("GGOEWCKQ085457", "Nuevo Echo Dot (4ta Generación, Edición 2020)",
          "Nuevo Echo Dot (4ta Generación, Edición 2020)", "Nuevo echo dot 4a edicion parlante inteligente Alexa",
          "Tecnologia", "accesorios", "Asistente, IA, Home, parlante", "70.00", "EchoDot"),
      new Product("GGOEGHPB071610", "Echo Pop",
          "Parlante inteligente y compacto con sonido definido y Alexa | versión internacional ",
          "Compacto con sonido definido y Alexa", "Tecnologia", "parlante", "Asistente, IA, Home, parlante", "40.00",
          "EchoPop"));

  public List<Product> getAll() {
    return products;
  }

  public List<Product> getBySubcategory(String subcategory) {
    return products.stream().filter(product -> product.getSubcategoria().equals(subcategory)).toList();
  }
}
