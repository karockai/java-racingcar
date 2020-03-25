package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.RacingCar;
import racingcar.domain.RacingWinner;

import java.util.ArrayList;
import java.util.List;

public class RacingWinnerTest {
    List<RacingCar> racers;

    @BeforeEach
    void setUp() {
        racers = new ArrayList<>();
        RacingCar racer1 = new RacingCar("광유", 3);
        RacingCar racer2 = new RacingCar("재석", 5);
        RacingCar racer3 = new RacingCar("포비", 5);
        racers.add(racer1);
        racers.add(racer2);
        racers.add(racer3);
    }

    @Test
    void createRaceWinner() {
        assertThat(new RacingWinner(racers)).isNotNull();
    }

    @Test
    void findWinnerNameTest() {
        assertThat(new RacingWinner(racers).findWinnerNames()).containsExactly("재석", "포비");
    }
}