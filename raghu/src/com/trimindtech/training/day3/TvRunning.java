package com.trimindtech.training.day3;

public class TvRunning {
    public static void main(String[] args) {
        Remote lenovo=new Remote();
        lenovo.tvOn();
        lenovo.statusOfTv();
        lenovo.raiseVolume();
        lenovo.decreaseVolume();
        lenovo.raiseChannel();
        lenovo.decreaseChannel();
        //lenovo.tvOff();
        Remote r=new Remote();
        r.raiseVolume();
        r.raiseChannel();
    }
}
