package br.com.zup.lidiane.imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Sistema {



    public static Morador cadastarMorador(){
        System.out.println("Digite o nome do morador: ");
        Morador morador = new Morador();
        return morador;
    }


    public static void cadastrarImovel(){
        List<Double> morador = new ArrayList<>();

        System.out.println("Digite o endereço do Imóvel: ");
        String enderco = IO.criaScanner().nextLine();

        System.out.println("Digite o valor do Imóvel: ");
        double valorAluguel = IO.criaScanner().nextDouble();

        System.out.println("Digite a quantidade de moradores do Imóvel: ");
        double quantidadeMoradores = IO.criaScanner().nextDouble();

        for (int quantidade = 0; quantidade < quantidadeMoradores; quantidade ++ ){
            morador.add( quantidadeMoradores );
        }

        System.out.println("Digite o nome do funcionário responsável pelo Imóvel: ");
        String funcionarioResponsavel = IO.criaScanner().nextLine();

        Imovel imovel = new Imovel();
        Imobiliaria.adicionarImovelImobiliaria( imovel );

    }

    public static void executarSistema(){
        cadastrarImovel();
        Imobiliaria.mostrarImovel();

    }









}
