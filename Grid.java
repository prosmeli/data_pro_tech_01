package exe01;

import java.util.ArrayList;

public class Grid {
    private MBR mbr;
    private int m;
    private Cell[][] cells;

    public Grid() {}

    public Grid(MBR mbr, int m) {
        this.mbr = new MBR(mbr);
        this.m = m;
        this.cells = new Cell[m][m];

        double dx = (this.mbr.getxMax() - this.mbr.getxMin()) / (double) m;
        double dy = (this.mbr.getyMax() - this.mbr.getyMin()) / (double) m;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                cells[i][j] = new Cell(new MBR(this.mbr.getxMin() + i * dx, this.mbr.getxMin() + (i + 1) * dx, this.mbr.getyMin() + j * dy, this.mbr.getyMin() + (j + 1) * dy));
            }
        }
    }

    public MBR getMbr() {
        return mbr;
    }

    public void setMbr(MBR mbr) {
        this.mbr = mbr;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public void printAllCells() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Cell[" + i + "][" + j + "]: " + cells[i][j]);
            }
        }
    }

    // Public API
    public Cell findCell(double x, double y) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
               if ((cells[i][j].getMbr().getxMin() <= x) && (x <= cells[i][j].getMbr().getxMax()) &&
                       (cells[i][j].getMbr().getyMin() <= y) && (y <= cells[i][j].getMbr().getyMax())) {
                   return cells[i][j];
               }
            }
        }
        return null;
    }

    /**
     * Θέλει διόρθωση !
     * @param x
     * @param y
     * @return
     */
    public ArrayList<Cell> findCells(double x, double y) {
        ArrayList<Cell> arrayList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if ((cells[i][j].getMbr().getxMin() <= x) && (x <= cells[i][j].getMbr().getxMax()) &&
                        (cells[i][j].getMbr().getyMin() <= y) && (y <= cells[i][j].getMbr().getyMax())) {
                    arrayList.add(cells[i][j]);
                }
            }
        }
        return arrayList;
    }

    public void printCells(double x, double y) {
        ArrayList<Cell> arrayList = findCells(x, y);
        for (Cell cell: arrayList) {
            System.out.println(cell);
        }
    }

    public void insertMBR(MBR mbr) {
        Cell cell = findCell(mbr.getxMin(), mbr.getyMin());
        if (cell != null) {
            cell.getObjects().add(mbr);
        }
        System.out.println(cell);
    }
}
