import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TraybakeTest{

    Traybake traybake;

    @BeforeEach
    public void setUp(){
        traybake= new Traybake("Tres Leches", 10.00, "Vanilla", false, "no");
    }

    @Test
    public void canAddSprinkles(){
        traybake.setAddSprinkles("Only if they're rainbow sprinkles!");
        assertThat(traybake.getAddSprinkles()).isEqualTo("Only if they're rainbow sprinkles!");
    }




}
