//EditorVideo é um funcionario, EditorVideo herda da class Funcionário
public class EditorVideo extends Funcionario{

    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do EditorVideo");
    return super.getBonificacao() + 100.0; // "super" significa precisa subir/olhar para cima na hierarquia, ou seja Classe Mãe.
    }

}
