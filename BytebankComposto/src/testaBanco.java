public class testaBanco {
    public static void main(String[] args) {
        cliente Alexandre = new cliente();
        Alexandre.nome = "Alexandre";
        Alexandre.cpf = "111.111.111-11";
        Alexandre.profissao = "programador";

        //Abrindo a conta

        Conta contaAlexandre = new Conta();
        contaAlexandre.deposita(1000);
        System.out.println(contaAlexandre.getSaldo());//1000.0

        //associa o cliente Alexandre a contaAlexandre
        contaAlexandre.titular = Alexandre;
        System.out.println(contaAlexandre.titular.nome); //Alexandre

        //outros testes
        System.out.println(contaAlexandre);//Conta@65b54208
        System.out.println(contaAlexandre.titular); //cliente@1be6f5c3
        System.out.println(Alexandre);//cliente@1be6f5c3
        System.out.println(Alexandre.cpf); // 111.111.111-11
        System.out.println(Alexandre.profissao);// programador

    }
}
