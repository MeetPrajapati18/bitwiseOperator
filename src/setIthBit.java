public class setIthBit {

    public static void main(String[] args) {
        int number = 46; // Example number
        int i = 4; // Index of the bit to set (0-based)

        int newNumber = setIthBit(number, i);
        System.out.println("Original number: " + number + " (binary: " + Integer.toBinaryString(number) + ")");
        System.out.println("New number with " + i + "th bit set: " + newNumber + " (binary: " + Integer.toBinaryString(newNumber) + ")");
    }

    public static int setIthBit(int number, int i) {
        // Create a mask by shifting 1 to the left by i positions
        int mask = 1 << i;
        // Use bitwise OR to set the i-th bit
        return number | mask;
    }
}
