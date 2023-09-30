package Iphone.EquipamentoMultifuncional;

import Iphone.AparelhoTefonico.AparelhoTelefonico;
import Iphone.NavegadorInternet.NavegadorInternet;
import Iphone.ReprodutorDeMúsica.ReprodutorMusica;

public class EquipamentoMultifuncional implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica {

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
        System.out.println("Avançando a música.");
    }

    public void retrocederMusica() {
        System.out.println("Retrocedendo a música.");
    }

    public void abrirPagina() {
        System.out.println("Abrindo a página.");
    }

    public void fecharPagina() {
       System.out.println("Fechando a página.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }

    public void pesquisar() {
        System.out.println("Pesquisando...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

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
