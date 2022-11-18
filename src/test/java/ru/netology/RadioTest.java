package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class RadioTest {

     @Test
     public void shouldSetStationByDefault() {
         Radio station = new Radio();
         Assertions.assertEquals(10, station.getNumberOfStation());
         Assertions.assertEquals(9, station.getMaxStation());
     }
     @Test
     public void shouldSetStationManually() {
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
 }






    /*




    @Test
    public void prevButton0_9() {

        station.setCurrentStation(0);
        station.prev();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void directSetStationMore9() {

        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void directSetStationLess0() {

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncrease0_9() {

        volume.setCurrentVolume(9);
        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncrease10() {

        volume.setCurrentVolume(10);
        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDecrease10_1() {

        volume.setCurrentVolume(1);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeDecrease0() {

        volume.setCurrentVolume(0);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolShouldNotSetLess0() {

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volShouldNotSetMore10() {

        volume.setCurrentVolume(11);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVol0_10() {

        volume.setCurrentVolume(5);

        int expected = 5;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}*/