
public class ArrayPair{
    public static void Arrays(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,9,10,24};
        Arrays(numbers);
    }
}