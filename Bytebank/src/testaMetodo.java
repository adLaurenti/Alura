public class testaMetodo {
    public static void main(String[] args) {
        Conta contaAlex = new Conta();
        contaAlex.saldo = 200;

        //deposita
        contaAlex.deposita(200);
        System.out.println(contaAlex.saldo);

        //saca
        contaAlex.saca(150);
        System.out.println(contaAlex.saldo);

        //transfere
        Conta contaDumas = new Conta();
        contaDumas.deposita(1000);

        contaDumas.transfere(300, contaAlex);
        System.out.println(contaDumas.saldo);

//titular
        contaAlex.titular = "Alexandre";
        System.out.println(contaAlex.titular);
    }
}
