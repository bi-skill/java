public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm guessing the number0 до 9...");

        while (true){
            System.out.println("The number to guess is - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("The first player thinks it is -" + guessp1);

            guessp1 = p2.number;
            System.out.println("The second player thinks it is -" + guessp2);

            guessp1 = p3.number;
            System.out.println("The third player thinks it is -" + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }

            if (guessp2 == targetNumber) {
                p2isRight = true;
            }

            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Did the first player get it right?");
                System.out.println("Did the second player get it right?");
                System.out.println("Did the third player get it right?");
                System.out.println("End of the game");
                break;
            } else {
                System.out.println("Please return");
            }
        }
    }
}