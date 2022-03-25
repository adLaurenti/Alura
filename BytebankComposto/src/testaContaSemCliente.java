public class testaContaSemCliente {
    public static void main(String[] args) {
        Conta contaTinho = new Conta();
        System.out.println(contaTinho.getSaldo());//0.0
        System.out.println(contaTinho.titular);//null


        contaTinho.titular = new cliente();//Faremos com que titular deixe de ser null, fazendo-o receber um novo cliente: new Cliente.
        System.out.println(contaTinho.titular);//cliente@33c7353a

        contaTinho.titular.nome = "Tinho";
        System.out.println(contaTinho.titular.nome);//Tinho

    }
}
