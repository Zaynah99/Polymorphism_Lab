import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;

    @BeforeEach
    public void setUp() {
        bakery = new Bakery();
    }
    @Test
    public void canSetName(){
        bakery.setName("Zaynah's Cakery");
        assertThat(bakery.getName()).isEqualTo("Zaynah's Cakery");
    }

    @Test
    public void bakeryStartsEmpty(){
        assertThat(bakery.countCakes()).isEqualTo(0);
    }

    @Test
    public void canSetTill(){
        bakery.setTill(1000.00);
        assertThat(bakery.getTill()).isEqualTo(1000.00);
    }


}
