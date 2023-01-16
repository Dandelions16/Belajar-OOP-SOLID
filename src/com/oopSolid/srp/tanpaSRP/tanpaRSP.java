package com.oopSolid.srp.tanpaSRP;

public class tanpaRSP {
  class Order {
    void calculateTotalSum() {/* ... */
    }

    void getItems() {/* ... */
    }

    void getItemCount() {/* ... */
    }

    void addItem(Item item) {/* ... */
    }

    void deleteItem(Item item) {/* ... */
    }

    void printOrder() {/* ... */
    }

    void showOrder() {/* ... */
    }

    void getDailyHistory() {
    }

    void getMonthlyHistory() {
    }
  }

  class Item {

  }

  // Berdasarkan kode di atas, class Order memiliki banyak tanggung jawab
  // (responsibility). Contohnya untuk menambah item, menghapus item, kalkulasi
  // jumlah total, bahkan untuk print dan show.
}
