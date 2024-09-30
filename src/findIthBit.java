public class findIthBit {
    public static void main(String[] args) {
        int n = 18;
        int i = 1;
        System.out.println(bitFinder(n,i));
        System.out.println(Integer.toBinaryString(n));
    }

    public static int bitFinder(int n, int i){
        int mask = 1 << i;
        return (n & mask) >> i;
    }
}
