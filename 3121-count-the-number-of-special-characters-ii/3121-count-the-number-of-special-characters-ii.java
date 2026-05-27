class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
       for(int i=0;i<26;i++)
       {
        char lower=(char)('a'+i);
        char upper=(char)('A'+i);
        if(word.contains(String.valueOf(lower)) && word.contains(String.valueOf(upper)))
        {
            int lindex=word.lastIndexOf(String.valueOf(lower));
            int uindex=word.indexOf(String.valueOf(upper));
            if(lindex<uindex)count++;
        }
       }
       return count;
    }
}