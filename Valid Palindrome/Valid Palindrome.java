class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();//IMPP
        s = s.toLowerCase();
        char[] ch = s.toCharArray();//IMPP
        int i=0,j=n-1;
        while(i<j)
        {
         if(!isAlphanumeric(ch[i]))
         {
             i++;
             continue;
             
         }
         if(!isAlphanumeric(ch[j]))
         {
             j--;
             continue;
             
         }   
         if(ch[i]!=ch[j])
         {
             return false;
         }
         
            i++;
            j--;
            
         }
    return true;
        
    }
    
    private boolean isAlphanumeric(char c) 
    {
        return Character.isLetter(c) || Character.isDigit(c);
    }
        
    
}