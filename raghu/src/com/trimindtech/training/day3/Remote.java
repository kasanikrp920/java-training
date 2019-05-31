package com.trimindtech.training.day3;

public class Remote {
    private int channel;
    private int volumeLevel;
    private boolean currentState;

    public void raiseVolume(){
        if(!this.currentState) {
            System.out.println("please on the tv and press..");
            return;
        }

        this.volumeLevel++;
        System.out.println("the volume raised is "+this.volumeLevel);
    }
    public void decreaseVolume(){
         if(!this.currentState){
            System.out.println("please on the tv and press..");
            return;
        }
        this.volumeLevel--;
        System.out.println("the volume raised is "+this.volumeLevel);
    }
    public void raiseChannel(){
        if(!this.currentState){
            System.out.println("please on the tv and press..");
            return;
        }
        this.channel++;
        System.out.println("the channel raised is "+this.channel);
    }
    public void decreaseChannel(){
        if(!this.currentState){
            System.out.println("please on the tv and press..");
            return;
        }
        this.channel--;
        System.out.println("the channel raised is "+this.channel);
    }
    public void statusOfTv(){

        System.out.println("is tv is on  "+this.currentState);
    }
    public void tvOn(){
        this.currentState=true;
        System.out.println("tv is on now");
    }
    public void tvOff(){
        this.currentState=false;
        this.volumeLevel=0;
        this.channel=0;
        System.out.println("tv is off now");
    }

}
