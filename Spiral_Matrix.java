class Spiral_Matrix {
    public static void spiral(int mat[][]){
        int top=0,down=mat.length-1;
        int left=0,right=mat[0].length-1;
        int dir=0;

        while(left<=right && top<=down)
            {
                if(dir==0)
                {
                    for(int i=left;i<=right;i++)
                    System.out.print(mat[top][i]+" ");
                top++;
                }
                else if(dir==1)
                {
                    for(int i=top;i<=down;i++)
                    System.out.print(mat[i][right]+" ");
                right--;
                }
                else if(dir==2)
                {
                    for(int i=right;i>=left;i--)
                    System.out.print(mat[down][i]+" ");
                down--;
                }
                else
                {
                    for(int i=down;i>=top;i--)
                    System.out.print(mat[i][left]+" ");
                left++;
                }
                dir=(dir+1)%4;
            }
    }
}
