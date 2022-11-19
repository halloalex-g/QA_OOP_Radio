package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class RadioTest {

     @Test
     public void shouldCreateRadioWithDefaultNumberOfStations() {
         Radio station = new Radio();
         Assertions.assertEquals(10, station.getNumberOfStation());
         Assertions.assertEquals(9, station.getMaxStation());
     }
     @Test
     public void shouldCreateRadioWithManuallySetNumberOfStations() {
         Radio station = new Radio(30);
         Assertions.assertEquals(30, station.getNumberOfStation());
         Assertions.assertEquals(29, station.getMaxStation());
     }

     @Test
     public void directSetStationSetDefaultRadio0_9() {
         Radio station = new Radio();
         station.setCurrentStation(8);
         Assertions.assertEquals(8, station.getCurrentStation());
     }
     @Test
     public void directSetStationSetDefaultRadioOverMax() {
         Radio station = new Radio();
         station.setCurrentStation(10);
         Assertions.assertEquals(0, station.getCurrentStation());
     }

     @Test
     public void directSetStationSetManually() {
         Radio station = new Radio(30);
         station.setCurrentStation(10);
         Assertions.assertEquals(10, station.getCurrentStation());
     }
     @Test
     public void directSetStationSetManuallyOverMax() {
         Radio station = new Radio(30);
         station.setCurrentStation(31);
         Assertions.assertEquals(0, station.getCurrentStation());
     }
     @Test
     public void ShouldNotSetStationWithNegativeValue() {
         Radio station = new Radio();
         station.setCurrentStation(-1);
         Assertions.assertEquals(0, station.getCurrentStation());
     }
     @Test
     public void nextButtonWithinMin_MaxStation() {
         Radio station = new Radio();
         station.setCurrentStation(1);
         station.next();
         Assertions.assertEquals(2, station.getCurrentStation());
     }
     @Test
     public void nextButtonFromMaxStation() {
         Radio station = new Radio(30);
         station.setCurrentStation(29);
         station.next();
         Assertions.assertEquals(0, station.getCurrentStation());
     }
     @Test
     public void prevButtonWithinMax_MinStation() {
         Radio station = new Radio();
         station.setCurrentStation(9);
         station.prev();
         Assertions.assertEquals(8, station.getCurrentStation());
     }
     @Test
     public void prevButtonFromMinStation() {
         Radio station = new Radio(30);
         station.prev();
         Assertions.assertEquals(29, station.getCurrentStation());
     }

     @Test
     public void setVolumeWhileObjectCreation() {
         Radio volume = new Radio();
         volume.getCurrentVolume();
         Assertions.assertEquals(0, volume.getCurrentVolume());
     }
     @Test
     public void volumeUp0_100() {
         Radio volume = new Radio();
         volume.increaseVolume();
         Assertions.assertEquals(1, volume.getCurrentVolume());
     }
     @Test
     public void volumeUpFrom100() {
         Radio volume = new Radio();
         volume.setCurrentVolume(100);
         volume.increaseVolume();
         Assertions.assertEquals(100, volume.getCurrentVolume());
     }
     @Test
     public void volumeDown100_0() {
         Radio volume = new Radio();
         volume.setCurrentVolume(100);
         volume.decreaseVolume();
         Assertions.assertEquals(99, volume.getCurrentVolume());
     }
     @Test
     public void volumeDownFrom0() {
         Radio volume = new Radio();
         volume.decreaseVolume();
         Assertions.assertEquals(0, volume.getCurrentVolume());
     }

 }
