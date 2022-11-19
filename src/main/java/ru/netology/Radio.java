package ru.netology;

public class Radio {

    private int numberOfStation = 10;
    private int minStation = 0;
    public int currentStation = minStation;
    public int maxStation = numberOfStation - 1;
    public int currentVolume;

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
        this.maxStation = numberOfStation - 1;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getNumberOfStation() {
        return numberOfStation;
    }

    /*public int getMinStation() {
        return minStation;
    }*/

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation > maxStation) {
            return;
        }
        if (newStation < minStation) {
            return;
        }
        currentStation = newStation;
    }
    public void next() {
        int target = currentStation + 1;
        if (target > maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation = target;
    }
    public void prev() {
        int target = currentStation - 1;
        if (target < minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation = target;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newVolLevel) {
        /*if (newVolLevel > 100) {
            return;
        }
        if (newVolLevel < 0) {
            return;
        }*/
        currentVolume = newVolLevel;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
