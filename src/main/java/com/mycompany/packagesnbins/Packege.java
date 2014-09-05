package com.mycompany.packagesnbins;

public class Packege implements Comparable<Packege> {

    private double weight;

    public Packege(int weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Packege otherPackage) {

        double tmp = this.weight - otherPackage.getWeight();
        if (tmp < 0) {
            return -1;
        } else if (tmp == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "{weight :  " + weight + "}";
    }

}
