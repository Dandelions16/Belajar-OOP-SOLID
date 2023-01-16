package com.oopSolid.studiKasus;

/*Kita mulai dengan pemodelan kelas Car seperti berikut: */

interface Vehicle<T> {
  void accelerate();

  void brake();

  void refill(T source);
}

class Car1<T> implements Vehicle<T> {
  private EngineInterface engine;
  private StorageInterface<T> storage;

  public Car1(EngineInterface engine, StorageInterface<T> storage) {
    this.engine = engine;
    this.storage = storage;
  }

  @Override
  public void accelerate() {
    engine.move();
  }

  @Override
  public void brake() {

  }

  @Override
  public void refill(T source) {
    storage.fill(source);
  }
}

/*
 * Di dalamnya terdapat parameter EngineInterface, yaitu sebuah interface yang
 * berfungsi agar dapat digunakan oleh dua mesin yang berbeda. Selain itu juga
 * terdapat parameter StorageInterface sebagai interface yang berfungsi agar
 * dapat digunakan oleh dua sumber daya yang berbeda. Penggunaannya adalah pada
 * mesin bahan bakar bensin konvensional dan mesin dengan sumber daya listrik.
 */

interface EngineInterface {
  void move();
}

interface StorageInterface<T> {
  void fill(T source);

  T getSource();
}

/*
 * Agar dapat memahami apa saja komponen di dalam mesin bahan bakar bensin,
 * perhatikan contoh pemodelan ini yang dibuat dalam bentuk class PetrolEngine:
 */
class PetrolEngine implements EngineInterface {

  private OilPipe oilPipe;
  private Piston piston;

  public PetrolEngine(OilPipe oilPipe, Piston piston) {
    this.oilPipe = oilPipe;
    this.piston = piston;
  }

  @Override
  public void move() {
    Oil oil = oilPipe.suckOil();
    Energy energy = oil.burn();
    energy.push(piston);
  }
}

class Piston {
  void move() {

  }
}

class OilPipe {
  Oil suckOil() {
    return new Oil();
  }
}

class Oil {
  Energy burn() {
    // Do some combustion process here
    return new Energy();
  }
}

class Energy {
  public Energy() {
  }

  void push(Piston piston) {
    piston.move();
  }
}

class Tank implements StorageInterface<Oil> {

  private Oil oil;

  @Override
  public void fill(Oil source) {
    this.oil = source;
  }

  @Override
  public Oil getSource() {
    return oil;
  }
}
/*
 * Dalam class PetrolEngine untuk mesin mobil bahan bakar bensin konvensional,
 * class PetrolEngine ini implements EngineInterface agar dapat digunakan pada
 * parameter class Car. Terdapat pula class Tank yang implements
 * StorageInterface, class ini berfungsi sebagai penyimpanan bensin, di mana
 * dimodelkan sebagai class Oil. Kemudian terdapat class OilPipe yang memiliki
 * method suckOil(), berfungsi sebagai pipa penghubung untuk menyedot bensin
 * dari tank.
 * 
 * Selanjutnya bensin tersebut melalui proses pembakaran (combustion) untuk
 * menghasilkan energy yang dimodelkan pada class Energy. Langkah terakhir
 * adalah energy tersebut digunakan untuk menggerakkan piston agar mobil dapat
 * bergerak. Sehingga kira-kira penerapan class-nya menjadi seperti ini:
 */
// Petrol car
// StorageInterface tank = new Tank();
// OilPipe oilPipe = new OilPipe();
// Piston piston = new Piston();
// EngineInterface petrolEngine = new PetrolEngine(oilPipe, piston);
// Car<Oil> petrolCar = new Car<Oil>(petrolEngine, tank);
// Oil oil = new Oil();
// petrolCar.refill(oil);
// petrolCar.accelerate();
// petrolCar.brake();

/*
 * Sekarang mari perhatikan kembali bagaimana pemodelan dari mesin sumber daya
 * listrik, yang dibuat dalam bentuk class ElectricEngine. Class ElectricEngine
 * ini implement EngineInterface agar dapat digunakan sebagai parameter pada
 * class Car. Di dalamnya terdapat komponen yang berbeda dari mesin bahan bakar
 * bensin konvensional. Berikut adalah class ElectricEngine yang berisi komponen
 * pendukung di dalamnya:
 */

