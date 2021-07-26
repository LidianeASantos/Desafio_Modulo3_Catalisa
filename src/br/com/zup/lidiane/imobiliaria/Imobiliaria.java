package br.com.zup.lidiane.imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

    private static List<Imovel> listaImovel = new ArrayList<>();

    public static void adicionarImovelImobiliaria(Imovel imovel){
     listaImovel.add(imovel);

    }

    public static void mostrarImobiliaria(){
        System.out.println(" Dados do Imóvel: ");
       for (Imovel percorrer : listaImovel){
            System.out.println(percorrer);
       }
    }



}
