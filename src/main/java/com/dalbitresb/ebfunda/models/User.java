package com.dalbitresb.ebfunda.models;

import java.util.List;

import lombok.Data;

@Data
public class User {
  private final String id;
  private final String nombre;
  private final List<String> categorias;
}
