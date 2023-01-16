package com.oopSolid.opc;

public class newCinema {
  abstract class Cinema {
    public Double price;

    abstract Double calculateAdminFee();
  }

  class StandardCinema extends Cinema {
    public StandardCinema(Double price) {
      this.price = price;
    }

    @Override
    Double calculateAdminFee() {
      return price * 10 / 100;
    }
  }

  class DeluxeCinema extends Cinema {
    public DeluxeCinema(Double price) {
      this.price = price;
    }

    @Override
    Double calculateAdminFee() {
      return price * 12 / 100;
    }
  }

  class PremiumCinema extends Cinema {
    public PremiumCinema(Double price) {
      this.price = price;
    }

    @Override
    Double calculateAdminFee() {
      return price * 20 / 100;
    }
  }

  // // Dengan menerapkan OCP (Open Close Principle), kita dapat mengubah class
  // cinema menjadi abstract class. Di dalamnya terdapat abstract function
  // calculateAdminFee() yang akan mengembalikan nilai admin fee. Jadi,
  // perhitungan admin fee diletakkan pada masing-masing jenis cinema, dalam hal
  // ini dimodelkan dalam bentuk class Cinema yang berbeda seperti StandardCinema,
  // DeluxeCinema, dan PremiumCinema. Sehingga, seluruh class akan lebih mudah
  // untuk ekstensi dengan class Cinema. Tentu akan lebih mudah jika kita ingin
  // menambahkan cinema baru. Contohnya,
  // ada jenis cinema baru yang bernama CoupleCinema, maka kita tinggal membuat
  // class baru seperti ini:

  class CoupleCinema extends Cinema {
    public CoupleCinema(Double price) {
      this.price = price;
    }

    @Override
    Double calculateAdminFee() {
      return price * 15 / 100;
    }
  }

  // Lebih mudah dan rapi kan, daripada menggunakan if else.

  // Jika kita ingin membuat class cinema maka contoh kode programnya adalah
  // seperti berikut:
  class Main {
    public static void main(String[] args) {
      StandardCinema standardCinema = new StandardCinema(100.0);
      Double adminFee = standardCinema.calculateAdminFee();
      System.out.println(adminFee);
    }
  }

}
