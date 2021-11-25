package com.kodilla.inheritance.homework;
public class Application2 {
    public static void main(String[] args) {
        OperatingSystem operatingsystem = new OperatingSystem(1900);
  operatingsystem.turnOn();
  Linux linux = new Linux(1995);
  linux.helloLinux();
  linux.linuxInformation();
        System.out.println(linux.getYearOfProduction());

  Windows windows = new Windows(2020);
  windows.helloWindows();
  windows.windowsInformation();
        System.out.println(windows.getYearOfProduction());


    }
}
