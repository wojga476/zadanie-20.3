package pl.javastart;

public class Palindrome {

    public int palindromeCalc(int maxNum) {

        int max = 0;

        for (int i = 1; i < maxNum; i++) {
            for (int j = 1; j < maxNum; j++) {

                if (isPalindrom(i * j)) {
                    if (max < (i * j)) {
                        max = i * j;
                    }
                }
            }
        }
        return max;
    }

    public boolean isPalindrom(int num) {

        String a = Integer.toString(num);
        StringBuilder b = new StringBuilder().append(a);

        return a.equals(b.reverse().toString());
    }
}
