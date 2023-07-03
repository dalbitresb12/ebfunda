package com.dalbitresb.ebfunda.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dalbitresb.ebfunda.models.User;

@Service
public class UsersService {
  private static List<User> users = List.of(
      new User("001", "Luis Perez", Arrays.asList("accesorios", "parlante")),
      new User("002", "Juan Perez", Arrays.asList("accesorios")),
      new User("003", "Ana Perez", Arrays.asList("parlante")));

  public List<User> getAll() {
    return users;
  }

  public Optional<User> getById(String id) {
    return users.stream().filter(user -> user.getId().equals(id)).findFirst();
  }
}
