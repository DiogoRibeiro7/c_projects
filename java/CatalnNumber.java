package c_projects.java;

public class CatalnNumber {
    int catalan(int n)
    {
        int res = 0;
 
        // Base case
        if (n <= 1)
        {
            return 1;
        }
        for (int i = 0; i < n; i++)
        {
            res += catalan(i)
                * catalan(n - i - 1);
        }
        return res;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        CatalnNumber cn = new CatalnNumber();
        for (int i = 0; i < 15; i++)
        {
            System.out.print(cn.catalan(i) + " ");
        }
    }
    
}
