package com.oopSolid.depedency;

/*Hubungan dependensi diartikan sebagai hubungan antara dua buah class, 
di mana satu class memiliki ketergantungan dengan class lainnya tetapi class lainnya tidak/mungkin memiliki 
ketergantungan terhadap class pertama tadi. Jadi apa pun perubahan yang terjadi pada class pertama dapat mempengaruhi fungsi class yang memiliki ketergantungan pada class tersebut. 
Hubungan dependensi terjadi apabila, sebuah fungsi pada class A membutuhkan class B sebagai parameter, fungsi pada class A memiliki nilai kembalian berupa class B, dan class A menggunakan class B tetapi class B bukan merupakan sebuah atribut. Kok mirip seperti hubungan asosiasi? Sebenarnya hubungan asosiasi sudah pasti memiliki hubungan dependensi. Hubungan asosiasi dapat  menjadi hubungan dependensi jika kelas yang dibutuhkan bukan merupakan atribut dari class yang membutuhkannya. */

// Hubungan dependensi digambarkan dengan garis putus-putus yang memiliki anak panah, 
// di mana arah anak panah menunjukkan dependensinya. Pada gambar di atas kita dapat melihat bahwa kelas ShopService memiliki hubungan dengan kelas Product, 
// tetapi kelas Dependecy tidak memiliki atribut berupa kelas Product. Mari kita lihat contoh penerapan kodenya di bawah ini.


public class Dependency {
  public void changeProductPrice(String price, Product product) {
    product.changePrice(price);
  }
}

class Product {
  private String id;
  private String name;
  private String price;

  public Product(String id, String name, String price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public void changePrice(String value) {
    this.price = value;
  }
}
