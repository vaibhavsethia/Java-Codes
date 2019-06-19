import java.util.Scanner;
public class HadamardMatrix
{
    boolean[][]H;
    int N;
    HadamardMatrix(int n)
    {
        H = new boolean[n][n];
        N = n;
    }
    void createHadamard()
    {
        H[0][0] = true;
        for(int n = 1;n<N;n+=n)
        {
            for(int i = 0;i<n;i++)
            {
                for(int j = 0;j<n;j++)
                {
                    H[i+n][j] = H[i][j];
                    H[i][j+n] = H[i][j];
                    H[i+n][j+n] = !H[i][j];
                }
            }
        }
    }
    void printHadamard()
    {
        for(int i = 0;i<N;i++)
        {
            for (int j = 0;j<N;j++)
            {
                if(H[i][j])
                System.out.print("T ");
                else
                System.out.print(". ");
            }
            System.out.println();
        }
    }
    public static void main(String S[])
    {
        System.out.println("Enter value of N (Must be a power of 2)");
        int N = new Scanner(System.in).nextInt();
        HadamardMatrix hmat = new HadamardMatrix(N);
        hmat.createHadamard();
        hmat.printHadamard();
    }
}