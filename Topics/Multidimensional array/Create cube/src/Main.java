
class ArrayOperations {
    public static int[][][] createCube() {
        final int size = 3;
        int[][][] x = new int[size][size][size];
        int counter = 0;

        for (int i = 0; i < x.length; i++) {
            counter = 0;
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < x[i][j].length; k++) {
                    x[i][j][k] = counter++;
                }
            }
        }

        return x;
    }
}