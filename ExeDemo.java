package exe01;

public class ExeDemo {
    public static void main(String[] args) {
        MBR myMBR = new MBR(1, 11, 1, 11);
        Grid myGrid = new Grid(myMBR, 4);

        //myGrid.printAllCells();

        //System.out.println(myGrid.findCell(20, 20));

        MBR testMBR = new MBR(1, 2, 1, 2);
        MBR testMBR2 = new MBR(2, 3, 7, 8);
        myGrid.insertMBR(testMBR);
        myGrid.insertMBR(testMBR2);

        myGrid.printAllCells();

        System.out.println("**************");
        myGrid.printCells(1, 4);
    }
}
