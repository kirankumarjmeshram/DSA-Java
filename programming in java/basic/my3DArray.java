public class my3DArray {
    public static void main(String[] args) {
        int a3DArray [][][] = new int[3][4][5];//new=> memory allocator & 3,4,5 are dimensions of 3D arr
        //first dimensions is for no. of pages , 2nd no. of rows and third for no.of column

        int i,j,k;
        for(i=0;i<3;i++)
            for(j=0;j<4;j++)
                for(k=0;k<5;k++)
                    a3DArray[i][j][k]=i*j*k;
;
         for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                for(k=0;k<5;k++){ 
                    System.out.print(a3DArray[i][j][k]+" ");
                }
                    System.out.println();
                 
            }
            System.out.println();
         }
                        
                             
    }
}
