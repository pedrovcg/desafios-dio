package UsuarioFinal;

import Funcoes.AparelhoTelefone.aparelhoTelefone;
import Funcoes.NavegadorInternet.navegadorInternet;
import Funcoes.ReprodutorMusical.reprodutorMusical;
import iPhone.iphone;

public class usuarioFinal {
    public static void main(String[] args) {
        iphone ip = new iphone();

        aparelhoTelefone aparelhoTelefone = ip;
        navegadorInternet navegadorInternet = ip;
        reprodutorMusical reprodutorMusical = ip;

        aparelhoTelefone.atender();
        aparelhoTelefone.ligar();
        aparelhoTelefone.iniciarCorreioVoz();

        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        navegadorInternet.exibirPagina();

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();

    }
}
