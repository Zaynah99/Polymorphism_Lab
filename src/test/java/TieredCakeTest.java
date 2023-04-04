import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {

    TieredCake tieredCake;

    @BeforeEach
    public void setUp(){
        tieredCake = new TieredCake("Birthday Cake", 25.00,"Vanilla",false, 3);
    }

    @Test
    public void canSetTiers(){
    tieredCake.setTiers(3);
    assertThat(tieredCake.getTiers()).isEqualTo(3);
    }

    @Test
    public void canAddFilling(){
        assertThat(tieredCake.addFilling()).isEqualTo("Jam");
    }



}
