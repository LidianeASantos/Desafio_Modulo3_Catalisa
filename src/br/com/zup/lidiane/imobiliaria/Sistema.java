package br.com.zup.lidiane.imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    public static String cadastarMorador(){

        Morador morador = new Morador();
        System.out.println("Digite o nome do morador: ");
        String nomeDosMoradores = IO.criaScanner().nextLine();
        return morador.setNomeDosMoradores(nomeDosMoradores);
    }



    public static void cadastrarImovel(){

        List<Imovel>  listaImoveis = new ArrayList<>();
        List<String> listaMoradores = new ArrayList<>();

        System.out.println("Digite o endereço do Imóvel: ");
        String endereco = IO.criaScanner().nextLine();

        System.out.println("Digite o valor do Imóvel: ");
        double valorAluguel = IO.criaScanner().nextDouble();

        System.out.println("Digite a quantidade de moradores do Imóvel: ");
        double quantidadeMoradores = IO.criaScanner().nextDouble();


        for (int quantidade = 0; quantidade < quantidadeMoradores; quantidade++ ){
            listaMoradores.add(cadastarMorador());

        }

        System.out.println("Digite o nome do funcionário responsável pelo Imóvel: ");
        String funcionarioResponsavel = IO.criaScanner().nextLine();

        Imovel listaImovel = new Imovel(endereco,valorAluguel,funcionarioResponsavel,listaMoradores);
        Imobiliaria.adicionarImovelImobiliaria(listaImovel);


    }

    public static void executarSistema(){
        cadastrarImovel();
        Imobiliaria.mostrarImobiliaria();

    }




}
