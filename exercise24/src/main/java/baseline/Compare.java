package baseline;

public class Compare {
    //Create a function that compares two strings to see if they are anagrams
    //Create method: stringCompare(String A, String B)
    public boolean stringCompare(String str1, String str2){
        /*ADDITION TO PSEUDOCODE: Due to the fact for-each loops cannot be applied to Strings,
        two arrays of chars must be created and copied from the input strings*/
        if (str1.length()==str2.length()) {
            char[] arrA;
            char[] arrB;
            arrA = new char[str1.length()];
            arrB = new char[str2.length()];
            for (int i = 0; i < str1.length(); i++) {
                //Copy the char array for each from its corresponding string
                arrA[i] = str1.charAt(i);
                arrB[i] = str2.charAt(i);
            }

            //Now that the char arrays are created, the procedure to figure out whether they are anagrams should be this
            int count = 0;
            for (char i : arrA){
                for (char j : arrB) {
                        if (i == j) {
                            count ++;
                            break;
                        }
                }
            }
            return count == str1.length();
        } else {
            return false;
        }
        //return a boolean flag anagram, //true if anagram, false if not anagram
    }




}
