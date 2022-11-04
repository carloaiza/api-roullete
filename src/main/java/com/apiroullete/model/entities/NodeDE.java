package com.apiroullete.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;


public class NodeDE {
    private Piece data;
    private NodeDE previous;
    private NodeDE next;

    public NodeDE(Piece data) {
        this.data = data;
    }

    public Piece getData() {
        return data;
    }

    public void setData(Piece data) {
        this.data = data;
    }

    public NodeDE getPrevious() {
        return previous;
    }

    public void setPrevious(NodeDE previous) {
        this.previous = previous;
    }

    public NodeDE getNext() {
        return next;
    }

    public void setNext(NodeDE next) {
        this.next = next;
    }
}
