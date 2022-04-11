//Classe Super/Mãe
public class Funcionario {
    private String nome;
    private String cpf;
    // private double salario;
    // public double salario;
 protected double salario; // "protected" significa público para os FILHOS.

public double getBonificacao (){

    return  this.salario * 0.05; //uma bonificação de 10% do salario.
}

    public String getNome() {

    return nome;
    }

    public void setNome(String nome) {

    this.nome = nome;
    }


    public String getCpf() {

    return cpf;
    }

    public void setCpf(String cpf) {

    this.cpf = cpf;
    }

    public double getSalario() {

    return salario;
    }

    public void setSalario(double salario) {

    this.salario = salario;
    }
}
