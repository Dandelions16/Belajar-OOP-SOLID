package com.oopSolid.generalization;

// Contoh generalization dan specialization 

/*class yang paling umum biasa kita sebut sebagai superclass. Saat akan digambarkan ia terletak paling atas dari sebuah diagram. class yang lebih spesifik atau biasa disebut sebagai SubClass umumnya diletakkan pada bagian bawah dari superclass-nya. Jika kita perhatikan contoh di atas, class Product merupakan sebuah superclass dari beberapa SubClass di bawahnya. 
Terdapat atribut yang ada pada class Product dan dapat digunakan pada SubClass dari class Product tersebut atau biasa disebut dengan 
shared element.
class SubClass memiliki beberapa atribut yang hanya dimiliki oleh class tersebut dan tidak ada pada class SubClass yang lainnya. 
Contoh, pada class ConsumableProduct terdapat atribut expirationDate di mana class ElectronicProduct tidak memilikinya. 
Mari kita lihat penerapan generalisasi dan spesialisasi pada contoh kode di bawah ini. */

public class generalization {
  abstract class Product {
    private String id;
    private String name;
    private String price;

    public Product(String id, String name, String price) {
      this.id = id;
      this.name = name;
      this.price = price;
    }
  }

  class ElectronicProduct extends Product {
    private String id;
    private String name;
    private String price;
    private String productionDate;

    public ElectronicProduct(String id, String name, String price, String productionDate) {
      super(id, name, price);
      this.id = id;
      this.name = name;
      this.price = price;
      this.productionDate = productionDate;
    }
  }

  class ConsumableProduct extends Product {
    private String id;
    private String name;
    private String price;
    private String expirationDate;

    public ConsumableProduct(String id, String name, String price, String expirationDate) {
      super(id, name, price);
      this.id = id;
      this.name = name;
      this.price = price;
      this.expirationDate = expirationDate;
    }
  }

  // Pada contoh kode di atas, class Product memiliki beberapa atribut umum yang
  // ada pada sebuah produk.
  // Sehingga, SubClass ElectronicProduct dan ConsumableProduct akan memiliki
  // atribut turunan dari class Product dan class SubClass dapat memiliki beberapa
  // atribut spesifik yang dibutuhkan oleh class tersebut.
}