class ElectricEngine implements EngineInterface {

  private SpeedController speedController;

  public ElectricEngine(SpeedController speedController) {
    this.speedController = speedController;
  }

  @Override
  public void move() {
    speedController.control();
  }
}

class SpeedController {

  private BatteryManagementSystem bms;
  private ElectricMotor motor;

  public SpeedController(BatteryManagementSystem bms, ElectricMotor motor) {
    this.bms = bms;
    this.motor = motor;
  }

  void control() {
    Battery battery = bms.getBattery();
    motor.rotate(battery);
  }
}

class BatteryManagementSystem {
  Battery getBattery() {
    return new Battery(new Electrons());
  }
}

class ElectricMotor {
  void rotate(Battery battery) {
    // Rotate the rotor using electric power from battery
  }
}

class Electrons {
}

class Battery implements StorageInterface<Electrons> {

  private Electrons electrons;

  public Battery(Electrons electrons) {
    this.electrons = electrons;
  }

  @Override
  public void fill(Electrons source) {

  }

  @Override
  public Electrons getSource() {
    return electrons;
  }
}

/*
 * Pada class ElectricEngine, terdapat class SpeedController yang digunakan
 * sebagai pengatur kecepatan. Di dalamnya terdapat class
 * BatteryManagementSystem yang digunakan untuk sistem pengisian daya atau
 * pengaturan daya dan class ElectricMotor sebagai tenaga penggerak mobil, motor
 * listrik ini membutuhkan daya listrik dari baterai. Sumber tenaga disimpan
 * pada baterai yang dimodelkan pada class Battery implements StorageInterface.
 * Di dalam Battery terdapat class Electrons, yang diibaratkan sebagai listrik
 * yang tersimpan pada baterai. Sehingga, kira-kira penerapan class-nya menjadi
 * seperti ini:
 */

// //Electric car
// Electrons electrons = new Electrons();
// StorageInterface battery = new Battery(electrons);
// SpeedController speedController = new SpeedController(new
// BatteryManagementSystem(), new ElectricMotor());
// EngineInterface electricEngine = new ElectricEngine(speedController);
// Car<Electrons> electricCar = new Car<Electrons>(electricEngine, battery);
// electricCar.refill(electrons);
// electricCar.accelerate();
// electricCar.brake();

/*
 * Berdasarkan ilustrasi dari studi kasus di atas, pada penerapan mobil dengan
 * dua mesin yang berbeda, yaitu pada mobil dengan bahan bakar bensin
 * konvensional dan mobil dengan sumber daya listrik, dapat dibuat dengan satu
 * class Car yang sama. Di mana di dalamnya terdapat dua interface sebagai
 * parameter, jadi sebenarnya kita dapat membuat class Car tersebut dengan
 * mesin/engine apa saja asalkan memenuhi syarat dengan implements interface
 * EngineInterface dan StorageInterface. Di sinilah salah satu peran prinsip
 * SOLID.
 * 
 * Dengan menerapkan prinsip OCP dan DIP, kita tidak perlu membuat class baru
 * untuk masing-masing tipe mesin yang berbeda, juga tidak perlu me-refactor
 * class apabila terdapat perubahan tipe mesin baru. Selain itu, prinsip SRP
 * juga digunakan untuk memisahkan masing-masing tanggung jawab pada class
 * PetrolEngine, sehingga seluruhnya tidak ditumpuk pada class PetrolEngine.
 * Pemisahan juga dilakukan pada interface yang berbeda dengan menerapkan
 * prinsip ISP. Nah, kira-kira seperti itulah penerapan prinsip SOLID pada studi
 * kasus mobil dengan tipe mesin yang berbeda, meskipun pada kenyataannya sistem
 * pada mobil lebih kompleks, kita hanya menggunakan beberapa komponen saja
 * untuk memudahkan kita membuat pemodelannya.
 */