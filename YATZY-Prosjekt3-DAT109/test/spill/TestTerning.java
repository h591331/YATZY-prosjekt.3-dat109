package spill;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Array;
import static org.junit.jupiter.api.Assertions.*;

class TestTerning {

    int terning;
    Array<Integer> terningklasse;

    @BeforeAll
    static void setup() {
        //Oppsett
    }

    @BeforeEach
    void reset() {
        //Gjør klar til ny test
    }

    @Test
    void testEnkeltTerning() {

        assertTrue(terning > 0);
        assertTrue(terning <= 6);
    }

    @Test
    void testAlleTerninger() {

    }




}