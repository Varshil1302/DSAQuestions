public class KnightTourProblem
{
    public static void main(String[] args)
    {
        int n = 5;
        int a[][] = knightTour(n);

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static int[][] knightTour(int n){
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=-1;
            }
        }
        a[0][0]=0;
        int[] moveX={2,1,-1,-2,-2,-1,1,2};
        int[] moveY={1,2,2,1,-1,-2,-2,-1};
        knightTour(n,a,moveX,moveY,0,0,1);
        return a;
    }

    private static boolean knightTour(int n, int[][] a, int[] moveX, int[] moveY, int curX, int curY, int steps)
    {
        if(steps==n*n) return true;
        for(int i=0;i<8;i++){
            int nextX=curX+moveX[i];
            int nextY=curY+moveY[i];
            if(isSafePasition(n,nextX,nextY,a)){
                a[nextX][nextY]=steps;
                boolean isTourCompleted=knightTour(n,a,moveX,moveY,nextX,nextY,steps+1);
                if(isTourCompleted){
                    return true;
                }
                else{
                    a[nextX][nextY]=-1;
                }
            }
        }
        return false;
    }

    private static boolean isSafePasition(int n, int nextX, int nextY, int[][] a)
    {
        return nextX>=0 && nextY>=0 && nextX<n && nextY<n && a[nextX][nextY]==-1;
    }
}
