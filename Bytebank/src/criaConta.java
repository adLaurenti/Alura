public class criaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        segundaConta.saldo += 400;
        System.out.println(segundaConta.saldo + primeiraConta.saldo);

        System.out.println(segundaConta);
        System.out.println(primeiraConta);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        segundaConta.numero = 10;
        System.out.println(segundaConta.agencia);
        System.out.println(segundaConta.numero);

        if (primeiraConta == segundaConta) {
            System.out.println(" São iguais");
        } else {
            System.out.println("são diferentes");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
