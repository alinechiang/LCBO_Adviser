package com.example.lcboadviser;

import java.util.ArrayList;
import java.util.List;

public class DrinkExpert {
    List<String> getBrands(String genre){
        List<String> brands = new ArrayList<>();
        switch (genre){
            case "wine":
                brands.add("Caymus Zinfandel 2020");
                brands.add("Sandbanks French Kiss VQA");
                brands.add("Josh Cellars Cabernet Sauvignon");
                break;
            case "spirits":
                brands.add("Baileys Original Irish Cream");
                brands.add("Blanton's Original Single Barrel Kentucky Straight Bourbon Whiskey");
                brands.add("Maker's Mark 101");
                break;
            case "coolers":
                brands.add("Smirnoff Ice");
                brands.add("Simply Spiked Lemonade Variety Pack");
                brands.add("Coors Seltzer Slushie Flavour Pack");
                break;
            case "beer&cider":
                brands.add("Peroni Nastro Azzurro");
                brands.add("Grolsch Premium Pilsner");
                brands.add("Creemore Springs Premium Lager");
                break;
            default:
                brands.add("Unknown Genre");
                break;
        }
        return brands;
    }

}
