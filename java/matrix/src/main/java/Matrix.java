
class Matrix {

    private int[][] matrix;
    private int counterColumn;
    private int counterRow;

    public Matrix(String matrixAsString) {

        String [] lines = matrixAsString.split("\n");
        counterRow = lines.length;
        counterColumn = (int) lines[0].chars().filter(c -> c == ' ').count() + 1;
        matrix = new int[counterRow][counterColumn];

        for (int i = 0; i < lines.length; i++) {
            String [] line = lines[i].split(" ");
            for (int j = 0; j < line.length; j++) {
                matrix [i][j] = Integer.parseInt(line[j]);
            }
        }
    }

    public int[] getRow(int index) {

        int [] result = new int[counterColumn];

        for (int i = index-1; i < index; i++) {
            for (int j = 0; j < counterColumn; j++) {
                result[j] = matrix[i][j];
            }
        }

        return result;
    }

    public int[] getColumn(int index) {

        int [] result = new int[counterRow];

        for (int i = 0; i < counterRow; i++) {
            for (int j = index-1; j < index; j++) {
                result[i] = matrix[i][j];
            }
        }

        return result;
    }
}
