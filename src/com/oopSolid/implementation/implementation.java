package com.oopSolid.implementation;

/*Interface realization adalah hubungan realisasi khusus antara classifier dan interface. 
0Hubungan ini menandakan bahwa classifier mengimplementasikan kontrak yang telah ditentukan oleh kelas interface.
Kelas classifier dapat mengimplementasikan satu atau beberapa kelas interface. 
Classifier yang mengimplementasikan interface mendukung serangkaian fitur yang dimiliki oleh kelas interface. 
Selain mendukung fitur, kelas classifier harus mematuhi batasan yang dimiliki oleh kelas interface. 
Mari kita lihat implementasi pada kode berikut. */

interface ProductService {
  public void getProduct(String id);

  public void calculateProductPrice();
}

class ProductServiceImpl implements ProductService {
  @Override
  public void getProduct(String id) {
    // Implementation code
  }

  @Override
  public void calculateProductPrice() {
    // Implementation code
  }
}

// ada contoh kode diatas kelas ProductServiceImpl merupakan kelas classifier 
// yang mengimplementasikan kontrak dari kelas interface-nya yaitu kelas ProductService. 