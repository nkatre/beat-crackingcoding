package chpt1.practice.myself;

public class InterviewQuestions1_2 {
    
    /**
     * reverse a string
     * @param target
     * @return
     */
    
    public static String reverseString(String target) {
        char[] tArray = target.toCharArray();
        char temp;
        //TODO point is odd/2 -> lower bound tricky!
        for(int i = 0; i < target.length() / 2; i ++){
            temp = tArray[i];
            tArray[i] = tArray[target.length() - 1 - i];
            tArray[target.length() - 1 - i] = temp;
        }
        return tArray.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(InterviewQuestions1_2.reverseString("sdfsdifsdfsdfb"));
    }
}
