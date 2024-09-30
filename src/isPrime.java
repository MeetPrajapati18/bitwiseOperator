public class isPrime {
    public static void main(String[] args) {
        int n = 18;
        //System.out.println(isNoPrime(n));
        for (int i = 2; i <= 40; i++) {
            if (isNoPrime(i)){
                System.out.print(i + ", ");
            }
        }
    }

    static boolean isNoPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
