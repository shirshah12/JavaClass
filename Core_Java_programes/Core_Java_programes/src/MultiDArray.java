
public class MultiDArray {

	public static void main(String[] args) {
		 
		int numbers[][][] = new int[3][4][5];
		numbers[0][0][0] = 12;
		numbers[0][0][1] = 13;
		
		int numbers1[][][] = {
				
				{    
					 {12,13,14,15,16}, 
					 {17,18,19,20,21}, 
					 {17,18,19,20,21},
					 {17,18,19,20,21},  
					 
				},
				
				{    
					{12,13,14,15,16}, 
					 {17,18,19,20,21}, 
					 {17,18,19,20,21},
					 {17,18,19,20,21},  
					 
				},
				{   	 {12,13,14,15,16}, 
						 {17,18,19,20,21}, 
						 {17,18,19,20,21},
						 {17,18,19,20,21},   
				},
	
		};
		
		
		for(int x = 0; x < numbers1.length; x++) {
			for(int y = 0; y < numbers1[x].length; y++) {
				for(int z = 0; z < numbers1[x][y].length; z++) {
					
					System.out.println(numbers1[x][y][z]);
					
				}
			}
		}

	}

}
