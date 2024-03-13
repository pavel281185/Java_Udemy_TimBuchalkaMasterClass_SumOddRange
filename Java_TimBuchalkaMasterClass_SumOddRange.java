public class SumOddRange {
    public static boolean isOdd(int number){
        if(number > 0 && number % 2 == 1){
            return true;
        }
        return false;
    }
    
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(end < start || start < 1 || end < 1){
            return -1;
        }
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
