package br.com.zup.lidiane.imobiliaria;

public class Morador extends Pessoa{

    private String dataInicioContrato;
    private String quantidadeDepositoCaucao;
    private String nomeDosMoradores;
    private String quantidadeMoradores;



    public Morador() {
    }



   public Morador(String nome, String cpf, String endereco, String telefone,
                   String dataInicioContrato, String quantidadeDepositoCaucao,
                   String nomeMoradores, String quantidadeMoradores) {
        super( nome, cpf, endereco, telefone );
        this.dataInicioContrato = dataInicioContrato;
        this.quantidadeDepositoCaucao = quantidadeDepositoCaucao;
        this.nomeDosMoradores = nomeMoradores;
        this.quantidadeMoradores = quantidadeMoradores;
    }



    public String getDataInicioContrato() {
        return dataInicioContrato;
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

    public String getNomeDosMoradores() {
        return nomeDosMoradores;
    }

    public String setNomeDosMoradores(String nomeDosMoradores) {
        this.nomeDosMoradores = nomeDosMoradores;
        return nomeDosMoradores;
    }

    public String getQuantidadeMoradores() {
        return quantidadeMoradores;
    }

    public void setQuantidadeMoradores(String quantidadeMoradores) {
        this.quantidadeMoradores = quantidadeMoradores;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append( "\n Nome: " + nomeDosMoradores);

        return string.toString();
    }
}
