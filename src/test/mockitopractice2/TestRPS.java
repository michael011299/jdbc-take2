package mockitopractice2;

import java.util.Random;
import static org.junit.jupiter.api.Assetions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extendwith(MockitoExtension.class)
public class TestRPS {

	@Mock
	private Random rand;

	@InjecttMocks
	private Simulator sim;
	
	
	@Test
	void testRockSuccess() {
		Mockito.when(this.rand.nextInt(2)).thenReturn(0);
		for(int i = 0; i < 1000; i++)
			assertTrue(this.sim.rps(RPS.ROCK));
		
		Mockito.verify(this.rand, Mockito.times(1000)).nextInt(0);
	}
	
	@Test
	void testRockSuccess() {
		Mockito.when(this.rand.nextInt(2)).thenReturn(1);
		for(int i = 0; i < 1000; i++)
			assertTrue(this.sim.rps(RPS.PAPER));
		
		Mockito.verify(this.rand, Mockito.times(1000)).nextInt(1);
	}
	
	@Test
	void testScissorSuccess() {
		Mockito.when(this.rand.nextInt(2)).thenReturn(2);
		for(int i = 0; i < 1000; i++)
			assertTrue(this.sim.rps(RPS.SCISSORS));
		
		Mockito.verify(this.rand, Mockito.times(1000)).nextInt(2);
	}

}
