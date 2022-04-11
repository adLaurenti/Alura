public class testaValores {
    public static void main(String[] args) {
          Conta conta = new Conta(1337, 24222);//estou criando uma conta 24222

          conta.setAgencia(1231231);

          Conta conta2 = new Conta(1337, 14589); //estou criando uma conta 14589
          Conta conta3 = new Conta(2223, 98655); //estou criando uma conta 98655

          System.out.println(Conta.getTotal());// 3

        System.out.println(conta.getAgencia());// 1231231
        // conta está inconsistente
        // conta.setNumero(-330);
    }
}


