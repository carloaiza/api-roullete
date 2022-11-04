package com.apiroullete.service;

import com.apiroullete.model.entities.Piece;
import com.apiroullete.model.entities.Player;
import com.apiroullete.repository.PieceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PieceService {
    @Autowired
    private PieceRepository pieceRepository;

    public List<Piece> getPieces() {
        return pieceRepository.findAll();

    }

    public Piece savePiece(Piece piece)
    {

        return pieceRepository.save(piece);
    }
}



