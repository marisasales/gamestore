package com.letscode.gamestore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
public class Game {

  private UUID id;
  private String title;
  private String description;
  private String category;
  private String platform;
  private double price;
}
