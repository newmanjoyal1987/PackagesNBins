package com.mycompany.packagesnbins;

import java.util.ArrayList;

public class Bin implements Comparable<Bin> {

    final private ArrayList<Packege> packeges = new ArrayList<>();
    private double binWeight;
    private double binCapacity;

    public Bin(double binCapacity) {
        this.binCapacity = binCapacity;
    }

    public void addToBin(Packege packege) {
        packeges.add(packege);
        binWeight += packege.getWeight();

    }

    @Override
    public int compareTo(Bin otherBin) {
        double tmp =  - ((binCapacity - binWeight) - (otherBin.getBinCapacity() - otherBin.getBinWeight()));
                if (tmp < 0) {
            return -1;
        } else if (tmp == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public double getBinWeight() {
        return binWeight;
    }

    public void setBinWeight(double binWeight) {
        this.binWeight = binWeight;
    }

    public double getBinCapacity() {
        return binCapacity;
    }

    public void setBinCapacity(double binCapacity) {
        this.binCapacity = binCapacity;
    }

  

    public ArrayList<Packege> getPackeges() {
        return packeges;
    }

    public void weighBins() {
        for (Packege packege : packeges) {
            binWeight += packege.getWeight();
        }
    }

    @Override
    public String toString() {
        return "Bin{" + "packeges=" + packeges + ", binWeight=" + binWeight + ", binCapacity=" + binCapacity + '}';
    }

}
