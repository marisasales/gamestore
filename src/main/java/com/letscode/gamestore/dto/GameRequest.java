package com.letscode.gamestore.dto;

import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
public class GameRequest {

  @NotEmpty @NotNull private String title;
  @NotEmpty @NotNull private String description;
  @NotEmpty @NotNull private String category;
  @NotEmpty @NotNull private String platform;
  @NotNull private double price;
}
