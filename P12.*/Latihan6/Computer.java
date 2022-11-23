public class Computer extends FlashDisk {
    private Motherboard motherboard = new Motherboard();
    private Monitor monitor;
    private Mouse mouse;

    private Computer() {
        monitor = new Monitor();
        mouse = new Mouse();
    }

    private void plugFlashDisk(FlashDisk flashDisk) {
        flashDisk.read();
    }

    private void installMouse(Mouse mouse) {
        motherboard.installMouse(mouse);
    }

    private void instalMonitor(Monitor monitor) {
        motherboard.installMonitor(monitor);
    }

}
