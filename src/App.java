public class App {
    public static void main(String[] args) {
        Number numero = new Number();
        System.out.println(numero.verificaParNegativo(1));

        Fibonacci fibo = new Fibonacci();
        fibo.calculadorFibonacci(20);

        Tabuada tabu = new Tabuada();
        tabu.multiplica(7);

        Piramide piramide = new Piramide();
        piramide.montaPiramide(5);

        Duplicados duplicados = new Duplicados();
        String[] array1 = {"Tangerina","Manga", "Caqui", "Morango", "Amora", "Maça"};
        String[] array2 = {"Morango", "Banana", "Tangerina", "Maçã", "Uva", "Caqui", "Maça"};
        duplicados.verificaDuplicados(array1, array2);
    }
}
