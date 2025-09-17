public class Sieve {
    public static void main(String[] args) {
        // Set up a boolean array

        // set all composite. numbers to true
        boolean[] numbers = new boolean[40];
        int mu = 2;
        int question = 36;

        while (mu < 5)
        {
            int ball = 2;

            for (int i = 0; i < 9; i++) {
                int composite;
                composite = (mu * ball);
                numbers[composite] = true;
                ball++;
            }
            mu++;
        }
         if (numbers[question] == false) {
            System.out.println("Number " + question + " is prime");
        }
        else {
            System.out.println("Number " + question + " is composite");
        }
    
    }
}
