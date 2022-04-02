package com.letscode.gamestore.dto;

import com.letscode.gamestore.model.Game;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GameResponse {

  private String title;
  private String description;
  private String category;
  private String platform;
  private double price;

  public GameResponse(Game game) {
    this.title = game.getTitle();
    this.description = game.getDescription();
    this.category = game.getCategory();
    this.platform = game.getPlatform();
    this.price = game.getPrice();
  }
}
