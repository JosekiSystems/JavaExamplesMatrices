public class Tarea18MatrizX {
    public static void main(String[] args) {

        String[][] matriz1 = new String[5][5];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (i == j || j == (matriz1[i].length - 1) - i || i == (matriz1[j].length - 1) - j) {
                    matriz1[i][j] = "x";

                } else {
                    matriz1[i][j] = "_";
                }
            }
        }
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {
                    System.out.print(matriz1[i][j] + "\t");
                }
                System.out.println();
            }

        }
    }

