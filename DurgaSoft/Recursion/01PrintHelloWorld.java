class PrintHelloWorld {
    public static void m(int n) {
        if (n <= 0)
            return;
        System.out.println("Hello...");
        m(n - 1);
    }

    public static void main(String[] args) {
        m(5);
    }
}