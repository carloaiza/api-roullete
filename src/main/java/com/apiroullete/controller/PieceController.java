package com.apiroullete.controller;

import com.apiroullete.model.entities.Piece;
import com.apiroullete.service.ListDEService;
import com.apiroullete.service.PieceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "piece")
public class PieceController {
    @Autowired
    private ListDEService listDEService;


    @GetMapping
    public List<Piece> getPieces() {
        return listDEService.getListDECircle().getList();

    }

    @PostMapping
    public String savePiece(@RequestBody Piece piece)
    {
        return listDEService.addPiece(piece);
    }
}
