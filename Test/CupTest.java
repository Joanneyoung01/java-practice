import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("Orange Juice", 85);
        assertEquals("Orange Juice", c.getLiquidType());
    }

    void getPercentFull(){

    }
}