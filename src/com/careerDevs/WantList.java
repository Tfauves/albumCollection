package com.careerDevs;

public class WantList extends Albums {
    public String rarity;
    public double currentMarketPrice;

    public WantList(String artistName, String albumName, String condition, double playBackSpeed, String rarity, double currentMarketPrice) {
        super(artistName, albumName, condition,playBackSpeed);
        this.rarity = rarity;
        this.currentMarketPrice = currentMarketPrice;
    }
}
