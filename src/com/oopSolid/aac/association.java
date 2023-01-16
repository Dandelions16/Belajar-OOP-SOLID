package com.oopSolid.aac;

import java.util.List;

public class association {
  /*
   * Seorang pengguna memiliki hubungan one-to-many terhadap penjual. Pada contoh
   * di bawah sebuah pengguna dapat membeli barang dari satu atau beberapa
   * penjual. Oleh karena itu, pada class pengguna kita dapat menambahkan variabel
   * daftar penjual sebagai tanda bahwa kedua kelas ini memiliki hubungan
   * one-to-many.
   * 
   */

  class Seller {
    private String id;
    private String name;
  }

  class User {
    private String id;
    private String name;
    private List<Seller> sellers;
  }
  /*
   * Bentuk hubungan pertama dari asosiasi adalah agregasi yang digambarkan dengan
   * dengan garis yang tidak putus-putus dengan ujung
   * simbol diamond putih yang mengarah pada class yang memiliki.
   * Meskipun sama-sama berupa hubungan yang “memiliki,”
   * perbedaan dengan bentuk hubungan komposisi adalah bentuk hubungan ini tidak
   * terikat,
   * yang berarti setiap class dapat berdiri sendiri. Seperti contoh pada gambar
   * di atas,
   * meskipun kelas Shop dihancurkan, class Seller masih dapat digunakan. Tapi
   * tidak sebaliknya.
   * Jika class Seller tidak ada, maka class Shop sudah tidak relevan lagi untuk
   * digunakan.
   * Mari kita lihat contoh kode untuk bentuk hubungan agregasi sebagai berikut: di fille aggregation
   */

}
