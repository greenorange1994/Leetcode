class Solution {
    public boolean isAnagram(String a, String b) {
        // Complete the function
        String a_low = a.toLowerCase();// Make your input toLowerCase.
        String b_low = b.toLowerCase();
        
        int[] alphabetArray = new int[26];
        for ( int i = 0; i < a_low.length(); i++ ) {
            char ch=  a_low.charAt(i);
            int value = (int) ch;
            if (value >= 97 && value <= 122){
            alphabetArray[ch-'a']++;
            }
        }
        
        int[] alphabetArray2 = new int[26];
        for ( int i = 0; i < b_low.length(); i++ ) {
            char ch2=  b_low.charAt(i);
            int value2 = (int) ch2;
            if (value2 >= 97 && value2 <= 122){
            alphabetArray2[ch2-'a']++;
            }
        }
        
        boolean flag = true;
        for (int j = 0; j < 26; j++) {
            if(alphabetArray[j] != alphabetArray2[j]){
                flag = false;
                break;
            }
        }
        
        return flag;
    }

}
