import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    Cupcake cupcake;

    @BeforeEach
    public void setUp() {
        cupcake = new Cupcake("Undecorated", 15.00, "Lemon", true, "yes");
    }

    @Test
    public void canAddFrosting() {
        cupcake.setAddFrosting("No, thank you!");
        assertThat(cupcake.getAddFrosting()).isEqualTo("No, thank you!");
    }

}
