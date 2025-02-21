public class Logic1Tester {
    public static void main(String[] args) {
        Logic1 logicMethods = new Logic1();

        // TEST CASES: buzzStrings
        if (!logicMethods.buzzStrings("fig").equals("Fizz")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("dib").equals("Buzz")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("fib").equals("FizzBuzz")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("abc").equals("abc")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("fooo").equals("Fizz")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("booo").equals("booo")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("ooob").equals("Buzz")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("f").equals("Fizz")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("b").equals("Buzz")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("abcb").equals("Buzz")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("Hello").equals("Hello")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("Hellob").equals("Buzz")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("af").equals("af")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("bf").equals("bf")) {
            System.out.println("Error in buzzStrings");
            return;
        } else if (!logicMethods.buzzStrings("fb").equals("FizzBuzz")) {
            System.out.println("Error in buzzStrings");
            return;
        } else {
            System.out.println("Correct implementation of buzzStrings");
        }


        // TEST CASES: sameLastDigit
        if (!logicMethods.sameLastDigit(23, 19, 13) == true) {
            System.out.println("Error in sameLastDigit");
            return;
        } else if (!logicMethods.sameLastDigit(23, 19, 12) == false) {
            System.out.println("Error in sameLastDigit");
            return;
        } else if (!logicMethods.sameLastDigit(23, 19, 3) == true) {
            System.out.println("Error in sameLastDigit");
            return;
        } else if (!logicMethods.sameLastDigit(23, 19, 39) == true) {
            System.out.println("Error in sameLastDigit");
            return;
        } else if (!logicMethods.sameLastDigit(1, 2, 3) == false) {
            System.out.println("Error in sameLastDigit");
            return;
        } else if (!logicMethods.sameLastDigit(1, 2, 2) == true) {
            System.out.println("Error in sameLastDigit");
            return;
        } else if (!logicMethods.sameLastDigit(14, 25, 43) == false) {
            System.out.println("Error in sameLastDigit");
            return;
        } else if (!logicMethods.sameLastDigit(14, 25, 45) == true) {
            System.out.println("Error in sameLastDigit");
            return;
        } else if (!logicMethods.sameLastDigit(248, 106, 1002) == false) {
            System.out.println("Error in sameLastDigit");
            return;
        } else if (!logicMethods.sameLastDigit(248, 106, 1008) == true) {
            System.out.println("Error in sameLastDigit");
            return;
        } else if (!logicMethods.sameLastDigit(10, 11, 20) == true) {
            System.out.println("Error in sameLastDigit");
            return;
        } else if (!logicMethods.sameLastDigit(0, 11, 0) == true) {
            System.out.println("Error in sameLastDigit");
            return;
        } else {
            System.out.println("Correct implementation of sameLastDigit");
        }



        // TEST CASES: sixIsMyFavorite
        if (!logicMethods.sixIsMyFavorite(6, 4) == true) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(4, 5) == false) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(1, 5) == true) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(1, 6) == true) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(1, 8) == false) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(1, 7) == true) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(7, 5) == false) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(8, 2) == true) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(6, 6) == true) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(-6, 2) == false) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(-4, -10) == true) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(-7, 1) == false) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(7, -1) == true) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(-6, 12) == true) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(-2, -4) == false) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(7, 1) == true) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(0, 9) == false) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(8, 3) == false) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(3, 3) == true) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else if (!logicMethods.sixIsMyFavorite(3, 4) == false) {
            System.out.println("Error in sixIsMyFavorite");
            return;
        } else {
            System.out.println("Correct implementation of sixIsMyFavorite");
        }


        // TEST CASE: slotMachines
        if (logicMethods.slotMachines(2, 2, 2) != 10) {
            System.out.println("Error in slotMachines");
            return;
        } else if (logicMethods.slotMachines(2, 2, 1) != 0) {
            System.out.println("Error in slotMachines");
            return;
        } else if (logicMethods.slotMachines(0, 0, 0) != 5) {
            System.out.println("Error in slotMachines");
            return;
        } else if (logicMethods.slotMachines(2, 0, 0) != 1) {
            System.out.println("Error in slotMachines");
            return;
        } else if (logicMethods.slotMachines(1, 1, 1) != 5) {
            System.out.println("Error in slotMachines");
            return;
        } else if (logicMethods.slotMachines(1, 2, 1) != 0) {
            System.out.println("Error in slotMachines");
            return;
        } else if (logicMethods.slotMachines(1, 2, 0) != 1) {
            System.out.println("Error in slotMachines");
            return;
        } else if (logicMethods.slotMachines(0, 2, 2) != 1) {
            System.out.println("Error in slotMachines");
            return;
        } else if (logicMethods.slotMachines(1, 2, 2) != 1) {
            System.out.println("Error in slotMachines");
            return;
        } else if (logicMethods.slotMachines(0, 2, 0) != 0) {
            System.out.println("Error in slotMachines");
            return;
        } else if (logicMethods.slotMachines(1, 1, 2) != 0) {
            System.out.println("Error in slotMachines");
            return;
        } else {
            System.out.println("Correct implementation of slotMachines");
        }



        // TEST CASE: shortLongShort
        if (!logicMethods.shortLongShort("Hello", "hi").equals("hiHellohi")) {
            System.out.println("Error in shortLongShort");
            return;
        } else if (!logicMethods.shortLongShort("hi", "Hello").equals("hiHellohi")) {
            System.out.println("Error in shortLongShort");
            return;
        } else if (!logicMethods.shortLongShort("aaa", "b").equals("baaab")) {
            System.out.println("Error in shortLongShort");
            return;
        } else if (!logicMethods.shortLongShort("b", "aaa").equals("baaab")) {
            System.out.println("Error in shortLongShort");
            return;
        } else if (!logicMethods.shortLongShort("aaa", "").equals("aaa")) {
            System.out.println("Error in shortLongShort");
            return;
        } else if (!logicMethods.shortLongShort("", "bb").equals("bb")) {
            System.out.println("Error in shortLongShort");
            return;
        } else if (!logicMethods.shortLongShort("aaa", "1234").equals("aaa1234aaa")) {
            System.out.println("Error in shortLongShort");
            return;
        } else if (!logicMethods.shortLongShort("aaa", "bb").equals("bbaaabb")) {
            System.out.println("Error in shortLongShort");
            return;
        } else if (!logicMethods.shortLongShort("a", "bb").equals("abba")) {
            System.out.println("Error in shortLongShort");
            return;
        } else if (!logicMethods.shortLongShort("bb", "a").equals("abba")) {
            System.out.println("Error in shortLongShort");
            return;
        } else if (!logicMethods.shortLongShort("xyz", "ab").equals("abxyzab")) {
            System.out.println("Error in shortLongShort");
            return;
        } else {
            System.out.println("Correct implementation of shortLongShort");
        }



        // TEST CASE: sameEnds
        if (!logicMethods.sameEnds("abc", "cat").equals("abcat")) {
            System.out.println("Error in sameEnds");
            return;
        } else if (!logicMethods.sameEnds("dog", "cat").equals("dogcat")) {
            System.out.println("Error in sameEnds");
            return;
        } else if (!logicMethods.sameEnds("abc", "").equals("abc")) {
            System.out.println("Error in sameEnds");
            return;
        } else if (!logicMethods.sameEnds("", "cat").equals("cat")) {
            System.out.println("Error in sameEnds");
            return;
        } else if (!logicMethods.sameEnds("pig", "g").equals("pig")) {
            System.out.println("Error in sameEnds");
            return;
        } else if (!logicMethods.sameEnds("pig", "doggy").equals("pigdoggy")) {
            System.out.println("Error in sameEnds");
            return;
        } else {
            System.out.println("Correct implementation of sameEnds");
        }

    }
}
