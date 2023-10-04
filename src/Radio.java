public class Radio extends Eletrodomestico{
    private String frequencia;

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
    @Override
    public void ligar() {
        if (!getLigado()) {
            setLigado(true);
            System.out.println("O rádio está ligado.");
        } else {
            System.out.println("O rádio já está ligado.");
        }
    }
    @Override
    public void desligar() {
        if (getLigado()) {
            setLigado(false);
            System.out.println("O rádio está desligado.");
        } else {
            System.out.println("O rádio já está desligado.");
        }
    }
}
