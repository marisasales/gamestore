package com.letscode.gamestore.service;

import com.letscode.gamestore.dto.GameRequest;
import com.letscode.gamestore.model.Game;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GameService {

  public Game createGame(GameRequest gameRequest) {

    return new Game(
        UUID.randomUUID(),
        gameRequest.getTitle(),
        gameRequest.getDescription(),
        gameRequest.getCategory(),
        gameRequest.getPlatform(),
        gameRequest.getPrice()
    );
  }
}
