package iPhone;

import Funcoes.AparelhoTelefone.aparelhoTelefone;
import Funcoes.NavegadorInternet.navegadorInternet;
import Funcoes.ReprodutorMusical.reprodutorMusical;

public class iphone implements aparelhoTelefone, navegadorInternet, reprodutorMusical {

    public void ligar () {
        System.out.println("Efetuando ligacao pelo iPhone");
    }

    public void atender () {
        System.out.println("Atendendo ligacao pelo iPhone");
    }

    public void iniciarCorreioVoz () {
        System.out.println("Encaminhando para caixa postal pelo iPhone");
    }

    public void exibirPagina () {
        System.out.println("Exibindo pagina do navegador pelo iPhone");
    }

    public void adicionarNovaAba () {
        System.out.println("Adicionando nova pagina do navegador pelo iPhone");
    }

    public void atualizarPagina () {
        System.out.println("Atualizando pagina do navegador pelo iPhone");
    }

    public void tocar () {
        System.out.println("Tocando musica pelo iPhone");
    }

    public void pausar () {
        System.out.println("Pausando musica pelo iPhone");
    }

    public void selecionarMusica () {
        System.out.println("Selecionando musica pelo iPhone");
    }
    
}