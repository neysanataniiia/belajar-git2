package com.ug6.soal1;
import java.util.ArrayList;
public class Phones {
    private String phoneName;
    private String phoneCode;
    private String companyCode;
    private String androidCode;
    private int ramCapacity;
    private int romCapacity;
    private float screenSize;
    private int cameraResolution;

    public Phones(String phoneName, String phoneCode, String companyCode, String androidCode) {
        this.phoneName =phoneName;
        this.phoneCode = phoneCode;
        this.companyCode = companyCode;
        this.androidCode = androidCode;
    }

    public Phones(String phoneName, String phoneCode, String companyCode, String androidCode, int ramCapacity, int romCapacity, float screenSize, int cameraResolution) {
        this.phoneName =phoneName;
        this.phoneCode = phoneCode;
        this.companyCode = companyCode;
        this.androidCode = androidCode;
        this.ramCapacity =ramCapacity;
        this.romCapacity = romCapacity;
        this.screenSize =screenSize;
        this.cameraResolution = cameraResolution;
    }
}