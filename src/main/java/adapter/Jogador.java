package adapter;

public class Jogador {
	Joystick joystick;
    JoystickAdapter adapter;

    public Jogador() {
        joystick = new JoystickXbox();
        adapter = new JoystickAdapter(joystick);
    }

    public void setComando(String comando) {
        joystick.setComando(comando);
    }

    public String getAcaoXbox() {
        return adapter.getAcao();
    }

    public String getAcaoPlayStation() {
        return adapter.getAcaoConvertida();
    }
}
