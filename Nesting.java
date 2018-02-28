public class Nesting {
    public static int solution(String S){
        int closedCount = 0;
        for(int i = (S.length() - 1); i >= 0; i--){
            if(S.charAt(i) == ')'){
                closedCount++;
            }
            else if(S.charAt(i) == '('){
                closedCount--;
                if(closedCount < 0){
                    return 0;
                }
            }
        }
        if(closedCount != 0){
            return 0;
        }
        return 1;
    }
}
