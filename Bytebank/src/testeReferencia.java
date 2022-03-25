public class testeReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; //serão iguais

        System.out.println("saldo da segunda conta: " + primeiraConta.saldo);
        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);
        //resultado será tudo 300.

        // verificação...

        if (primeiraConta == segundaConta) {
            System.out.println("elas são iguais");

        } else {
            System.out.println("elas não são iguais");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
