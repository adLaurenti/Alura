public class testaReferencias {
    public static void main(String[] args) {


       // Funcionario g1 = new Gerente();//"Funcionário" é uma referência mais GENÉRICA. O tipo da referência pode variar.
         Gerente g1 = new Gerente();
         g1.setNome("Alexandre");
         g1.setSalario(5000.0);

         Funcionario f = new Funcionario();
         f.setSalario(2000.0);

         EditorVideo ev = new EditorVideo();
         ev.setSalario(2500.0);

     //objeto
     controleBonificacao controle = new controleBonificacao();

     //registrando
     controle.registra(g1);
     controle.registra(f);
     controle.registra(ev);

        System.out.println(controle.getSoma());

        }

 }
