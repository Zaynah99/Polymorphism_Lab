import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PastryTest {

Pastry pastry;

//    @BeforeEach
//    public void setup() {
//        pastry = new Pastry("Custard please!");
//        String result = pastry.fill("Custard please!");
//        assertThat(result).isEqualTo("Custard please!");


    @Test
    public void canAddFilling() {
        String result = pastry.fill("Custard please!");
        assertThat(result).isEqualTo("Custard please!");

    }
}
