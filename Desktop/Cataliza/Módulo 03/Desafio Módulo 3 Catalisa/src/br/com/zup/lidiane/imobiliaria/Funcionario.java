package br.com.zup.lidiane.imobiliaria;


public class Funcionario extends Pessoa {

    private double salario;
    private String dataAdmissao;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String endereco,
                       String telefone, double salario, String dataAdmissao) {
        super( nome, cpf, endereco, telefone );
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario(String nome, String cpf, String endereco, String telefone) {
        super( nome, cpf, endereco, telefone );
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }


}
