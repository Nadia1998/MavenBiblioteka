package rs.ac.bg.fon.ai.MavenBiblioteka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KnjigaTest {

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public final void test() {
		fail("Not yet implemented"); // TODO
	}
	@Test
	public void testSetNaslov() {
		Knjiga k=new Knjiga();
		k.setNaslov("Naslov1");
		assertEquals("Naslov1", k.getNaslov());
	}

}
