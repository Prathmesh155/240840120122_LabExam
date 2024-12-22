
public class LargestFourDigitNumber {

    public static void main(String args[]){

        int max_number = 9999;

        while(max_number > 1000){
            if(max_number % 10 == 0 && max_number % 13 == 0){
                System.out.println("Largest four digit number divisible by 10 and 13 is: " + max_number);
                break;
            }
        }

    }

}
