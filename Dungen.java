import java.util.Scanner;
public class Dungen {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Dungen d = new Dungen();
        int n = s.nextInt();
        int m = s.nextInt();
        String[][] maze = new String[n][m];
     int p1=s.nextInt();
     int p2=s.nextInt();
     int t1=s.nextInt();
     int t2=s.nextInt();
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++){
                if(p1-1==i&&p2-1==j) {
                    maze[i][j]="p";
                    System.out.print("p  ");
                }
                else if (t1-1==i&&t2-1==j)
                {
                    maze[i][j]="t";
                    System.out.print("t  ");
                }
                else {
                    maze[i][j]="_";
                    System.out.print("_  ");

                }
            }
            System.out.println();
        }
        int count=0;
        while(p1!=t1){
            String temp;
            while(p2!=t2){
            if(p2<t2) {
                p2++;
                temp = maze[p1-1][p2-1];
                maze[p1-1][p2-1]=maze[p1-1][p2-1];
                maze[p1-1][p2-1]=temp;
                count++;
            } else if (p2>t2) {
                p2--;
                temp = maze[p1-1][p2-1];
                maze[p1-1][p2-1]=maze[p1-1][p2-1];
                maze[p1-1][p2-1]=temp;
                count++;
            }

            }
            if(p1<t1) {
                p1++;
                temp = maze[p1-1][p2-1];
                maze[p1-1][p2-1]=maze[p1-1][p2-1];
                maze[p1-1][p2-1]=temp;
                count++;
            } else if (p1>t1) {
                p1--;
                temp = maze[p1-1][p2-1];
                maze[p1-1][p2-1]=maze[p1-1][p2-1];
                maze[p1-1][p2-1]=temp;
                count++;
            }
        }
        System.out.println(count);
}
}
