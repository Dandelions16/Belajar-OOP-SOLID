package com.oopSolid.dip;

/*Agar dapat memahami prinsip Dependency Inversion Principle, mari perhatikan dahulu penerapan studi kasus antara mobil dan mesin,
 yang dimodelkan menjadi kode class Car dan Engine sebagai berikut: */

class Car {

  private final Engine engine;

  public Car(EngineInterface engine) {
    this.engine = (Engine) engine;
  }

  void start() {
    engine.start();
  }
}

class Engine {
  void start() {

  }
}

/*
 * Berdasarkan kode di atas, terdapat class Car yang di dalamnya terdapat
 * constructor untuk menambahkan engine, dalam hal ini dimodelkan sebagai class
 * Engine. Namun, bagaimana jika kasusnya pada model Car yang sama, ingin
 * mengubah engine atau mesinnya. Dalam hal ini ingin menggantinya dengan diesel
 * engine (mesin diesel), seperti ini:
 */
class DieselEngine {
  void start() {

  }
}

/*
 * Salah satu cara mengatasi problem ini adalah dengan menerapkan Dependency
 * Inversion Principle.
 * 
 * Pertama, kita buat dahulu interface EngineInterface seperti berikut:
 */
interface EngineInterface {
  void start();

}
/*
 * Selanjutnya kita ubah parameter constructor dari class Car menjadi seperti
 * ini:
 * public Car(EngineInterface engine) {
 * this.engine = engine;
 * }
 */

/*
 * Sehingga kita dapat membuat class engine baru dengan masing-masing tipe mesin
 * seperti di bawah ini. Di mana masing-masing class tersebut
 * mengimplementasikan interface EngineInterface.
 */
class PetrolEngine implements EngineInterface {
  @Override
  public void start() {
  }
}

class HybridEngine implements EngineInterface {
  @Override
  public void start() {
  }
}

class DieselEngine1 implements EngineInterface {
  @Override
  public void start() {
  }
}

/*
 * Sehingga, kita dengan mudah dapat membuat jenis Car yang berbeda, cukup dari
 * satu model class Car saja. Berikut penerapan untuk pemanggilan kodenya:
 */
class Main {
  public static void main(String[] args) {
    Car fuelCar = new Car(new PetrolEngine());
    Car dieselCar = new Car(new DieselEngine1());
    Car hybridCar = new Car(new HybridEngine());

    // Booom boom
    fuelCar.start();
    dieselCar.start();
    hybridCar.start();
  }
}
/*
 * Dengan menerapkan Dependency Inversion Principle, kita dapat membuat sistem
 * yang fleksibel. Di mana ketergantungan atau dependencies pada source code
 * hanya mengacu pada abstractions bukan pada concretions (sebuah class). Pada
 * contoh di atas digambarkan dalam bentuk interface EngineInterface yang berisi
 * method start(). Sehingga, setelah prinsip ini diterapkan, high level class
 * tidak bekerja secara langsung dengan dengan low level class, tetapi
 * menggunakan interface sebagai lapisan abstraksi.
 */