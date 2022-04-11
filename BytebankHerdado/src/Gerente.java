//Gerente é um funcionario, Gerente herda da class Funcionário
public class Gerente extends Funcionario{

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }

    }
  public double getBonificacao() {
        //return this.salario;
      System.out.println("Chamando o metodo de bonificacao do Gerente");
      return super.getBonificacao() + super.getSalario(); // "super" significa precisa subir/olhar para cima na hierarquia, ou seja Classe Mãe.
   }

}