package creat;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CellTest {
    private static Cell cell;
    private static int generation;
    private static int[][]grid;
    @Before
    public void setUp() throws Exception {
        cell = new Cell(10, 10);
        int[][]grid = 
                    {
                    {1, 1, 1, 0, 0, 0, 0, 1, 1, 1},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0, 0, 0, 1, 1, 1},
                    };
        generation = 1;
        cell.setGrid(grid);
    }

    @Test
    public void testCell() {
        assertEquals(0, cell.getNowGeneration());
    }

    @Test
    public void testSetGrid() {
      cell.setGrid(grid);
      assertEquals(0, cell.getGrid()[0][1]);
    }

    @Test
    public void testGetGrid() {
        cell.setGrid(grid);
        assertEquals(0, cell.getGrid()[0][3]);
        assertEquals(0, cell.getGrid()[0][4]);
        assertEquals(0, cell.getGrid()[0][5]);
    }

    @Test
    public void testSetNowGeneration() {
       cell.setNowGeneration(generation);
       assertEquals(1, cell.getNowGeneration());
    }

    @Test
    public void testGetNowGeneration() {
        cell.setNowGeneration(generation);
        assertEquals(1, cell.getNowGeneration());
    }

    @Ignore
    public void testRandomCell() {

    }

    @Test
    public void testDeleteAllCell() {
        cell.deleteAllCell();
        assertEquals(0, cell.getGrid()[1][1]);
    }

    @Test
    public void testUpdate() {
        cell.setGrid(grid);
        cell.update();
        assertEquals(1, cell.getGrid()[0][1]);
        assertEquals(1, cell.getGrid()[1][1]);

    }

}
