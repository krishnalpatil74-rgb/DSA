class Solution {
    public int strStr(String haystack, String needle) {

        for(int i=0; i<haystack.length()-needle.length()+1;i++){
// to check every index of haystack to first index of needle 
            if(haystack.charAt(i)== needle.charAt(0)){

                //to check substring if ist index is matching 
               if(haystack.startsWith(needle, i)){
                    return i;
                }

            }
        }
        return -1;

        
    }
}