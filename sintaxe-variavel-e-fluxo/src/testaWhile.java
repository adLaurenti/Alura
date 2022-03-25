public class testaWhile {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador); // irá contar até 10
           // contador = contador + 1;
            // contador += 1;
            contador++;
        }
System.out.println(contador); // O while é uma instrução muito simples - lembrando que é preciso sempre inicializar e declarar a variável a ser utilizada, neste caso, em contador. Para reforçarmos algo que já foi visto, o escopo, poderemos imprimir contador novamente após o while (irá contar até 11)
    }
}