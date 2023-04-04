import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PastryTest {

    Pastry pastry;

    @BeforeEach
    public void setup() {
        pastry = new Pastry("Croissant");
        String result = pastry.fill("Custard please!");
        assertThat(result).isEqualTo("Custard please!");


    }
}
