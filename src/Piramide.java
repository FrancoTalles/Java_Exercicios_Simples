public class Piramide {
    
    void montaPiramide(int numero){
        for(int i = 0; i <= numero; i++) {
            String linha = "";
            for(int j = 0; j < i; j++){
                linha += i;
            }
            System.out.println(linha);
            linha = "";
        }
    }
}
