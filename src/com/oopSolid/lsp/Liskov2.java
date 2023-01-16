package com.oopSolid.lsp;

import java.util.Date;

abstract class Product {
  abstract String setName();

  abstract Date setExpiredDate();

  /**
   * Function to get all of information about product
   */
  public void getProductInfo() {
    // some magic code
  }
}

class Vegetable extends Product {

  @Override
  String setName() {
    return "Broccoli";
  }

  @Override
  Date setExpiredDate() {
    return new Date();
  }
}

class Smartphone extends Product {

  @Override
  String setName() {
    return "Samsung S10+ Limited Edition";
  }

  @Override
  Date setExpiredDate() {
    return new Date(); // ???????
  }
}
/*
 * Pada kode di atas hubungan antara kelas Product dan kelas Vegetable sudah
 * benar dan dapat berjalan dengan baik. Tapi jika kita perhatikan pada kelas
 * Smartphone, di dalamnya terdapat member yang nilainya adalah masa kedaluwarsa
 * produk yang harus kita tentukan. Namun seperti yang kita ketahui, sebuah
 * smartphone tidaklah mempunyai masa kedaluwarsa. Dalam kasus ini kelas Product
 * menjadi tidak relevan untuk diwariskan ke kelas Smartphone dan ini tentunya
 * melanggar aturan SubClass yang sudah kita pelajari di modul sebelumnya.
 * 
 * Untuk mengatasi kasus di atas, kita perlu melakukan substitusi fungsi yang
 * tidak relevan tersebut ke dalam kelas abstraksi sendiri dan diwariskan pada
 * kelas yang relevan. Namun, Perubahan ini tetap menjadikan kelas Product
 * sebagai SuperClass dari hirarki yang ada saat ini. Kurang lebih perubahannya
 * akan seperti berikut di liskov 3;
 */