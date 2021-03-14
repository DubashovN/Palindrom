public class Palindrome {
        public boolean isPalindrome(String string){
            char[] lolArr = string.toCharArray();
            boolean isPalindrom = true;
            for (int i = 0; i < lolArr.length - 1; i++) {
                char element = lolArr[i];
                if (element != lolArr[lolArr.length - 1 - i]) {
                    isPalindrom = false;
                }
            }
            return isPalindrom;
        }
}

