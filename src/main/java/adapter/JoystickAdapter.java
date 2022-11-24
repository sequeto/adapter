package adapter;

import java.util.HashMap;
import java.util.Map;

public class JoystickAdapter extends JoystickPlaystation{
	private Joystick joystickXbox;
	private Map<String, String> comandos = new HashMap<String, String>(); 

    public JoystickAdapter(Joystick joystickXbox) {
        this.setJoystickXbox(joystickXbox);
        comandos.put("y", "triangulo");
        comandos.put("a", "x");
        comandos.put("b", "círculo");
        comandos.put("x", "quadrado");
    }
    
    public String getAcao() {
    	return this.joystickXbox.getAcao();
    }

    public String getAcaoConvertida() {
    	this.setComando(comandos.get(this.joystickXbox.getComando()));
    	return this.getAcaoPlayStation();
    }

	public Joystick getJoystickXbox() {
		return joystickXbox;
	}

	public void setJoystickXbox(Joystick joystickXbox) {
		this.joystickXbox = joystickXbox;
	}
}
