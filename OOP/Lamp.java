class Lamp_status {
    boolean isOn;

    void Lamp_ON() {
        isOn = true;
        System.out.println("Lamp is On");
    }

    void Lamp_OFF() {
        isOn = false;
        System.out.println("Lamp is off");
    }
}

public class Lamp {
    public static void main(String[] args) {
        Lamp_status LED = new Lamp_status();
        LED.Lamp_ON();
        LED.Lamp_OFF();
    }
}