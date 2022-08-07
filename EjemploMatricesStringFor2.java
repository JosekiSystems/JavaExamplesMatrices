public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = {{"wolveringe", "rogue"}, {"jean", "mystique"} ,{"beast", "storm"}};


        System.out.println("Iterando con foreach");
        for (String[] fila : nombres){
            for (String nombre: fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

    }
}
