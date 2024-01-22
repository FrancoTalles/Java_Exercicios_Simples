public class Tabuada {
    
    void multiplica(int numero){
        System.out.println("Tabela de multiplicação do " + numero);
        for(int i = 1; i < 11; i++){
            System.out.println(numero + " x " + (i) + " = " + (numero*i));
        }
    }
}
