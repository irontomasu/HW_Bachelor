class ClassifyingToys {
   public static void main(String[] args){
       int i, j, a, b, c;
       long k;
       double da;
       double[][] Lenghts ={
	   {0.03, 0.04, 0.05},
	   {3.0, 4.0, 5.0},
	   {0.3, 0.4, 0.5},
	   {2, 3, 4},
	   {5, 12, 13},
	   {0.5, 1.2, 1.3},
	   {19.0, 19.0, 19.0},
	   {0.9, 4.0, 4.1},
	   {300, 400, 500},
	   {0.00000009, 0.0000004, 0.00000041},
	   {90, 400, 410}
       };
       for(i = 0; i < 11 ; i++){
	   System.out.println(Lenghts[i][0] + " " + Lenghts[i][1] + " " + Lenghts[i][2]);

	   da = Lenghts[i][0]*Lenghts[i][0] + Lenghts[i][1]*Lenghts[i][1] - Lenghts[i][2]*Lenghts[i][2];
	   System.out.println(da);
	   da = (Lenghts[i][0]*Lenghts[i][0])/(Lenghts[i][2]*Lenghts[i][2]) + (Lenghts[i][1]*Lenghts[i][1])/(Lenghts[i][2]*Lenghts[i][2]) - 1; 
	   System.out.println(da);
	   if(da >= -0.0001 && da <= 0.0001)
	       System.out.println("right-angled\n");
	   else{
	       //System.out.println(da);
	       System.out.println("NOT right-angled\n");
	   }
       }
   }
}