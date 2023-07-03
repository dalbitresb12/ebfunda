package com.dalbitresb.ebfunda.models;

import lombok.Data;

@Data
public class Product {
  private final String id;
  private final String nombre;
  private final String descripcion;
  private final String caracteristicas;
  private final String categoria;
  private final String subcategoria;
  private final String claves;
  private final String precio;
  private final String url;
}
