import Services.BreedService;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BreedServiceTest {
    static BreedService bs;

    @BeforeAll
    static void beforeAll() {
        bs = new BreedService();
        bs.addBreed("Collie");
        bs.addBreed("Dogo");
        bs.addBreed("San Bernardo");
        bs.addBreed("Dálmata");
    }

    @AfterAll
    static void afterAll() {

    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        
    }

    @Test
    void addBreedTest() {
        assertNotNull(bs.breeds.get(0));
    }

    @Test
    void lookForBreedTest() {
        assertTrue(bs.lookForBreed("Collie"));
        assertFalse(bs.lookForBreed("Doberman"));
    }

    @Test
    void breedFoundTest() {
        assertEquals(4, bs.breeds.size(), 0);
        bs.breedFound(true, "Collie");
        assertEquals(3, bs.breeds.size(), 0);
        bs.breedFound(false, "Caniche");
        assertEquals(3, bs.breeds.size(), 0);
    }
}
