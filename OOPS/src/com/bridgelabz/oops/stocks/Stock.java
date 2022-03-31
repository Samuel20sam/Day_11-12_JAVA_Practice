package com.bridgelabz.oops.stocks;

public class Stock
{
    String shareName;
    int noOfShare;
    float sharePrice;

    public Stock(String shareName, int noOfShare, float sharePrice) {
        this.shareName = shareName;
        this.noOfShare = noOfShare;
        this.sharePrice = sharePrice;
    }
    public void setShareName(String shareName) {
        this.shareName = shareName;
    }
    public String getShareName() {
        return shareName;
    }
    public void setNoOfShare(int noOfShare) {
        this.noOfShare = noOfShare;
    }
    public int getNoOfShare() {
        return noOfShare;
    }
    public void setSharePrice(float sharePrice) {
        this.sharePrice = sharePrice;
    }
    public float getSharePrice() {
        return sharePrice;
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome to Stock Management");
        StockPortfolio value = new StockPortfolio();
        value.stockValue();
    }
}