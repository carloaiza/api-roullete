package com.apiroullete.controller;

import com.apiroullete.model.entities.Player;
import com.apiroullete.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<Player> getPlayers()
    {
        return playerService.getPlayers();
    }

    @PostMapping
    public Player savePlayer(@RequestBody Player player)
    {
        return playerService.savePlayer(player);
    }
}
