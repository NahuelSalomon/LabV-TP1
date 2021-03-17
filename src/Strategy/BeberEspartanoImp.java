package Strategy;

import Interfaces.Beber;

public class BeberEspartanoImp implements Beber {

    @Override
    public void beber() {
        System.out.println("Voy a beber, soy un espartano");
    }
}
