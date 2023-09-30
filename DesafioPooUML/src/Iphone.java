import Iphone.AparelhoTefonico.AparelhoTelefonico;
import Iphone.EquipamentoMultifuncional.EquipamentoMultifuncional;
import Iphone.NavegadorInternet.NavegadorInternet;
import Iphone.ReprodutorDeMúsica.ReprodutorMusica;

public class Iphone {
    public static void main(String[] args) throws Exception {
        
        EquipamentoMultifuncional multi = new EquipamentoMultifuncional();

        AparelhoTelefonico aparelhoTelefonico = multi;
        NavegadorInternet navegadorInternet = multi;
        ReprodutorMusica reprodutorMusica = multi;

        reprodutorMusica.selecionarMusica();
        reprodutorMusica.pausarMusica();
        reprodutorMusica.despausarMusica();
        reprodutorMusica.avancarMusica();
        reprodutorMusica.retrocederMusica();
        aparelhoTelefonico.atenderLigacao();
        aparelhoTelefonico.fazerLigacao();
        aparelhoTelefonico.iniciarCorreioVoz();
        aparelhoTelefonico.encerrarLigacao();
        navegadorInternet.abrirPagina();
        navegadorInternet.atualizarPagina();
        navegadorInternet.pesquisar();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.fecharPagina();
    }
}
