    public class Ballpoint implements USBFlash, Gun {
        private int storage;
        private double rangeLaserDay;
        private double rangeLaserNight;

        public void draw() {
            System.out.printf("Bulpen ini dapat merekam proses menggambar dengan kapasitas %s MB dan memiliki jarak laser sepanjang %s meter pada ruangan terang dan panjang laser %s meter untuk ruang yang gelap\n", this.storage, this.rangeLaserDay, this.rangeLaserNight);
        }

        public void laserPointer(double rangeLaserDay, double rangeLaserNight) {
            this.rangeLaserDay = rangeLaserDay;
            this.rangeLaserNight = rangeLaserNight;
        }

        public void storageMedia(int storage) {
            this.storage = storage;
        }
    }
