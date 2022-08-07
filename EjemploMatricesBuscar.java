public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int [][] matrizdeEnteros = {
                {35,90,3,1978},
                {15,2020,10,5},
                {677,127,32767,1999}
        };

        int elementoBuscar = 1999;
        boolean encontrado = false;
        int i;
        int j = 0;

        busar: for(i = 0; i < matrizdeEnteros.length; i++){
            for(j = 0; j < matrizdeEnteros[i].length; j++){
                if(matrizdeEnteros[i][j] == elementoBuscar ){
                    encontrado = true;
                    break busar;
                }
            }
        }
        if(encontrado){
            System.out.println(" Encontrado elementoBuscar = " + elementoBuscar + " en las coordenadas " + i + " , " + j);
        }else{
            System.out.println(elementoBuscar + "no se encontró elemento buscar en la matriz");
        }
    }
}

