
public class SubArrays{
    public static void SubArrays(int numbers[]){
        int t=0;
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                    sum+=numbers[k];
                }
                System.out.print("Sum = "+sum);
                System.out.println();
                t++;
                sum=0;
            }
            System.out.println();
        }
        System.out.println(t);


    }
    public static void main(String[] args) {
        int numbers[]={2,4,6};
        SubArrays(numbers);
    }
}