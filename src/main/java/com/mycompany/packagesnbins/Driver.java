package com.mycompany.packagesnbins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Driver {

    public static void main(String[] args) {

        List<Packege> packages = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i != 23; ++i) {
            packages.add(new Packege(random.nextInt(100)));
        }

        Collections.sort(packages);
        double totalWeight = 0;
        for (Packege package1 : packages) {
            totalWeight += package1.getWeight();
        }

 

        for (Packege package1 : packages) {
            package1.setWeight(package1.getWeight() / totalWeight);
        }

        totalWeight = 1;

        List<Bin> binList = BinFactory.makeDifferentSizeBins(totalWeight);

        System.out.println("The value of the packeges....");
        System.out.println("==================================================================");
        for (int i = 0; i != packages.size(); ++i) {
            System.out.println("Package [" + i + "]" + packages.get(i));
        }
        System.out.println("==================================================================");

        while (packages.size() > 0) {
            Packege temp = packages.remove(0);
            Collections.sort(binList);
            binList.get(0).addToBin(temp);
        }

        int i = 0;
        for (Bin bin : binList) {
            System.out.println("Bin [" + i++ + "]");
            System.out.println(bin);
        }

        System.out.println("Total weight [" + totalWeight + "]");
        System.out.println("Approximatin Error [" + approximationErrot(binList) + "]");
    }

    public static double approximationErrot(List<Bin> binList) {
        double error = 0;
        for (Bin bin : binList) {
            error += Math.abs(bin.getBinWeight() - bin.getBinCapacity());
        }
        return error;
    }

}
