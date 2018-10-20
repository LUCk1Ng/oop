package com.company;

class Monitor {

    String Model;
    String Color;
    String Resolution;

    void show(){
     System.out.println("Model: "+ Model + " Color: "+ Color +" Resolution: "+ Resolution);

    }
    public void setParametress ( String Model,String Color,String Resolution ) {
        this.Model = Model;
        this.Color = Color;
        this.Resolution = Resolution;
    }
}
