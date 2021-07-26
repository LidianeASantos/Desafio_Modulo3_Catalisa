package br.com.zup.lidiane.imobiliaria;

public class Morador extends Pessoa{

    private String dataInicioContrato;
    private String quantidadeDepositoCaucao;
    private String quantidadeMoradores;



    public Morador() {
    }

    public Morador(String nome, String cpf, String endereco, String telefone) {
        super( nome, cpf, endereco, telefone );
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
                "nome='" + getNome() + '\'' +
                '}';
    }
}
