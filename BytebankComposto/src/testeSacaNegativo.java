public class testeSacaNegativo {
    public static void main(String[] args) {
Conta conta = new Conta();
conta.deposita(600);
System.out.println(conta.saca(601));//false
System.out.println(conta.getSaldo());//600

       // conta.pegaSaldo() = conta.saldo - 601;// ira gerar um erro por estar tentando acessar o saldo sem o metodo.
      //  System.out.println(conta.pegaSaldo());//saldo has private access in Conta

        conta.saca(601);
        System.out.println(conta.getSaldo());//600


    }
}
