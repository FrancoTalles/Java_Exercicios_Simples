public class Duplicados {
    
    void verificaDuplicados(String[] array1, String[] array2){
        for(int i = 0; i < array1.length; i++){
            String verificador = array1[i];
            for(int j = 0; j < array2.length; j++){
                String candidato = array2[j];
                if(verificador.equals(candidato)){
                    System.out.println(verificador);
                }
            }
        }
    }
}
