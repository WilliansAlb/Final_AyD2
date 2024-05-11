public class Anagram {

    public boolean checkAnagram(String firstWord, String secondWord){
        if (firstWord == null || secondWord == null || firstWord.length() != secondWord.length() || firstWord.equalsIgnoreCase(secondWord)){
            return false;
        }
        for (int i = 0; i < firstWord.length(); i++) {
            char selectedLetter = firstWord.charAt(i);
            if ((int) selectedLetter < 64){
                return false;
            }
            secondWord = secondWord.replaceFirst(selectedLetter+"", "");
        }
        return secondWord.length() == 0;
    }
}
