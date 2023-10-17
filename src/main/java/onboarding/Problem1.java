package onboarding;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = -1;
        if (isRightPage(pobi,crong)) return answer;
        if (isRightRange(pobi.get(0),pobi.get(1)) || isRightRange(crong.get(0),crong.get(1))) return answer;

        int pobiPoint = Math.max(getSumPoint(pobi.get(0),pobi.get(1)),getMultiplicationPoint(pobi.get(0),pobi.get(1)));
        int crongPoint = Math.max(getSumPoint(crong.get(0),crong.get(1)),getMultiplicationPoint(crong.get(0),crong.get(1)));

        answer = compare(pobiPoint, crongPoint);

        return answer;
    }

    private static int compare(int pobiPoint, int crongPoint) {
        int result = pobiPoint-crongPoint;
        int answer = -1;
       if(result > 0) {
           answer = 1;
       } else if(result<0) {
           answer = 2;
       } else if (result==0) {
           answer = 0;
       }

        return answer;
    }

    private static boolean isRightPage(List<Integer> someone1,List<Integer> someone2) {
        return someone1.get(1) - someone1.get(0) != 1 || someone2.get(1) - someone2.get(0) != 1;
    }

    private static boolean isRightRange(int page1, int page2){
        return !(1<= page1 && page2 <=400);
    }

    private static int[] getNum(int page, int num1) {

        int num2= (page/10 -(page/100)*10); int num3 = (page-((page/10)*10));
        int[] result = {num1, num2, num3};

        return result;
    }

    private static int getSumPoint(int page1, int page2) {
        return Arrays.stream(getNum(page1, page1/100)).sum() + Arrays.stream(getNum(page2, page2/100)).sum();
    }

    private static int getMultiplicationPoint(int page1, int page2) {
        int result = Arrays.stream(getNum(page1,(page1/100==0)?1:page1/100)).reduce(1,(a,b)->a*b) * Arrays.stream(getNum(page2,(page2/100==0)?1:page1/100)).reduce(1,(a,b)->a*b);
        return result;
    }


}

