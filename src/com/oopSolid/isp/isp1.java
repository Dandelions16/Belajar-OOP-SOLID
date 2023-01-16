package com.oopSolid.isp;

/*Untuk memahami Interface Segregation Principle, mari kita gunakan studi kasus  antara kendaraan sepeda motor dan mobil. Keduanya termasuk dalam jenis kendaraan, tetapi apakah keduanya memiliki fitur atau kelengkapan yang sama? Perhatikan contoh penerapan fitur pada sepeda motor dan mobil berikut. 

Pada sepeda motor dimodelkan sebagai class Motorcycle, sedangkan mobil dimodelkan sebagai class Car. Keduanya merupakan bagian dari interface VehicleInterface sebagai berikut:

 */

interface VehicleInterface {
  void drive();

  void stop();

  void refuel();

  void openDoors();
}

class Motorcycle implements VehicleInterface {

  // Can be implemented
  @Override
  public void drive() {

  }

  @Override
  public void stop() {

  }

  @Override
  public void refuel() {

  }

  // Can not be implemented
  @Override
  public void openDoors() {

  }
}
/*
 * Di dalam interface Vehicle, terdapat beberapa function, di antaranya drive(),
 * stop(), refuel(), dan openDoors(). Ketika class Motorcycle
 * mengimplementasikan interface tersebut, maka seluruh function dari interface
 * Vehicle akan ter-override di dalam classs Motorcycle. Namun, ada hal yang
 * kurang tepat, yaitu terdapat function openDoors(), sementara kenyataannya
 * motorcycle tersebut seharusnya tidak memiliki pintu (doors). Bagaimana kita
 * dapat mengatasinya?
 * 
 * Caranya adalah dengan menerapkan Interface Segregation Principle. Kita perlu
 * memisahkan function openDoors() ke dalam interface lain, kodenya akan menjadi
 * seperti di isp2.
 */