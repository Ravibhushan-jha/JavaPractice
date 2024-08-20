package Interview.XOR;

public class SwipeTowNoUsingXor {

    // XOR --> Bitwise execlusive or Or operation

    /*

    if 2 operands are different then return true
    if 2 operands are same then return false

    1   0   = 1
    0   1   = 1
    1   1   = 0
    0   0   = 0

    this is applicable for boolean and Integer

     */

    public static void main(String[] args) {



        System.out.println(false^true);
        System.out.println(false^false);
        System.out.println(true^true);
        System.out.println(true^false);

        int a = 5;
        int b = 6;

        System.out.println("Before swping value of a:" + a + " b :"+ b);

        //Swipe 2 values using XOR

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swping value of a:" + a + " b :"+ b);


        int[] num = {0,2,1,4,3,5,6,8,7,10};

        System.out.println("Missing No :" + missingNum90(num));
    }

    public static int missingNum90(int[] nums){

        int xor = nums.length;

        for(int i =0 ; i < nums.length; i++){
            xor^= i ^ nums[i];
        }

        return xor;
    }
}
