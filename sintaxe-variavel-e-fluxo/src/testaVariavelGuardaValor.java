public class testaVariavelGuardaValor {
    public static void main(String[] args) {

        int primeiro = 5;
        int segundo = 7;

        System.out.println(segundo);

        segundo = primeiro;
        primeiro = 10;///não vai surtir efeito

        System.out.println(segundo);
        // Isso significa que a variável guarda um valor, e não uma referência, e este exemplo dará base para as entendermos melhor.


    }
}
