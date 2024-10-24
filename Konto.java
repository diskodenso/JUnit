public class Konto {
        private float kontostand = 0;

/*    public Konto(float kontostand) {
        this.kontostand = kontostand;
    }*/

    public float getKontostand() {
            return kontostand;
        }
        public void abheben(float summe) {
            if (summe > kontostand && summe < 0) {
                throw new IllegalArgumentException("Unvalid amount");
            }
            this.kontostand = kontostand - summe;
        }
        public void einzahlen(float summe) {
            if (summe < 0) throw new IllegalArgumentException("Unvalid amount");
            this.kontostand = kontostand + summe;
        }
    }

