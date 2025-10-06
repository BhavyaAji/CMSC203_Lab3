import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook testOne;
    private GradeBook testTwo;
	@BeforeEach
	void setUp() throws Exception {
		testOne = new GradeBook(5);
		testTwo = new GradeBook(5);
		testOne.addScore(100);
		testOne.addScore(90);
		testOne.addScore(80);
		
		testTwo.addScore(95);
		testTwo.addScore(100);
		testTwo.addScore(89);
	}

	@AfterEach
	void tearDown() throws Exception {
		testOne = null;
		testTwo = null;
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}
	
	@Test
	void testAddScore() {
	    assertTrue(testOne.toString().equals("100.0 90.0 80.0 "),
	            "testOne scores do not match expected values");
	    assertTrue(testTwo.toString().equals("95.0 100.0 89.0 "),
	            "testTwo scores do not match expected values");

	    assertEquals(3, testOne.getScoreSize());
	    assertEquals(3, testTwo.getScoreSize());
	}

	@Test
	void testSum() {
	    assertEquals(270.0, testOne.sum(), 0.001);
	    assertEquals(284.0, testTwo.sum(), 0.001);
	}

	@Test
	void testMinimum() {
	    assertEquals(80.0, testOne.minimum(), 0.001);
	    assertEquals(89.0, testTwo.minimum(), 0.001);
	}

	@Test
	void testFinalScore() {
	    assertEquals(190.0, testOne.finalScore(), 0.001);  // 270 - 80
	    assertEquals(195.0, testTwo.finalScore(), 0.001);  // 284 - 89
	}
	

}
