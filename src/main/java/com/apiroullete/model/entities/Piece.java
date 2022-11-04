package com.apiroullete.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Piece {
    @Id
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "value")
    private byte value;

    @Basic
    @Column(name = "option")
    private boolean option;

}
