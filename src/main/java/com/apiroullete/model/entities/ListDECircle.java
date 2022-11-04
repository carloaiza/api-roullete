package com.apiroullete.model.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ListDECircle {
    private NodeDE head;
    private int size;

    public void add(Piece data,boolean start){
        if(head==null)
        {
            head = new NodeDE(data);
            head.setNext(head);
            head.setPrevious(head);
        }
        else
        {
            NodeDE newNode = new NodeDE(data);
            newNode.setNext(head);
            newNode.setPrevious(head.getPrevious());
            head.setPrevious(newNode);
            newNode.getPrevious().setNext(newNode);
            if(start)
            {
                head = newNode;
            }
        }
        size++;
    }

    public List<Piece> getList()
    {
        List<Piece> listPieces = new ArrayList<>();
        if(head != null)
        {
            listPieces.add(head.getData());
            NodeDE temp = head.getNext();
            while(temp != head)
            {
                listPieces.add(temp.getData());
                temp = temp.getNext();
            }
        }
        return listPieces;
    }

    public void prueba()
    {
        int i=5;
        System.out.println(i++);
        System.out.println(++i);
    }

}
