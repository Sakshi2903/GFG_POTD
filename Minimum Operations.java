class Solution
{
    public int minOperation(int n)
    {
        //code here.
        int operation=2;
        
        if(n==1)    return 1;
        if(n==2)    return 2;
        
        while(n>2)
        {
            operation++; 
            if(n%2==0)
            {
                n=n/2;
            }
            else
            {
                n-=1;
            }
        }
        
        return operation;
    }
}
