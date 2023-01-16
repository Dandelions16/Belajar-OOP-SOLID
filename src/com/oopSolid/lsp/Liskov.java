package com.oopSolid.lsp;

import java.util.Date;

// Sama seperti contoh kasus sebelum-sebelumnya, kita akan memulai dengan skenario yang menyalahi aturan dalam penerapan. Lebih lanjut, kita akan coba membahas bagaimana mengubah penerapannya agar sesuai dengan prinsip Liskov’s substitution. 
// Untuk itu, berikut adalah contoh diagram dan kode dari skenario yang akan kita gunakan:


abstract class Product {
  abstract String getName();

  abstract Date getExpiredDate();

  /**
   * Function to get all of information about product
   */
  public void getProductInfo() {
    // some magic code
  }
}

class Vegetable extends Product {

  @Override
  String getName() {
    return "Broccoli";
  }

  @Override
  Date getExpiredDate() {
    return new Date();
  }
}
/*
 * Pada contoh kode di atas kita memiliki sebuah kelas abstract bernama Product
 * yang di dalamnya terdapat pula beberapa member abstract . Kelas tersebut
 * diwariskan oleh kelas lain yaitu kelas Vegetable. Untuk saat ini, kelas
 * tersebut dapat berjalan dengan baik sesuai dengan fungsinya.
 * 
 * Selanjutnya kita membutuhkan sebuah kelas produk baru. Katakanlah produk
 * smartphone. Untuk itu, kita tinggal membuat kelas baru yang mewarisi kelas
 * Product karena kelas tersebut merupakan abstraksi dari sebuah kelas produk.
 * Kurang lebih diagram dan kodenya akan seperti berikut:
 */
