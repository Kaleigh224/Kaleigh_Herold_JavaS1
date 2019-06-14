package com.trilogyed;

public class GiftCard {
    private float balance;
    private String type;
    private String expDate;
    private String cardNum;
    private boolean isReloadable;
    private float originalBalance;

    public GiftCard(String cardNumber, float originalBalance){
        this.cardNum = cardNumber;
        this.originalBalance = originalBalance;

    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public boolean isReloadable() {
        return isReloadable;
    }

    public void setReloadable(boolean reloadable) {
        isReloadable = reloadable;
    }

    public float getOriginalBalance() {
        return originalBalance;
    }

    public void setOriginalBalance(float originalBalance) {
        this.originalBalance = originalBalance;
    }

}
