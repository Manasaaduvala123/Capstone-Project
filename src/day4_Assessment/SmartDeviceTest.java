package day4_Assessment;

abstract class SmartDevice {
 abstract void turnOn();
 abstract void turnOff();
 abstract void performFunction();
}
class SmartPhone extends SmartDevice {
 void turnOn() {
     System.out.println("SmartPhone is turned ON");
 }

 void turnOff() {
     System.out.println("SmartPhone is turned OFF");
 }

 void performFunction() {
     System.out.println("SmartPhone is used for calling and browsing.");
 }
}
class SmartWatch extends SmartDevice {
 void turnOn() {
     System.out.println("SmartWatch is turned ON");
 }

 void turnOff() {
     System.out.println("SmartWatch is turned OFF");
 }

 void performFunction() {
     System.out.println("SmartWatch tracks fitness and shows time.");
 }
}
class SmartSpeaker extends SmartDevice {
 void turnOn() {
     System.out.println("SmartSpeaker is turned ON");
 }

 void turnOff() {
     System.out.println("SmartSpeaker is turned OFF");
 }

 void performFunction() {
     System.out.println("SmartSpeaker plays music and responds to voice commands.");
 }
}
public class SmartDeviceTest {
 public static void main(String[] args) {
     SmartDevice[] devices = new SmartDevice[3];
     devices[0] = new SmartPhone();
     devices[1] = new SmartWatch();
     devices[2] = new SmartSpeaker();
     for (SmartDevice device : devices) {
         device.turnOn();
         device.performFunction();  
         device.turnOff();
     }
 }
}
/*
output
SmartPhone is turned ON
SmartPhone is used for calling and browsing.
SmartPhone is turned OFF
SmartWatch is turned ON
SmartWatch tracks fitness and shows time.
SmartWatch is turned OFF
SmartSpeaker is turned ON
SmartSpeaker plays music and responds to voice commands.
SmartSpeaker is turned OFF
*/
