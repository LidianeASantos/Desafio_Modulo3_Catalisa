package br.com.zup.lidiane.imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    private String endereco;
    private double valorAluguel;
    private String funcionarioResponsavel;
    private List<Morador> moradores = new ArrayList<>();

    public Imovel() {
    }

    public Imovel(String endereco, double valorAluguel,
                  String funcionarioResponsavel, List<Morador> moradores) {
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

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public void adicionarImovel(Imovel imovel){
        imovel.add(imovel);
    }

    private void add(Imovel imovel) {
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "endereco='" + endereco + '\'' +
                ", valorAluguel=" + valorAluguel +
                ", funcionarioResponsavel='" + funcionarioResponsavel + '\'' +
                ", moradores=" + moradores +
                '}';
    }
}
