class Solution
{
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
       return (s1.length() == s2.length())
            && ((s1 + s1).indexOf(s2) != -1);
    }
    
}
