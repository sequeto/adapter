package adapter;

import java.util.HashMap;
import java.util.Map;

public class JoystickPlaystation {
	private String comandoPlaystation;
	private Map<String, String> acoes = new HashMap<String, String>();

	public JoystickPlaystation() {
		acoes.put("x", "pular Playstation");
	}
	
	public String getAcaoPlayStation() {
		return acoes.get(this.comandoPlaystation);
	}

    public String getComando() {
        return comandoPlaystation;
    }

    public void setComando(String comando) {
        this.comandoPlaystation = comando;
    }
}
