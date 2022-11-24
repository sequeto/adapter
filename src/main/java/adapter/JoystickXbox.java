package adapter;

import java.util.HashMap;
import java.util.Map;

public class JoystickXbox implements Joystick{
	String comandoXbox;
	private Map<String, String> acoes = new HashMap<String, String>();
	
	public JoystickXbox() {
		acoes.put("a", "pular Xbox");
	}
	
	public String getAcao() {
		return acoes.get(this.comandoXbox);
	}
	
	public String getComando() {
		return comandoXbox;
	}
	
	public void setComando(String comando) {
		this.comandoXbox = comando;
	}
}
