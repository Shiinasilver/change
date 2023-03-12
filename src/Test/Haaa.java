package Test;

public class Haaa {



}
class Solution{
    public int minTime(int[] time, int m) {
        int left = 0;
        int right = Integer.MAX_VALUE;
        while (left <= right){
            int mid = left+(right-right)/2;
            if (check(time,mid,m)){
                right = mid -1;
            }else {
                left = mid +1;
            }
        }
        return left;
    }
    boolean check(int[] time ,int target,int m){
        int maxTime = 0;
        int total = 0;
        int days = 1;
        boolean helper = true;
        for (int i = 0;i < time.length;i++){
            maxTime = Math.max(maxTime,time[i]);
            total += time[i];
            if(total>target){
                if (helper){
                    total -= maxTime;
                    helper = false;
                }else{
                    days++;
                    helper = true;
                    maxTime = 0;
                    total = 0;
                    i--;
                }
            }
        }
        return  m >= days;

    }
}
