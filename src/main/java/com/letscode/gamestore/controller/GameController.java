package com.letscode.gamestore.controller;

import com.letscode.gamestore.dto.GameRequest;
import com.letscode.gamestore.dto.GameResponse;
import com.letscode.gamestore.model.Game;
import com.letscode.gamestore.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/game")
public class GameController {

  @Autowired GameService gameService;

  @PostMapping
  public ResponseEntity<GameResponse> createGame(
      @RequestBody @Valid GameRequest gameRequest, UriComponentsBuilder uriComponentsBuilder) {

    Game game = gameService.createGame(gameRequest);
    URI uri = uriComponentsBuilder.path("/game/{id}").buildAndExpand(game.getId()).toUri();
    return ResponseEntity.created(uri).body(new GameResponse(game));
  }
}
