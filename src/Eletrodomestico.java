public abstract class Eletrodomestico {
    /*

     Defina uma classe abstrata para Eletrodomésticos com atributos como voltagem, se
está ligado (ou não). Além de métodos que verificam e acessam esses dados, a classe
deve ter dois métodos abstratos para ligar() e desligar() o eletrodoméstico.
A seguir defina duas outras classes para armazenar e tratar objetos do tipo Rádio e Televisão, ambas
herdando (e implementando os métodos abstratos) da classe Eletrodoméstico, além dos
seus atributos e métodos.

    */
    private String voltagem;
    private Boolean ligado = true;

    public String getVoltagem() {
        return voltagem;
    }
    public Boolean getLigado() {
        return ligado;
    }
    public void setVoltagem(String voltagem){
        this.voltagem = voltagem;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public abstract void ligar();

    public abstract void desligar();
}
