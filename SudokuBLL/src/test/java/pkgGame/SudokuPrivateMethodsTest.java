package pkgGame;


import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class SudokuPrivateMethodsTest{

@Test
public void FillDiagonalRegionsTest() throws Exception {
int[][] puzzle3 = { {1,2,3,4,5,6,7,8,9 },{1,2,3,4,5,6,7,8,9 },{1,2,3,4,5,6,7,8,9 },{1,2,3,4,5,6,7,8,9 },{1,2,3,4,5,6,7,8,9 },{1,2,3,4,5,6,7,8,9 },{1,2,3,4,5,6,7,8,9 },{1,2,3,4,5,6,7,8,9 },{1,2,3,4,5,6,7,8,9 }  };

	
	Sudoku s1 = new Sudoku(puzzle3);
	
	s1.fillDiagonalRegions(); //unsure how to test private method because of restricted visibility
	
	  for (int i=0; i<iSize; i += this.iSqrtSize) {
		  for (int j=0; j<iSqrtSize; j++) {
			 try  {
				 super.doesElementExist(super.getRegion(i),j) ;
			 }
			 catch (Exception e) {
				 fail("Region does not contain all of the proper elements");
			 }
				  
		  }
		  //we could not get any of these tests to work properly because they were private methods. 
	  }
}
	  

	  public String PrintStars(int num){
	        if ( num == 0){
	            return "";
	        }
	        return "*" + PrintStars(num -1);
	    }
	    @Test
	    public void  Sudoku_Test_SetRegion() {
	        Sudoku s1= null;
	        
	        int[][] puzzle = {
	                {0,0,0,0},
	                {0,0,0,0},
	                {0,0,0,0},
	                {0,0,0,0}};
	        int [] Region2 = {1,2,3,4};
	        
	        try {
	             s1 = new Sudoku(puzzle);
	        } catch (Exception e) {
	            fail("Bad Sudoku");
	        }

	        assertTrue(Arrays.equals(Region2, setRegion(2)));
	    }
}