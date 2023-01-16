package com.oopSolid.polymorphism;

public class CompileTimePolymorhism {

  // Compile time polymorphism adalah sebuah proses di mana sebuah method atau
  // fungsi dipanggil saat kompilasi. Ini dapat terjadi karena sebuah konsep
  // bernama method overloading. Method overloading merupakan kondisi di mana kita
  // bisa membuat 2 (dua) atau lebih fungsi yang memiliki jumlah, tipe, atau
  // urutan parameter yang berbeda di dalam sebuah class.

  // Contoh penerapannya terbagi atas 2 (dua) yang didasari atas pengertian method
  // overloading itu sendiri. Pertama adalah parameter type dengan contoh kode
  // seperti di bawah ini:

  class Arithmetic {
    public int add(int valueA, int valueB) {
      return valueA + valueB;
    }

    public long add(long valueA, long valueB) {
      return valueA + valueB;
    }

    public long add(int valueA, long valueB) {
      return valueA + valueB;
    }

    public long add(long valueA, int valueB) {
      return valueA + valueB;
    }
  }

  // Method overloading di atas dibedakan atas tipe argumen yang menjadi parameter
  // dari fungsi tersebut. Bagaimana pemanggilan dari beberapa fungsi di atas
  // ditentukan? Kuncinya ada pada argumen yang disematkan ketika fungsi tersebut
  // digunakan di dalam program. Argumen tersebut mendasari berjalannya proses
  // kompilasi.

  class Arithmetic2 {
    public int add(int valueA, int valueB) {
      return valueA + valueB;
    }

    public long add(long valueA, long valueB) {
      return valueA + valueB;
    }

    public long add(int valueA, long valueB) {
      return valueA + valueB;
    }

    public long add(long valueA, int valueB) {
      return valueA + valueB;
    }
  }

  class Add extends Arithmetic2 {
    @Override
    public int add(int valueA, int valueB) {
      System.out.println("Calculate!");
      return super.add(valueA, valueB);
    }
  }

  // Runtime Polymorphism
  // Berbeda dengan compile time polymorphism yang memanggil fungsi ketika proses
  // kompilasi, runtime polymorphism adalah proses di mana sebuah fungsi dipanggil
  // pada saat runtime. Contoh dari runtime polymorphism adalah method overriding,
  // yaitu sebuah kelas yang memiliki fungsi dengan nama sama dengan fungsi yang
  // di dalam kelas induknya.

  // Sederhananya, method overriding adalah sebuah fitur pada sebuah bahasa
  // pemrograman yang memungkinan sub class mewarisi sebuah implementasi yang

  
  
  // spesifik dari sebuah fungsi yang ada pada kelas induknya (parent class).
  // Implementasi pada sub class akan menimpa atau mengganti implementasi pada
  // parent class.

  // Lantas kenapa method overriding dipanggil saat runtime? Jawabannya, ketika
  // proses kompilasi berlangsung, kompiler tidak tahu fungsi mana yang dipanggil.
  // Apakah yang berada pada sub class atau parent class-nya? Keduanya punya nama
  // yang sama. Sehingga, JVM (Java Virtual Machine)-lah yang akan berperan
  // menentukan fungsi mana yang akan dipanggil ketika runtime.

  // Cara menerapkan method overriding pun sederhana. Cukup seperti contoh kode
  // berikut:

  public void main(String[] args) {
    
    Cat cat = new Cat();
    cat.walk();
  }

  class Animal {
    public void walk() {
      System.out.println(getClass().getSimpleName() + " walk!");
    }
  }

  class Cat extends Animal {
    @Override
    public void walk() {
      super.walk();
      System.out.println("Yeay! " + getClass().getSimpleName() + " walked!");
    }
  }
}
