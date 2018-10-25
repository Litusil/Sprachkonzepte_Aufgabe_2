public class A6 {

    public static void main (String[] args){
       System.out.print(sum());
    }

    private static int sum()
    {
        int x = 0;
        for(int i = 1;i < 1001; i++ )
        {
            if(i % 3 == 0 || i % 5 == 0 )
            {
                x += i;
            }
        }
        return x;
    }
}
