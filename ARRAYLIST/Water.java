import java.util.ArrayList;

class Water{
    // brute force solution O(n^2)
    public static int water(ArrayList<Integer> list){
        int maxwater=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int height=Math.min(list.get(i),list.get(j));
                int width=j-1;
                int curr=height*width;
                maxwater=Math.max(curr,maxwater);
            }
        }
        return maxwater;
    }
    public static int StoreWater(ArrayList<Integer> list){
        // 2 pointer approach O(n)
        int maxwater=0;
        int rp=list.size()-1;
        int lp=0;
        while(lp<rp){
            int height=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int curr=width*height;
            maxwater=Math.max(maxwater,curr);

            if(list.get(lp)<list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(StoreWater(list));
    }
}