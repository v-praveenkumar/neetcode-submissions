class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int i=0,j=word1.length()-1,x=0,y=word2.length()-1;
        while(i<=j && x<=y){
            s+=word1.charAt(i++);
            s+=word2.charAt(x++);
        }
        while(i<=j){
            s+=word1.charAt(i++);
        }
        while(x<=y){
            s+=word2.charAt(x++);
        }
        return s;
    }
}