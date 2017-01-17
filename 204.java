public class Solution {
    public int countPrimes(int n) {  
      if (n <= 2)
                return 0;
                
            int count = 0;
            
            for (int i = 3; i < n; i+=2) {
                if (isPrime(i))
                    count++;
            }
            return count+1;
        }
        
        public boolean isPrime(int x) {
            for (int j = 3; j < x; j++) {
                if (x%j == 0)
                    return false;
            }
            return true;
        }
    }
}    

/*
    TLE for n > 50000
*/
    public class Solution {
    public int countPrimes(int n) {
      boolean[] notPrime = new boolean[n];
      int count = 0;
      
      for (int i = 2; i < n; i++) {
          if (notPrime[i] == false) {
              count++;
              for (int j = 2; i*j < n; j++) {
                  notPrime[i*j] = true;
              }
          }
      }
      
      return count;
    }
}