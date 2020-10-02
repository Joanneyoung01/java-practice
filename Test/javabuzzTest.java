import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class javaBuzzTest {

    @Test
    void javaBuzz(){
        javaBuzz j  = new javaBuzz();
        assertEquals("java buzz!", j.buzzer(15));

    }
}