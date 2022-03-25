package com.ug6.soal1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Production {
    private int productionCapacity;
    private ArrayList<LocalDate> productionDate;
    private ArrayList<long> productionDueDays;
    private double costCalculation;

    public Production(int productionCapacity, ArrayList<LocalDate> productionDate) {
        this.productionCapacity = productionCapacity;
        this.productionDate = productionDate;
    }

    public boolean cekPhonesSpecification(String androidCode) {
        return androidCode;
    }

    public boolean cekPhonesSpecification(String androidCode, int ramCapacity, int romCapacity) {
    }

    public void conductProduction(String androidCode, int ramCapacity, int romCapacity) {
        
    }

    public void conductProduction(phone Phones) {
    }

    public void conductProduction(phone Phones, float productionRate) {
    }

}
