class Solution {
    static int isPossible(int N, int arr[]) {
        // code here
        
        long sum=0;
        for(int i=0;i<N;i++)
        {
            sum=sum+arr[i];
        }
        if(sum%3==0)
            return 1;
        else 
            return 0;
    }
}
