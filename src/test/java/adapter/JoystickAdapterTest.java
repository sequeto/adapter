package adapter;

import static org.junit.Assert.*;
import org.junit.Test;


public class JoystickAdapterTest {
	@Test
	public void deveRetornarAcaoXbox() {
		Jogador jogador = new Jogador();
		jogador.setComando("a");
		
		assertEquals("pular Xbox", jogador.getAcaoXbox());
	}
	
	@Test
	public void deveRetornarAcaoPlayStation() {
		Jogador jogador = new Jogador();
		jogador.setComando("a");
		
		assertEquals("pular Playstation", jogador.getAcaoPlayStation());
	}
}
