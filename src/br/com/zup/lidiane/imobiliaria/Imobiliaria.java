package br.com.zup.lidiane.imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

    private static List<Imovel> imovel = new ArrayList<>();

    public static void adicionarImovelImobiliaria(Imovel imovel){
        imovel.add(imovel);
    }

    public static void mostrarImovel(){
        System.out.println(" Dados do Imóvel");
        for (Imovel percorrer:imovel) {
            System.out.println(percorrer);
            
        }
    }

}
