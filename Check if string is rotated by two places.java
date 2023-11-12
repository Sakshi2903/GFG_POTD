class Solution
{
    static String leftrotate(String str, int d)
    {
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }
    static String rightrotate(String str, int d)
    {
            return leftrotate(str, str.length() - d);
    }
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(leftrotate(str1,2).equals(str2))
        {
            return true;
        }
        else if(rightrotate(str1,2).equals(str2))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
}
