package br.com.zup.lidiane.imobiliaria;

public class Morador extends Pessoa{

    private String dataInicioContrato;
    private String quantidadeDepositoCaucao;

    public Morador() {
    }

    public Morador(String nome, String cpf, String endereco,
                   String telefone, String dataInicioContrato, String quantidadeDepositoCaucao) {
        super( nome, cpf, endereco, telefone );
        this.dataInicioContrato = dataInicioContrato;
        this.quantidadeDepositoCaucao = quantidadeDepositoCaucao;
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

    @Override
    public String toString() {
        return "Morador{" +
                "dataInicioContrato='" + dataInicioContrato + '\'' +
                ", quantidadeDepositoCaucao='" + quantidadeDepositoCaucao + '\'' +
                '}';
    }
}
