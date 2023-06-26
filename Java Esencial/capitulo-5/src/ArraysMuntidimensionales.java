public class ArraysMuntidimensionales {
    public static void main(String[] args) {
        int miArrayDeUnaDimension[] = new int[20];
        int miArrayDeDosDimensiones[][] = new int[10][20];
        int miArrayDeTresDimensiones[][][] = new int[5][15][8];

        int tablaDeMuntiplicacion[][] = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablaDeMuntiplicacion[i][j] = i*j;
            }
        }

        System.out.println("El resultado de multiplicar 4 * 5 esta en la posicion [4][5] " + tablaDeMuntiplicacion[4][5]);

        int miArrayMultidimensional[][] = {{2,5,-9}, {-7,25,0},{8,3,4}, {5, -6, 85, 69, 287}};
    }
}
