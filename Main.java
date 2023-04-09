public class Main {
    public static void main(String[] args) {

        NumberGenerator numberGenerator = new NumberGenerator(7, 50);
        UserPicks userPicks = new UserPicks(7, 50);

        System.out.println(numberGenerator.toString());
        System.out.println(userPicks.toString());

    }
}