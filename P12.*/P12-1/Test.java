public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        UsbFlash usbFlash = new UsbFlash();
        Audio audio = new Audio();

        car.instalAudio(audio);
        car.playMusic(usbFlash);
    }
}
