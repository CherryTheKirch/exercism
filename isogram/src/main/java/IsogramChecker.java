import java.util.Arrays;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        boolean state = false;
        if(phrase == "")
            return true;
        char[] chars = phrase.toLowerCase().toCharArray();
        Arrays.sort(chars);
        for(int i=0;i < chars.length-1;i++){
            char a = chars[0+i];
            char b = chars[1+i];
            if(a==b){
                state = false;
            } else{
                state = true;
            }
        }
        return state;
    }
}