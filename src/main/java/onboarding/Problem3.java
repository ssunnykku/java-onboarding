package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        for(int i=1; i<number+1; i++) {
            String str = Integer.toString(i);
            String[] arr = str.split("");

            answer += Collections.frequency(Arrays.asList(arr),"3");
            answer += Collections.frequency(Arrays.asList(arr),"6");
            answer += Collections.frequency(Arrays.asList(arr),"9");
        }
        return answer;
    }

}
