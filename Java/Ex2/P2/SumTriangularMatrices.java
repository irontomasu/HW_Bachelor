class SumTriangularMatrices {
   public static void main(String[] args){
       int[][] triangleArray1 ={
	   {1, 2, 3, 4, 5, 6},
	   {2, 3, 4, 5, 6},
	   {3, 4, 5, 6},
	   {4, 5, 6},
	   {5, 6},
	   {6}
       };
       int[][] triangleArray2 ={
	   {4},
	   {4, 5},
	   {4, 5, 6},
	   {4, 5, 6, 7},
	   {4, 5, 6, 7, 8},
	   {4, 5, 6, 7, 8, 9}
       };
       int[][] sum ={
	   {0 ,0 ,0 ,0 ,0 ,0},
	   {0 ,0 ,0 ,0 ,0 ,0},
	   {0 ,0 ,0 ,0 ,0 ,0},
	   {0 ,0 ,0 ,0 ,0 ,0},
	   {0 ,0 ,0 ,0 ,0 ,0},
	   {0 ,0 ,0 ,0 ,0 ,0}
       };
       int i,j,total;

       total=0;
       // U
       for(i = 0; i < 6 ; i++){
	   for(j = 0 - i; j < 6 - i ; j++){
	       if(j <  0){
		   System.out.print("\t");
	       }
	       else{
		   System.out.print(triangleArray1[i][j] + "\t");
		   total += triangleArray1[i][j];
	       }
	   }
	   System.out.println("");
       }
       System.out.println("Total: " + total +"\n");

       total = 0;
       // L
       for(i = 0; i < 6 ; i++){
	   for(j = 0; j < 6 ; j++){
	       if(j > i){
		   System.out.print("  ");
	       }
	       else{
		   System.out.print(triangleArray2[i][j] + "\t");
		   total += triangleArray2[i][j];
	       }
	   }
	   System.out.println("");
       }
       System.out.println("Total: " + total + "\n");

       total=0;
       // sum
       for(i = 0; i < 6 ; i++){
	   for(j = 0 ; j < 6 ; j++){
	       if(j <= i){
		   sum[i][j] += triangleArray2[i][j];
	       }
	       if(j >= i){
		   sum[i][j] += triangleArray1[i][j - i];
	       }
	       System.out.print(sum[i][j] + "\t");
	       total += sum[i][j];
	   }
	   System.out.println("");
       }
       System.out.println("Total:" + total +"\n");
   }
}