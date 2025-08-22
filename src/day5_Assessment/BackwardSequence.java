package day5_Assessment;
class BackwardSequence implements CharSequence {
    private final String original;
    private final String reversed;
    public BackwardSequence(String original) {
        this.original = original;
        this.reversed = new StringBuilder(original).reverse().toString();
    }
    public int length() {
        return reversed.length();
    }
    public char charAt(int index) {
        return reversed.charAt(index);
    }
    public CharSequence subSequence(int start, int end) {
        return reversed.subSequence(start, end);
    }
    public String toString() {
        return reversed;
    }
    public static void main(String[] args) {
        BackwardSequence bs = new BackwardSequence("hello");
        System.out.println("toString(): " + bs.toString());
        System.out.println("length(): " + bs.length());
        System.out.println("charAt(1): " + bs.charAt(1));
        System.out.println("subSequence(1, 4): " + bs.subSequence(1, 4));
    }
}
