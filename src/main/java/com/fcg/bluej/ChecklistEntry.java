package com.fcg.bluej;

public class ChecklistEntry {
    private int amountToUse;
    private int amountUsed;
    private Product product;

    private boolean checkStock(){
      return true;
    }

    public Product getProduct(){
      return this.product;
    }

    public int getAmountToUse(){
      return this.amountToUse;
    }
}
