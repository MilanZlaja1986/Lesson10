package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {
	
	Palindrome testPalindrome = new Palindrome();

	@Test
	void testLoadWords() {
		assertTrue(testPalindrome.loadWords().contains("apple"));
	}
	
	// 2. Test that a word exists in the dictionary 
	@Test
	void testWordApears() throws Exception{
		assertTrue(testPalindrome.loadWords().contains("abacist"));
		assertTrue(testPalindrome.loadWords().contains("acetonaphthone"));		
		assertTrue(testPalindrome.loadWords().contains("extracalicular"));
		
		assertFalse(testPalindrome.loadWords().contains("fervider"));
	}
	
	
	
	// 3. Test that a word is a palindrome
	@Test
	void testIsWordPalindrome() throws Exception{
		assertTrue(testPalindrome.isWordPalindrome("madam"));
		assertTrue(testPalindrome.isWordPalindrome("aba"));		
		assertTrue(testPalindrome.isWordPalindrome("civic"));
		
		assertFalse(testPalindrome.isWordPalindrome("civilly"));
	}
	

}
