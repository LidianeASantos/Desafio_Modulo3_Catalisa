package br.com.zup.lidiane.imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    private String endereco;
    private Double valorAluguel;
    private String funcionarioResponsavel;
    private List<String> moradores = new ArrayList<>();

    public Imovel() {
    }



    public Imovel(String endereco, Double valorAluguel,
                  String funcionarioResponsavel, List<String> moradores) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.moradores = moradores;
    }



    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(Double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;

    }



    public List<String> getListaMorador() {
        return moradores;
    }

    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public void setListaMorador(List<String> listaMorador) {
        this.moradores = listaMorador;
    }

    public void adicionarMorador(Morador morador) {
        moradores.add( morador.getNomeDosMoradores() );
    }

   /* public Morador pegaNomeMorador(String nomeDoMorador){
        Morador moradorDeRetorno = null;
        for (Morador percorrer : moradores){
            if (percorrer.getNome().equals(nomeDoMorador)){
                moradorDeRetorno = percorrer;
                System.out.println(moradorDeRetorno);
            }
        }
        return moradorDeRetorno;
    }*/




    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append( "\n Endereço do Imóvel: " + endereco );
        string.append( "\n Valor do aluguel do Imóvel: "+ valorAluguel );
        string.append( "\n Funcionário responsável pelo Imóvel: " + funcionarioResponsavel );
        string.append( "\n Moradores dos Imóvel: " + moradores);
        return string.toString();

    }
}

