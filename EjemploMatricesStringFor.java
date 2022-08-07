public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String[][] nombres = new String[3][2];

        nombres[0][0] = "wolveringe";
        nombres[0][1] = "rogue";
        nombres[1][0] = "jean";
        nombres[1][1] = "mystique";
        //nombres[2][0] = "beast";
        nombres[2][1] = "storm";

        System.out.println("Iterando con for");
        for (int i = 0; i < nombres.length; i++){
            for(int j = 0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j]  +"\t");
            }
            System.out.println();
        }
        System.out.println("Iterando con foreach");
        for (String[] fila : nombres){
            for (String nombre: fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

    }
}
