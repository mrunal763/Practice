public class TraappedWater {
    public static int Water(int height[]){
        int n=height.length;
        int left[]=new int[n];
        left[0]=height[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        int right[]=new int[n];
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        int TrappedRain=0;
        for(int i=0;i<n;i++){
            int Waterlevel=Math.min(left[i],right[i]);
            TrappedRain+=Waterlevel-height[i];
        }
        return TrappedRain;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(Water(height));
    }
}
