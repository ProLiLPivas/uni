public class Primes {

    public static void main(String[] args) {
        for(int i = 2; i < 101; i++){
            if (isPrime(i)){
                System.out.print(i);
                System.out.print(' ');
            }
        }

    }

    public static boolean isPrime(int number){
        int amount_of_divisors = 0;
        for(int iteration = 1 ; iteration < number; iteration++){
            if (number % iteration == 0){
                amount_of_divisors += 1;
            }
        }
        if( amount_of_divisors <= 2) {
            return true;
        }
        else{
            return  false;
        }

    }

}

