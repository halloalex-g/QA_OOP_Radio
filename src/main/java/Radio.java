public class Radio {
    public int currentStation;
    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseStation1step() {
        int target = currentStation + 1;
        setCurrentStation(target);
    }

    public void setCurrentStation(int newStation) {
        if (newStation > 9) {
            currentStation = 0;
            return;
        }
        if (newStation < 0) {
            currentStation = 9;
            return;
        }
        currentStation = newStation;
    }

    public void setMaxStation() {
        currentStation = 9;
    }
}




