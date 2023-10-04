
public class Main {
    public static void main(String[] args) {

        Radio radio = new Radio();
        Televisao televisao = new Televisao();


        System.out.println("Rádio");

        radio.setVoltagem("110V");
        radio.setFrequencia("FM");
        radio.ligar();
        System.out.println("Frequencia atual do rádio: " + radio.getFrequencia());
        radio.desligar();

        System.out.println("");
        System.out.println("Televisão");
        televisao.setVoltagem("220v");
        televisao.setPolegadas(50);

        televisao.ligar();
        System.out.println("Televisão de " + televisao.getPolegadas() + " polegadas");
        televisao.desligar();

    }
}