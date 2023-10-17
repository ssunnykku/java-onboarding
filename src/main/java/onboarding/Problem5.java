package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {

        int[] m = {50000,10000,5000,1000,500,100,50,10,1};
        Integer[] cnt = {0,0,0,0,0,0,0,0,0};
        List<Integer> answer = Arrays.asList(cnt);
        // money가 m보다 클 때
        for(int i=0; i<m.length; i++) {
            while (m[i] <= money) {
                money -= m[i];
                cnt[i] += 1;
            }
        }
        return answer;
    }

}
