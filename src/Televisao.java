public class Televisao extends Eletrodomestico{
    private int polegadas;

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }
    @Override
    public void ligar() {
        if (!getLigado()) {
            setLigado(true);
            System.out.println("A televisão está ligada.");
        } else {
            System.out.println("A televisão já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if (getLigado()) {
            setLigado(false);
            System.out.println("A televisão está desligada.");
        } else {
            System.out.println("A televisão já está desligada.");
        }
    }
}
