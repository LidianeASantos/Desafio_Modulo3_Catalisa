package br.com.zup.lidiane.imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Morador extends Pessoa{

    private String dataInicioContrato;
    private String quantidadeDepositoCaucao;
    private String quantidadeMoradores;


    public Morador() {
    }

    public Morador(String nome, String cpf, String endereco, String telefone,
                   String dataInicioContrato, String quantidadeDepositoCaucao,
                   String quantidadeMoradores) {
        super( nome, cpf, endereco, telefone );
        this.dataInicioContrato = dataInicioContrato;
        this.quantidadeDepositoCaucao = quantidadeDepositoCaucao;
        this.quantidadeMoradores = quantidadeMoradores;
    }

    public String getDataInicioContrato() {
        return dataInicioContrato;
    }

    public String getQuantidadeMoradores() {
        return quantidadeMoradores;
    }

    public void setDataInicioContrato(String dataInicioContrato) {
        this.dataInicioContrato = dataInicioContrato;
    }

    public String getQuantidadeDepositoCaucao() {
        return quantidadeDepositoCaucao;
    }

    public void setQuantidadeDepositoCaucao(String quantidadeDepositoCaucao) {
        this.quantidadeDepositoCaucao = quantidadeDepositoCaucao;
    }

    public void setQuantidadeMoradores(String quantidadeMoradores) {
        this.quantidadeMoradores = quantidadeMoradores;
    }

    @Override
    public String toString() {
        return "Morador{" +
                "dataInicioContrato='" + dataInicioContrato + '\'' +
                ", quantidadeDepositoCaucao='" + quantidadeDepositoCaucao + '\'' +
                ", quantidadeMoradores='" + quantidadeMoradores + '\'' +
                '}';
    }
}
