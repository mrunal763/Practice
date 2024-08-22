public class kadanes {
    public static void MaxSubArray(int numbers[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
        currSum=currSum+numbers[i];
        if(currSum<0){
            currSum=0;
        }
        maxSum=Math.max(currSum,maxSum);
    }
    System.out.println("Max sum = "+maxSum);
}

public static void main(String[] args) {
    int numbers[]={5,-8,6,-6,-7,4,-2,3};
    MaxSubArray(numbers);
}
}

