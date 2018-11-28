package Objektorientierung;

public class Motorrad {
    public int reifen;
    public String motor;
    public String name;
    public int xPosition;
    public int yPosition;



    public Motorrad (int reifen, String motor, int xPosition, int yPosition){
        this.reifen = reifen;
        this.motor = motor;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void fahren(int xMeter, int yMeter){
        xPosition += xMeter;
        yPosition += yMeter;
    }

    public void getKoodinaten(){
        System.out.println("Position X: " + xPosition);
        System.out.println("Position Y: " + yPosition);
    }

    public int getXPosition(){
        return xPosition;
    }

    public void setXPosition(int xPosition){
        this.xPosition = xPosition;
    }

    public int getYPosition(){
        return yPosition;
    }

    public void setyPosition(int yPosition){
        this.yPosition = yPosition;
    }


    public String getMotor(){
        return motor;
    }

    public void setMotor(String motor){
        this.motor = motor;
    }

    public int getReifen(){
        return reifen;
    }

    public void setReifen(int reifen){
        this.reifen = reifen;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }






}
