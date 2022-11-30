public class Car {
    public Engine engine;
    public Wheel wheels;
    public Audio audio;

    public void PersonalComputer() {
        this.engine = new Engine();
        this.audio = new Audio();
    }

    public void replaceWheel() {
        this.wheels = new Wheel();
    }

    public void instalAudio(Audio audio) {
        this.audio = audio;
    }

    public void playMusic(UsbFlash usbFlash) {
        System.out.println("Playing music from " + usbFlash);
    }
}
