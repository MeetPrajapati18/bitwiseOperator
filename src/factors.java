import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        printFactors(20);
        System.out.println();
        factors3(20);
    }

    static void printFactors(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                //System.out.print(i + " ");
                if (n / i == i){
                    System.out.print(i + " ");
                } else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    //both time and space will be O(sqrt(n))
    static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                //System.out.print(i + " ");
                if (n / i == i){
                    System.out.print(i + " ");
                } else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}

/*
 * Properties of Modulo:
 * ---------------------
 * (a+b)%m = ((a%m) + (b%m))%m
 * (a-b)%m = ((a%m) - (b%m))%m
 * (a*b)%m = ((a%m) * (b%m))%m
 * (a/b)%m = ((a%m) * (b^-1%m))%m
 * (a % m) % m = a % m
 * m % m = 0
 * ax + by  = r
 *
 * Euclid's Algorithms:
 * --------------------
 * gcd(a,b) = gcd(rem(b,a),a)
 * gcd(105,224) = gcd(rem(224,105),105)
 *              = gcd(14,105)
 * because the gcd of 105,224 also divides a linear combination of 105 & 224
 * 224 - 2 * 105 = 14
 *
 * LCM(a,b) = (a*b) / HCF(a,b)
 */
