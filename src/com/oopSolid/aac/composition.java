package com.oopSolid.aac;

public class composition {
  /*
   * Bentuk hubungan kedua yaitu komposisi, sebuah hubungan dapat dikatakan
   * komposisi jika sebuah kelas “memiliki” class lainnya. Aturan yang berlaku
   * untuk hubungan ini adalah ketika kelas yang “memiliki” class lainnya
   * dihancurkan maka class yang “dimiliki” oleh kelas tersebut akan hancur juga
   * atau tidak dapat digunakan. Untuk lebih mudah memahaminya mari kita contohkan
   * lewat kasus seperti gambar di atas.
   * 
   * Sebuah class User memiliki bentuk hubungan komposisi dengan class Address
   * yang ditandai dengan adanya anak panah dengan ujung diamond hitam penuh, yang
   * mengarah pada class yang “memiliki” objek tersebut. Ketika class User hancur,
   * maka class Address yang memiliki hubungan dengan class User tersebut akan
   * ikut hancur dan tidak bisa digunakan lagi. Agar lebih jelas lagi, mari kita
   * lihat penerapan kodenya dalam kelas-kelas di bawah ini.
   */

  public static final void main(String[] args) {
    User user = new User("1234", "Khrisna", new Address("123", "Bandung"));
  }

  class User {
    private String id;
    private String name;
    private Address address;

    public User(String id, String name, Address address) {
      this.id = id;
      this.name = name;
      this.address = address;
    }
  }

  class Address {
    private String id;
    private String location;

    public Address(String id, String location) {
      this.id = id;
      this.location = location;
    }
  }

  // Perhatikan kode pada fungsi main() di atas, ketika kita membuat sebuah objek
  // dari class User maka kita juga membuat sebuah objek baru dari class Address.
  // Apabila objek user kita hapus, maka objek class address akan terhapus juga.
 
  // Begitulah ilustrasi dari bentuk hubungan komposisi.
}
