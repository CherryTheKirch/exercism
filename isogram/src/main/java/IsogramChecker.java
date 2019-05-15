import java.nio.file.SecureDirectoryStream;
import java.rmi.server.RemoteStub;
import java.util.Arrays;
import java.util.HashSet;

class IsogramChecker {

    private static final String STRING = "";
    private static final String STRING2 = STRING;

    boolean isIsogram(String phrase) {
        boolean state = false;

        char[] letters = phrase.replaceAll("\\W", "").toLowerCase().toCharArray();
       HashSet<Character> set = new HashSet();

       for(char letter : letters){
           set.add(letter);
       }
       
       if(set.size() == letters.length) state = true;
       
       return state;
    }
}