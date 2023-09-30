package Iphone.ReprodutorDeMúsica;

public class Ipod implements ReprodutorMusica {

    public void selecionarMusica() {
        System.out.println("Selecionando a música.");
    }
    public void pausarMusica() {
        System.out.println("Pausando a música.");
    }
    public void despausarMusica() {
        System.out.println("Despausando a música.");
    }
    public void avancarMusica() {
        System.out.println("Avançando a música");
    }
    public void retrocederMusica() {
        System.out.println("Retrocedendo a música.");
    }
}
