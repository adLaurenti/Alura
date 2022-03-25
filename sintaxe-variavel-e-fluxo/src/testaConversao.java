public class testaConversao {
    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);

        float pontoFlutuante = 3.14f;
        System.out.println(pontoFlutuante);

        long numeroGrande = 32432423523L;
        System.out.println(numeroGrande);

        short valorPequeno = 2131;
        System.out.println(valorPequeno);

        byte b = 127;
        System.out.println(b);

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1+valor2;
        System.out.println(total); //Existe até o site 0.30000000000000004.com, com a explicação matemática
        // para esse floating point, do porquê, em muitas linguagens, essa soma dar exatamente esse valor.


    }
}
