package com.oopSolid.aac;

/*Bentuk hubungan pertama dari asosiasi adalah agregasi yang digambarkan dengan dengan garis yang tidak putus-putus dengan ujung 
simbol diamond putih yang mengarah pada class yang memiliki.
 Meskipun sama-sama berupa hubungan yang “memiliki,”  
 perbedaan dengan bentuk hubungan komposisi adalah bentuk hubungan ini tidak terikat,
 yang berarti setiap class dapat berdiri sendiri. Seperti contoh pada gambar di atas, 
 meskipun kelas Shop dihancurkan, class Seller masih dapat digunakan. Tapi tidak sebaliknya. 
 Jika class Seller tidak ada, maka class Shop sudah tidak relevan lagi untuk digunakan. 
 Mari kita lihat contoh kode untuk bentuk hubungan agregasi sebagai berikut: */

public class aggregation {
  class Shop {
    private String id;
    private String name;
    private Seller seller;

    public Shop(String id, String name) {
      this.id = id;
      this.name = name;
    }

    public void setSeller(Seller value) {
      this.seller = value;
    }

    public final Seller getSeller() {
      return seller;
    }
  }

  class Seller {
    private String id;
    private String name;
  }

  // Jika diperhatikan, kedua kelas dapat dibuat secara independen tanpa harus
  // terdapat class lain saat pembuatannya.
}
