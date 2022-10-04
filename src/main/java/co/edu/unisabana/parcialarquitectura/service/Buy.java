package co.edu.unisabana.parcialarquitectura.service;


import co.edu.unisabana.parcialarquitectura.Buy_database;
import co.edu.unisabana.parcialarquitectura.repository.Database;

import javax.xml.crypto.Data;

public class Buy implements Buy_database {

  public String makePurchase(int vendorCode, int buyerCode, String item) {
    if (buyerCode == vendorCode) {
      throw new IllegalSaleException(vendorCode, buyerCode);
    }
    int result = this.database.savePurchase(buyerCode, item);
    if (result == 1) {
      return "Product sold";
    } else {
      return "The sale was not possible";
    }
  }
}
