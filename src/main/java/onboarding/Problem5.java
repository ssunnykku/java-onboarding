package onboarding;

import java.util.Arrays;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {

        int[] m = {50000,10000,5000,1000,500,100,50,10,1};
        Integer[] cnt = {0,0,0,0,0,0,0,0,0};
        List<Integer> answer = Arrays.asList(cnt);

        for(int i=0; i<m.length; i++) {
           if (money >= m[i]) {
              cnt[i] += money / m[i];
              money = money % m[i];
           }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15000));
    }

}
