package ru.netology;

public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newStation) {
        if (newStation > 9) {
            return;
        }
        if (newStation < 0) {
            return;
        }
        currentStation = newStation;
    }

    public void next() {
        int target = currentStation + 1;
        if (target > 9) {
            currentStation = 0;
            return;
        }
        currentStation = target;
    }

    public void prev() {
        int target = currentStation - 1;
        if (target < 0) {
            currentStation = 9;
            return;
        }
        currentStation = target;
    }

    public void setCurrentVolume(int newVolLevel) {
        if (newVolLevel > 10) {
            return;
        }
        if (newVolLevel < 0) {
            return;
        }
        currentVolume = newVolLevel;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}




