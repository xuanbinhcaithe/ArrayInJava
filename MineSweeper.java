package MangTrongJava ;
public class MineSweeper {
    public static void main(String[] args) {
        String[][] map = {
                {"*", ".", "*", ".", "."}
        };

        final int MAP_WIDTH = map[0].length;

        String[][] mapReport = new String[1][MAP_WIDTH];
        for (int i = 0; i < MAP_WIDTH; i++) {
            String curentCell = map[0][i];
            if (curentCell.equals("*")) {
                mapReport[0][i] = "*";
            } else {
                int minXungQuanh = 0;

                boolean coPhanTuBenTrai = i - 1 >= 0;
                boolean coMinBenTrai = coPhanTuBenTrai && map[0][i - 1].equals("*");
                if (coMinBenTrai) minXungQuanh++;

                boolean hasNeighbourAtRight = i + 1 < MAP_WIDTH;
                boolean hasMineAtRight = hasNeighbourAtRight && map[0][i + 1].equals("*");
                if (hasMineAtRight) minXungQuanh++;

                mapReport[0][i] = String.valueOf(minXungQuanh);
            }
        }
        for (int i = 0; i < MAP_WIDTH; i++) {
            String currentCellReport = mapReport[0][i];

            System.out.print(currentCellReport);

        }
    }}