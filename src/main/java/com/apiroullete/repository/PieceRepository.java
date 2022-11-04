package com.apiroullete.repository;

import com.apiroullete.model.entities.Piece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PieceRepository extends JpaRepository<Piece,String> {
}
