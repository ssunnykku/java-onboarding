package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = cryptogram.substring(0,1);
        for(int i=1; i<cryptogram.length(); i++) {
            String word = cryptogram.substring(i,i+1);
            String lastWord = answer.substring(answer.length()-1,answer.length());
            answer = checkEqual(answer, word, lastWord);
        }
        return answer;
    }

    public static String checkEqual(String answer, String word, String lastWord) {
        if (!word.equals(lastWord)) answer += word;
        else answer = answer.substring(0,answer.length()-1);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("browoanoommnaon"));
    }

}
