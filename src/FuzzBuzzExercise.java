public class FuzzBuzzExercise {
    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz() {
        for(int i = 0; i < 100; i++) {
            boolean isFizzBuzz = i % 3 == 0 && i % 5 == 0;
            boolean isFizz = i % 3 == 0;
            boolean isBuzz = i % 5 == 0;
            if(isFizzBuzz){
                System.out.println("FizzBuzz");
            } else if(isFizz) {
                System.out.println("Fizz");
            } else if(isBuzz) {
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    }
}
