import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncrease1step() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.increaseStation1step();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();
        station.setCurrentStation(1);

        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStation() {
        Radio station = new Radio();
        station.setMaxStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetLess0() {
        Radio station = new Radio();
        station.setCurrentStation(-1);
        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio station = new Radio();
        station.setCurrentStation(3);
        int expexted = 3;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldNotSetMore9() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}