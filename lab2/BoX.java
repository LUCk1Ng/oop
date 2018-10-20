package com.labBoX2;

public class BoX {
    private double height;
    private double width;
    private double depth;

    public BoX () {
        height=2;
        width=2;
        depth=2;
    }

    public BoX (double size){
        height=size;
        width=size;
        depth=size;
    }

    public BoX (double height,double width,double depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }

    public double area (){
        double area;
        return area=(width*height+depth+height+depth+width);
    }
    public double volum(){
        double volum;
        return volum=width*height*depth;
    }

    public void print (){
    System.out.println("height"+height+"width"+width+"depth"+depth);

    }
    
}
