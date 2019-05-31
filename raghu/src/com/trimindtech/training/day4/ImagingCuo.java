package com.trimindtech.training.day4;

public class ImagingCuo {
    private String groupName;
    private String projetTitle;
    private  int noOfMembers;
    private double feePerMember;

    public ImagingCuo(){
        this.feePerMember=200;
        this.groupName="xxx";
        this.projetTitle="aaa";
        this.noOfMembers=5;


    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getProjetTitle() {
         return projetTitle;
    }

    public void setProjetTitle(String projetTitle) {
        this.projetTitle = projetTitle;
    }

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public double getFeePerMember() {
        return feePerMember;
    }

    public void setFeePerMember(double feePerMember) {
        this.feePerMember = feePerMember;
    }
    public double calcCollectionPerGroup(){
        double collectionPerGroup= feePerMember *noOfMembers;
        return collectionPerGroup;

    }

    @Override
    public String toString() {
        return "ImagingCuo{" +
                "groupName='" + groupName + '\'' +
                ", projetTitle='" + projetTitle + '\'' +
                ", noOfMembers=" + noOfMembers +
                ", feePerMember=" + feePerMember +
                '}';
    }
}
