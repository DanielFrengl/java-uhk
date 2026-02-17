package cvic1;

import static org.junit.jupiter.api.Assertions.*;

class ZlomekTest {

    @org.junit.jupiter.api.Test
    void testEquals() {
        Zlomek z1 = new Zlomek(2,3);
        Zlomek z2 = new Zlomek(4,6);
        assertTrue(z1.equals(z2));
        Zlomek z3 = new Zlomek(-2,3);
        assertFalse(z1.equals(z3));
        assertTrue(z1.equals(z3.opacny()));
        Zlomek z4 = new Zlomek(-2,-3);
        assertTrue(z1.equals(z4));
    }
}