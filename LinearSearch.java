
class LinearSearch { 
   public static int linearSearch(String [] arr, String str)
   {
        for (int i = 0; i < n; i++) 
        
            // Return the index of the element if the element 
            // is found 
            
            if (arr[i] == str) 
            
                return i; 
        } 
  
        // return -1 if the element is not found 
        return -1; 
    }
    public static int linearSearch(char[] arr1,char ch)
    {
         for(int i=0;i<arr1.length;i++)
            {    
                if(arr1[i] == ch)
                {    
                    return i;    
                }    
        }          
        return -1;  
}
    public static void main(String args[])
    {    
          
          String[] s= {"Misbah","Mahnoor","Maham","Asra","Javria","Simran"};    
        String str = "Simran";    
        System.out.println(str +" is found at index: "+ linearSearch(s, str));
        char[] c= {'A','B','C','D','E','F','G'};    
        char ch = 'D';    
        System.out.println(ch +" is found at index: "+ linearSearch(c, ch));
    }
}
        
        