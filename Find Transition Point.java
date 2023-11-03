class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        int ret=-1;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                ret=i;
                break;
            }
        }
        return ret;
    }
}
