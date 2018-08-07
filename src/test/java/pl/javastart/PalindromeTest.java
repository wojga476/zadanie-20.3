package pl.javastart;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PalindromeTest {

    private Palindrome palindrome;

    @Before
    public void init(){
       palindrome = new Palindrome();
    }

    @Test
    public void return10(){
        //given
        int b = 10;

        //when
        int result = palindrome.palindromeCalc(b);

        //then
        assertThat(result, is(9));
    }
    @Test
    public void return100(){
        //given
        int b = 100;

        //when
        int result = palindrome.palindromeCalc(b);

        //then
        assertThat(result, is(9009));
    }
}