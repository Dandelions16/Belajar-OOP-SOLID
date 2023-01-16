package com.oopSolid.opc;

public class oldCinema {
  class CinemaCalculations {
    public Double calculateAdminFee(Cinema cinema) {
      if (cinema instanceof StandardCinema) {
        return ((StandardCinema) cinema).price * 10 / 100;
      } else if (cinema instanceof DeluxeCinema) {
        return ((DeluxeCinema) cinema).price * 12 / 100;
      } else if (cinema instanceof PremiumCinema) {
        return ((PremiumCinema) cinema).price * 20 / 100;
      } else
        return 0.0;
    }
  }
}

class Cinema {
  public Double price;
}

class StandardCinema extends Cinema {
  public StandardCinema(double price) {
    this.price = price;
  }
}

class DeluxeCinema extends Cinema {
  public DeluxeCinema(double price) {
    this.price = price;
  }
}

class PremiumCinema extends Cinema {
  public PremiumCinema(double price) {
    this.price = price;
  }
}

// Berdasarkan kode pada class CinemaCalculations, untuk mendapatkan perhitungan
// admin fee dilakukan operasi percabangan if else yang mengecek masing-masing
// jenis cinema. Pada kasus ini, nilai admin fee dari masing-masing cinema
// berbeda yang diurutkan dari standard hingga premium. Semakin mewah fasilitas
// cinema tersebut (termewah adalah premium), maka biaya admin fee semakin
// besar.

// Lalu, bagaimana jika ada jenis cinema baru? Untuk menambahkan cinema baru,
// kita perlu menambahkan else if lagi di percabangan calculateAdminFee. Semakin
// banyak jenis cinema-nya, maka percabangan if else-nya akan semakin bertambah,
// tentu ini menjadi problem karena kelas CinemaCalculation akan terus perlu
// diubah.

// mari kita liat ke class newCinema