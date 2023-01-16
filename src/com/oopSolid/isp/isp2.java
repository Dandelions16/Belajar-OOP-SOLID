package com.oopSolid.isp;

interface VehicleInterface {
  void drive();

  void stop();

  void refuel();
}

interface DoorInterface {
  void openDoors();
}

// Selanjutnya, pada class MotorCycle yang hanya mengimplementasikan interface
// Vehicle menjadi seperti ini:
class Motorcycle implements VehicleInterface {

  @Override
  public void drive() {

  }

  @Override
  public void stop() {

  }

  @Override
  public void refuel() {

  }
}

/*
 * Maka, interface DoorInterface dapat diterapkan pada class lain, misalnya pada
 * class Car, di mana kenyataannya mobil memiliki pintu. Sehingga kita dapat
 * menerapkannya menjadi seperti berikut.
 * 
 */

 class Car implements VehicleInterface, DoorInterface {
 
  @Override
  public void drive() {

  }

  @Override
  public void stop() {

  }

  @Override
  public void refuel() {

  }

  @Override
  public void openDoors() {

  }
}