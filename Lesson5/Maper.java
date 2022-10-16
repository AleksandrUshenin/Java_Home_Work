package Lesson5;

public class Maper {
    private int Data;
    private Maper prevLink;
    private Maper nextLeft;
    private Maper nextRight;

    public Maper(int data){
        Data = data;
    }

    public int getData(){
        return Data;
    }
    public void addLink(Maper data){
        prevLink = data;
    }
    public Maper getLink(){
        return prevLink;
    }
    public void addnextLeft(Maper data){
        nextLeft = data;
    }
    public Maper getnextLeft(){
        return nextLeft;
    }
    public void addnextRight(Maper data){
        nextRight = data;
    }
    public Maper getnextRight(){
        return nextRight;
    }
}
