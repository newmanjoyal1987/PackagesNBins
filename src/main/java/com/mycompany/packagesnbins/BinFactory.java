package com.mycompany.packagesnbins;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinFactory {

    public static List<Bin> makeBins(int totalPackegeWeight) {

        List<Bin> binList = new ArrayList<>();
        binList.add(new Bin(totalPackegeWeight / 4));
        binList.add(new Bin(totalPackegeWeight / 4));
        binList.add(new Bin(totalPackegeWeight / 4));
        binList.add(new Bin(totalPackegeWeight / 4));
        return binList;
    }

    public static List<Bin> makeDifferentSizeBins(double totalPackageWeight) {
        List<Bin> binList = new ArrayList<>();
        Random random = new Random();

        double percenTile = random.nextDouble();
        double bin1 =  (totalPackageWeight * percenTile);
        double remainngPackagWeight = totalPackageWeight - bin1;
        binList.add(new Bin(bin1));

        percenTile = random.nextDouble();
        double bin2 =  (remainngPackagWeight * percenTile);
        remainngPackagWeight = remainngPackagWeight - bin2;
        binList.add(new Bin(bin2));

        percenTile = random.nextDouble();
        double bin3 =  (remainngPackagWeight * percenTile);
        remainngPackagWeight = remainngPackagWeight - bin3;
        binList.add(new Bin(bin3));

        binList.add(new Bin(remainngPackagWeight));
        return binList;

    }

}
