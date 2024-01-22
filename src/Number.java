public class Number {

    String verificaParNegativo(int numero){
        if(numero % 2 == 0 && numero > 0){
            return numero + " é par e positivo";
        } 
        if(numero % 2 == 0 && numero < 0){
            return numero + " é par e negativo";
        }
        if (numero % 2 != 0 && numero > 0){
            return numero + " é impar e positivo";
        }
        return numero + " é impar e negativo";
    }
}
