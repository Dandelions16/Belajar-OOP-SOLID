package com.oopSolid.lsp;

import java.util.Date;

abstract class Product {
  abstract String getName();

  /**
   * Function to get all of information about product
   */
  public void getProductInfo() {
    // some magic code
  }
}

abstract class FoodProduct extends Product {
  abstract Date getExpiredDate();
}

class Vegetable extends FoodProduct {

  @Override
  String getName() {
    return "Broccoli";
  }

  @Override
  Date getExpiredDate() {
    return new Date();
  }
}

class Smartphone extends Product {
  @Override
  String getName() {
    return "Samsung S10+ Limited Edition";
  }
}
/*
 * Dengan perubahan kode seperti di atas, kita sudah memenuhi aturan yang ada.
 * Mudah bukan? Liskov’s Substitution principle merupakan prinsip yang dapat
 * meningkatkan design dari sistem yang kita kembangkan. Sehingga ketergantungan
 * antar klien dapat disubstitusikan tanpa klien tahu perubahan yang ada.
 */