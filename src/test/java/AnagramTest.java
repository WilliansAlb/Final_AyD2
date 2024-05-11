import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTest {
    public static final String FIRST_WORD_CORRECT = "espada";
    public static final String SECOND_WORD_CORRECT = "pesada";
    public static final boolean RESULT_CORRECT_ANAGRAM = true;
    public static final boolean RESULT_INCORRECT_ANAGRAM = false;
    public static final String SECOND_WORD_INCORRECT = "asadas";
    public static final String SAME_WORD = "asadas";
    public static final String SECOND_WORD_LENGTH_INCORRECT = "incorrecto";

    @Test
    public void ifCorrectAnagram(){
        Anagram anagram = new Anagram();
        boolean result = anagram.checkAnagram(FIRST_WORD_CORRECT, SECOND_WORD_CORRECT);
        Assertions.assertEquals(RESULT_CORRECT_ANAGRAM, result);
    }

    @Test
    public void ifIncorrectAnagram(){
        Anagram anagram = new Anagram();
        boolean result = anagram.checkAnagram(FIRST_WORD_CORRECT, SECOND_WORD_INCORRECT);
        Assertions.assertEquals(RESULT_INCORRECT_ANAGRAM, result);
    }

    @Test
    public void ifLengthOfWordsIsDifferent(){
        Anagram anagram = new Anagram();
        boolean result = anagram.checkAnagram(FIRST_WORD_CORRECT, SECOND_WORD_LENGTH_INCORRECT);
        Assertions.assertEquals(RESULT_INCORRECT_ANAGRAM, result);
    }

    @Test
    public void ifFirstWordIsNull(){
        Anagram anagram = new Anagram();
        boolean result = anagram.checkAnagram(null, SECOND_WORD_CORRECT);
        Assertions.assertEquals(RESULT_INCORRECT_ANAGRAM, result);
    }

    @Test
    public void ifSecondWordIsNull(){
        Anagram anagram = new Anagram();
        boolean result = anagram.checkAnagram(FIRST_WORD_CORRECT, null);
        Assertions.assertEquals(RESULT_INCORRECT_ANAGRAM, result);
    }

    @Test
    public void ifIsTheSameWord(){
        Anagram anagram = new Anagram();
        boolean result = anagram.checkAnagram(SAME_WORD, SAME_WORD);
        Assertions.assertEquals(RESULT_INCORRECT_ANAGRAM, result);
    }
}
