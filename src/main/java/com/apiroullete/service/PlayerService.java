package com.apiroullete.service;

import com.apiroullete.model.entities.Player;
import com.apiroullete.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getPlayers()
    {
        return playerRepository.findAll();
    }


    public Player savePlayer(Player player)
    {
        return playerRepository.save(player);
    }
}
