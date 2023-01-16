package com.oopSolid.inharitance;

public class Inheritance {

  // Ketika ingin membuat class dengan fungsi yang sudah tersedia pada class lain,
  // kita tidak perlu lagi menulis ulang kode tersebut di dalam class yang kita
  // buat.
  // Cukup dengan mewarisi class tersebut maka kita bisa langsung mengaksesnya.
  class Superclass {

  }

  class SubClass extends Superclass {

  }

  // ================================================================================================
  // Dalam penerapan inheritance, kita akan sering mendengar beberapa istilah
  // berikut:

  // SuperClass
  // Sebuah class yang fitur-fiturnya akan diwariskan. Kelas seperti ini biasa
  // dikenal juga dengan istilah Induk, Base, atau Parent Class.

  // SubClass
  // Anak/Children class yang akan mewarisi member milik Super Class. Namun, class
  // ini tetap dapat memiliki membernya sendiri selain yang diwarisi dari
  // SuperClass-nya.

  // Lanjut dengan multilevel inheritance. Cara ini mengacu pada mekanisme OOP, di
  // mana SubClass dapat mewarisi SuperClass yang di mana merupakan sebuah
  // SubClass dari SuperClass lain.
  // Contohnya seperti kode di bawah ini:
  class Animal {
    public void walk() {
      System.out.println(getClass().getSimpleName() + " walk!");
    }
  }

  class Carnivore extends Animal {
    public void eat() {
      System.out.println("Yeay! " + getClass().getSimpleName() + " eat!");
    }
  }

  class Cat extends Carnivore {
  }

  // multiple inheritance mengacu pada konsep OOP di mana sebuah class dapat
  // mewarisi lebih dari satu SuperClass.

  // Namun perlu diketahui bahwa beberapa bahasa pemrograman seperti Java tidak
  // mendukungnya secara penuh, dengan alasan suatu SubClass harus bisa mengatur
  // ketergantungan dari 2 (dua) SuperClass-nya.

  // Tapi jika ingin menerapkannya, kita dapat memanfaatkan interfaces seperti
  // berikut:
  interface Ovipar {
  }

  interface Vivipar {
  }

  interface Ovovivipar extends Ovipar, Vivipar {
  }

  class Snake implements Ovovivipar {
  }

  // Multiple inheritance sendiri sangat jarang digunakan dalam pengembangan
  // perangkat lunak
  // karena sering menyebabkan permasalahan, terutama pada hirarki class yang
  // berpotensi menyebabkan terjadinya kompleksitas tinggi.
  // Worst case scenario-nya, permasalahan ini malah menghambat pengembangan.

  // ============================================================================================================================
  // Hierarchical Inheritance

  // Sama seperti penerapan inheritance pada umumnya, jenis ini merupakan sebuah
  // SuperClass yang diwarisi oleh beberapa SubClass. Misalnya seperti berikut:

  class Animal2 {
    public void walk() {
      System.out.println(getClass().getSimpleName() + " walk!");
    }
  }

  class Carnivore2 extends Animal {
    public void eat() {
      System.out.println("Yeay! " + getClass().getSimpleName() + " eat!");
    }
  }

  class Cat2 extends Carnivore {
  }

  class Lion extends Carnivore {
  }

  class Dog extends Carnivore {
  }
}
