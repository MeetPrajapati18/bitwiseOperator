public class findNthMagicNumber {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(magicNumberFinder(number));
    }

    static int magicNumberFinder(int n){
        int base = 5;
        int ans = 0;
        while (n > 0){
            int last = n&1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}

