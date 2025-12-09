public class RatInMazeProblem
{
    public static void main(String[] args) {
       int[][] matrix={
               {1,1,1,0},
               {1,1,0,1},
               {1,1,0,0},
               {1,1,1,1}
       };
       int n=matrix.length;
       int m=matrix[0].length;
       boolean[][] visited=new boolean[n][m];
       visited[0][0]=true;
       ratInMaze(n,m,matrix,visited,"",0,0);
    }

    private static boolean isVisited(int n,int m,int[][] matrix,boolean[][] visited,int i,int j){
        if(i<n && i>=0 && j<m && j>=0 && matrix[i][j]==1 && !visited[i][j]){
            return true;
        }
        return false;
    }

    private static void ratInMaze(int n, int m, int[][] matrix, boolean[][] visited, String path, int i, int j)
    {
        if(i==n-1 && j==m-1){
            System.out.println(path);
            return;
        }
        if(isVisited(n,m,matrix,visited,i+1,j)){ //D
            visited[i+1][j]=true;
            ratInMaze(n,m,matrix,visited,path+"D",i+1,j);
            visited[i+1][j]=false;
        }
        if(isVisited(n,m,matrix,visited,i,j-1)){ //L
            visited[i][j-1]=true;
            ratInMaze(n,m,matrix,visited,path+"L",i,j-1);
            visited[i][j-1]=false;
        }
        if(isVisited(n,m,matrix,visited,i,j+1)){ //R
            visited[i][j+1]=true;
            ratInMaze(n,m,matrix,visited,path+"R",i,j+1);
            visited[i][j+1]=false;
        }
        if(isVisited(n,m,matrix,visited,i-1,j)){ //U
            visited[i-1][j]=true;
            ratInMaze(n,m,matrix,visited,path+"U",i-1,j);
            visited[i-1][j]=false;
        }
    }
}
