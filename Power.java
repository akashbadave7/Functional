class Power
{
        public static void main(String args[])
        {
                try
                {
                        int n = Integer.parseInt(args[0]);
                        int res =1;
                        System.out.println("2^0 = 1");
                        for (int i=1;i<=n;i++)
                        {
                                res = 2*res;
                                System.out.println("2^"+i+" = "+res);
                        }
                }
                catch(Exception e)
                {
                        System.out.println("Please provide the value of N.");
                }
        }
}
