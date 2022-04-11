import javax.swing.plaf.synth.SynthUI;

public class testaGeteSet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24222);
        //conta.numero = 1337;
        //conta.setNumero(1337);
        System.out.println(conta.getNumero());

//Trocando o Nome
        cliente Alex = new cliente();
//conta.titutar= Alex;
   Alex.setNome("Alexandre");

   conta.setTitular(Alex);
   System.out.println(conta.getTitular().getNome());//No desenho das flechas (Conta->titular->nome) que é Alexandre

//trocando a profissão
    conta.getTitular().setProfissao("programador");
    //agora em duas linhas:
        cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
System.out.println(titularDaConta);//cliente@65b54208
System.out.println(conta.getTitular()); //cliente@65b54208
System.out.println(Alex);//cliente@65b54208


  }

}



