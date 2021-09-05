public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter(" mcGregor", 120, 79, 10, 50, 50);
        Fighter f2 = new Fighter(" kabib", 120, 82, 10, 50, 50);

        Match match = new Match(f1, f2, 75, 89);
        match.run();
    }
}
