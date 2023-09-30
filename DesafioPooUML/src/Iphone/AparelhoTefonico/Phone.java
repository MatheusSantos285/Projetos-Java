package Iphone.AparelhoTefonico;

public class Phone implements AparelhoTelefonico {

    public void fazerLigacao() {
        System.out.println("Fazendo ligação.");
    }
    public void atenderLigacao() {
        System.out.println("Atendendo ligação.");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
    public void encerrarLigacao() {
        System.out.println("Encerrando ligação.");
    }
    
}
