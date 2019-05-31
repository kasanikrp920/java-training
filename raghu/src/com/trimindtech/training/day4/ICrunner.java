package com.trimindtech.training.day4;

public class ICrunner {
    public static void main(String[] args) {
        ImagingCuo c1 = new ImagingCuo();
        c1.setGroupName("TTS");
        c1.setProjetTitle("MTRS");
        c1.setNoOfMembers(4);
        System.out.println(c1.toString());
        System.out.println(c1.calcCollectionPerGroup());
    }
}
