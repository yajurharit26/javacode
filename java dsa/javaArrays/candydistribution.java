import java.util.Arrays;

public class candydistribution {
   public static void main(String[] args) {
    int[] candyType = {1,1,2,3};
    int distribution = distributeCandies(candyType);
    System.out.println(distribution);
   }  
    public static int distributeCandies(int[] candyType) {
    Arrays.sort(candyType);
    int type = 1;
    for(int i = 1; i < candyType.length;i++){
        if(candyType[i]!=candyType[i-1]){
            type++;
        }
    }
        return Math.min(type,candyType.length/2);
    
    // Set<Integer> UniqueCandy  = new HashSet<>();
    //    for(int candyTypes:candyType){
    //        UniqueCandy.add(candyTypes);
    //    }
       
    //    int half  = candyType.length/2;
       
    //    return Math.min(UniqueCandy.size(),half);
    }
}
