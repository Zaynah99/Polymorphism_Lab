import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CakeTest {

    Cake cake;

    @BeforeEach
    public void setUp(){
        cake = new TieredCake("Delicious", 10.00, "Chocolate", false, 3);
    }

    @Test
    public void canSetName(){
        cake.setName("Yummy");
        assertThat(cake.getName()).isEqualTo("Yummy");
    }

    @Test
    public void canSetPrice(){
        cake.setPrice(0.00);
        assertThat(cake.getPrice()).isEqualTo(40.00);
    }

    @Test
    public void canSetBaseFlavour(){
        cake.setBaseFlavour("Vanilla");
        assertThat(cake.getBaseFlavour()).isEqualTo("Vanilla");
    }

    @Test
    public void setIsHealthyOption(){
        cake.setIsHealthyOption(false);
        assertThat(cake.getIsHealthyOption()).isEqualTo(false);
    }

    @Test
    public void canAddAlcohol(){
        //cake.setCanAddAlcohol(true);
        assertThat(cake.getAddAlcohol()).isEqualTo(true);
    }




}
