package com.apiroullete.service;

import com.apiroullete.model.entities.ListDECircle;
import com.apiroullete.model.entities.Piece;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Data
public class ListDEService {

    @Autowired
    private PieceService pieceService;
    private ListDECircle listDECircle;

    public ListDEService() {
        listDECircle = new ListDECircle();

    }

    @PostConstruct
    public void fillListDE()
    {
        for(Piece piece:pieceService.getPieces())
        {
            listDECircle.add(piece,false);
        }
    }

    public String addPiece(Piece data)
    {
        listDECircle.add(data,false);
        pieceService.savePiece(data);
        return "Adicionada con éxito";
    }

    public String addPieceToStart(Piece data)
    {
        listDECircle.add(data,true);
        pieceService.savePiece(data);
        return "Adicionada con éxito";
    }
}
