
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        int subtraction = ages[0] - ages[ages.length - 1];
        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 100};
        int subtraction2 = ages2[0] - ages2[ages2.length - 1];
        System.out.println(subtraction);
        System.out.println(subtraction2);
        int sum = 0;
        for (int j : ages2) {
            sum += j;
        }
        System.out.println("average age: " + sum / ages2.length);
        //-------------------------
//        2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//        a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//        b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int sumOfLetters = 0;
        for (String name : names) {
            sumOfLetters += name.length();
        }
        System.out.println("average number of letters per name: " + sumOfLetters / names.length);
        String allNames = "";
        for (String name : names) {
            allNames += name + " ";
        }
        System.out.println(allNames);
        //-------------------------

        //3. How do you access the last element of any array?
        System.out.println(names[names.length - 1]);
        //4. How do you access the first element of any array?
        System.out.println(names[0]);
        //5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        int[] nameLengths = new int[names.length];
        //6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        int[] luckyNumbers = lottoPicker();
        System.out.println("My lucky lotto numbers are: " + luckyNumbers[0] + " " + luckyNumbers[1] + " " + luckyNumbers[2] + " " + luckyNumbers[3] + " " + luckyNumbers[4]);
    }

    //7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
    String word = "Hello";
    int n = 3;

    public String concatenate(String word, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += word;
        }
        return result;
    }

    //8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
    public String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    //9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
    public boolean sumOfInts(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum > 100;
    }

    //10. Write a method that takes an array of double and returns the average of all the elements in the array.
    public double averageOfDoubles(double[] array) {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    //11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
    public boolean compareAverages(double[] array1, double[] array2) {
        double sum1 = 0;
        double sum2 = 0;
        for (double i : array1) {
            sum1 += i;
        }
        for (double i : array2) {
            sum2 += i;
        }
        return sum1 / array1.length > sum2 / array2.length;
    }

    //12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
    public boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    //13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
    //This method takes an array of integers and returns the sum of all the even numbers in the array.
    public static int[] lottoPicker() {
        Random rand = new Random();
        int min = 1;
        int max = 45;
        int lottoFirst = rand.nextInt(min, 40);
        int lottoSecond = rand.nextInt(lottoFirst, max);
        int lottoThird = rand.nextInt(lottoSecond, max);
        int lottoFourth = rand.nextInt(lottoThird, max);
        int lottoFifth = rand.nextInt(lottoFourth, max);
        int[] luckyNumbers = {lottoFirst, lottoSecond, lottoThird, lottoFourth, lottoFifth};
        return luckyNumbers;
    }
}

