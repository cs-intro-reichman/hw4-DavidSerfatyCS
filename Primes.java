


public class Primes {
    public static void main(String[] args) {
       
            int roofN = Integer.parseInt(args[0]);
            int n = roofN + 1;

       
            boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) { isPrime[i] = true; }

        int p = 2;
        
        while ( p <= Math.sqrt(n) ) { 

            if (isPrime[p] == true) {

            int j;
                for ( j = p ; j < n; j++) {

                    boolean isDivisible = (double) ( (j + 1) % p) == 0;

                    if (isDivisible == true) { isPrime[j+1] = false; }
                }  
            }
            p = getNextprime(isPrime, p + 1);
        }

            System.out.println("Prime numbers up to " + roofN + ":");
            primeArray(isPrime, roofN);

    }

    public static int getNextprime (boolean[] arr, int index) {
            int i;
        for ( i = index; i < arr.length; i++) {
            if (arr[i] == true) { return i; }
        }
        return i;

    }

     public static void primeArray (boolean[] arr, int n) {
            int nOfPrimes = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == true) {
                    System.out.println(i); 
                    nOfPrimes++; 
            }
        }
            double pPercent = Math.floor((nOfPrimes*100)/n) ;

            System.out.print("There are " + nOfPrimes + " primes between 2 and " + n); 
            System.out.println(" (" + (int) pPercent + "% are primes)");
    }
}
