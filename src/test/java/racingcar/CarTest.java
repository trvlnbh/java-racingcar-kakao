package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("mac", 4);
    }

    @Test
    public void create() {
        assertThat(car).isEqualTo(new Car("mac", 4));
    }

    @Test
    public void name() {
        assertThat(car.getName()).isEqualTo("mac");
    }

    @Test
    public void position() {
        assertThat(car.getPosition()).isEqualTo(4);
    }

    @Test
    public void moveOnce() {
        car.move(7);
        assertThat(car.getPosition()).isEqualTo(5);
    }

    @Test
    public void moveNone() {
        car.move(2);
        assertThat(car.getPosition()).isEqualTo(4);
    }
}
