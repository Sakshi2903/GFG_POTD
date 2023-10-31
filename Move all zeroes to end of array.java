class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int cntzero=0,j=0;
	    int [] nonZero = new int [n];
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]==0)
	            cntzero++;
	        else
	        {
	            nonZero[j]=arr[i];
	            j++;
	        }
	    }
	    int i=0;
	    for(i=0;i<j;i++)
	    {
	        arr[i]=nonZero[i];
	    }
	    while(cntzero>0)
	    {
	        arr[i]=0;
	        i++;
	        cntzero--;
	    }
    }
}
