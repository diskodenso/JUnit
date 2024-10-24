public class Konto {
        private float kontostannd;

        public float getKontostand() {
            return kontostannd;
        }
        public void abheben(float summe) {
            this.kontostannd = kontostannd - summe;
        }
        public void einzahlen(float summe) {
            this.kontostannd = kontostannd + summe;
        }
    }

