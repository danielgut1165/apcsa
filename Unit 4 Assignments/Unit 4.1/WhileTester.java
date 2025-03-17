public class WhileTester {
    public static void main(String[] args) {
        While loopMethods = new While();

        // TEST CASES: nCopies
        if (!loopMethods.nCopies("Hi", 2).equals("HiHi")) {
            System.out.println("Error in nCopies");
            return;
        } else if (!loopMethods.nCopies("Hi", 3).equals("HiHiHi")) {
            System.out.println("Error in nCopies");
            return;
        } else if (!loopMethods.nCopies("Hi", 1).equals("Hi")) {
            System.out.println("Error in nCopies");
            return;
        } else if (!loopMethods.nCopies("Hi", 0).equals("")) {
            System.out.println("Error in nCopies");
            return;
        } else if (!loopMethods.nCopies("Hi", 5).equals("HiHiHiHiHi")) {
            System.out.println("Error in nCopies");
            return;
        } else if (!loopMethods.nCopies("Oh Boy!", 2).equals("Oh Boy!Oh Boy!")) {
            System.out.println("Error in nCopies");
            return;
        } else if (!loopMethods.nCopies("x", 4).equals("xxxx")) {
            System.out.println("Error in nCopies");
            return;
        } else if (!loopMethods.nCopies("", 4).equals("")) {
            System.out.println("Error in nCopies");
            return;
        } else if (!loopMethods.nCopies("code", 2).equals("codecode")) {
            System.out.println("Error in nCopies");
            return;
        } else if (!loopMethods.nCopies("code", 3).equals("codecodecode")) {
            System.out.println("Error in nCopies");
            return;
        } else {
            System.out.println("Correct implementation of nCopies");
        }


        // TEST CASES: nCopiesTwist
        if (!loopMethods.nCopiesTwist("Chocolate", 2).equals("ChoCho")) {
            System.out.println("Error in nCopiesTwist");
            return;
        } else if (!loopMethods.nCopiesTwist("Chocolate", 3).equals("ChoChoCho")) {
            System.out.println("Error in nCopiesTwist");
            return;
        } else if (!loopMethods.nCopiesTwist("Abc", 3).equals("AbcAbcAbc")) {
            System.out.println("Error in nCopiesTwist");
            return;
        } else if (!loopMethods.nCopiesTwist("Ab", 4).equals("AbAbAbAb")) {
            System.out.println("Error in nCopiesTwist");
            return;
        } else if (!loopMethods.nCopiesTwist("A", 4).equals("AAAA")) {
            System.out.println("Error in nCopiesTwist");
            return;
        } else if (!loopMethods.nCopiesTwist("", 4).equals("")) {
            System.out.println("Error in nCopiesTwist");
            return;
        } else if (!loopMethods.nCopiesTwist("Abc", 0).equals("")) {
            System.out.println("Error in nCopiesTwist");
            return;
        } else {
            System.out.println("Correct implementation of nCopiesTwist");
        }



        // TEST CASES: countZ
        if (loopMethods.countZ("abczz") != 2) {
            System.out.println("Error in countZ");
            return;
        } else if (loopMethods.countZ("zzz") != 3) {
            System.out.println("Error in countZ");
            return;
        } else if (loopMethods.countZ("zzzz") !=  4) {
            System.out.println("Error in countZ");
            return;
        } else if (loopMethods.countZ("abc") != 0) {
            System.out.println("Error in countZ");
            return;
        } else if (loopMethods.countZ("Hello there") != 0) {
            System.out.println("Error in countZ");
            return;
        } else if (loopMethods.countZ("Hezzo thzze") != 4) {
            System.out.println("Error in countZ");
            return;
        } else if (loopMethods.countZ("") != 0) {
            System.out.println("Error in countZ");
            return;
        } else if (loopMethods.countZ("Kittens") != 0) {
            System.out.println("Error in countZ");
            return;
        } else if (loopMethods.countZ("Kittenszzz") != 3) {
            System.out.println("Error in countZ");
            return;
        } else {
            System.out.println("Correct implementation of countZ");
        }


        // TEST CASE: countZZ
        if (loopMethods.countZZ("abczz") != 1) {
            System.out.println("Error in countZZ");
            return;
        } else if (loopMethods.countZZ("zzz") != 2) {
            System.out.println("Error in countZZ");
            return;
        } else if (loopMethods.countZZ("zzzz") !=  3) {
            System.out.println("Error in countZZ");
            return;
        } else if (loopMethods.countZZ("abc") != 0) {
            System.out.println("Error in countZZ");
            return;
        } else if (loopMethods.countZZ("Hello there") != 0) {
            System.out.println("Error in countZZ");
            return;
        } else if (loopMethods.countZZ("Hezzo thzze") != 2) {
            System.out.println("Error in countZZ");
            return;
        } else if (loopMethods.countZZ("") != 0) {
            System.out.println("Error in countZZ");
            return;
        } else if (loopMethods.countZZ("Kittens") != 0) {
            System.out.println("Error in countZZ");
            return;
        } else if (loopMethods.countZZ("Kittenszzz") != 2) {
            System.out.println("Error in countZZ");
            return;
        } else {
            System.out.println("Correct implementation of countZZ");
        }



        // TEST CASE: evenCharacters
        if (!loopMethods.evenCharacters("Hello").equals("Hlo")) {
            System.out.println("Error in evenCharacters");
            return;
        } else if (!loopMethods.evenCharacters("Hi").equals("H")) {
            System.out.println("Error in evenCharacters");
            return;
        } else if (!loopMethods.evenCharacters("Heeololeo").equals("Hello")) {
            System.out.println("Error in evenCharacters");
            return;
        } else if (!loopMethods.evenCharacters("").equals("")) {
            System.out.println("Error in evenCharacters");
            return;
        } else if (!loopMethods.evenCharacters("Greetings").equals("Getns")) {
            System.out.println("Error in evenCharacters");
            return;
        } else if (!loopMethods.evenCharacters("Chocoate").equals("Coot")) {
            System.out.println("Error in evenCharacters");
            return;
        } else if (!loopMethods.evenCharacters("pi").equals("p")) {
            System.out.println("Error in evenCharacters");
            return;
        } else if (!loopMethods.evenCharacters("Hello Kitten").equals("HloKte")) {
            System.out.println("Error in evenCharacters");
            return;
        } else if (!loopMethods.evenCharacters("hxaxpxpxy").equals("happy")) {
            System.out.println("Error in evenCharacters");
            return;
        } else {
            System.out.println("Correct implementation of evenCharacters");
        }



        // TEST CASE: stringRemoveX
        if (!loopMethods.stringRemoveX("xxHxlx").equals("xHlx")) {
            System.out.println("Error in stringRemoveX");
            return;
        } else if (!loopMethods.stringRemoveX("abxxxcd").equals("abcd")) {
            System.out.println("Error in stringRemoveX");
            return;
        } else if (!loopMethods.stringRemoveX("xabxxxcdx").equals("xabcdx")) {
            System.out.println("Error in stringRemoveX");
            return;
        } else if (!loopMethods.stringRemoveX("xKittenx").equals("xKittenx")) {
            System.out.println("Error in stringRemoveX");
            return;
        } else if (!loopMethods.stringRemoveX("Hello").equals("Hello")) {
            System.out.println("Error in stringRemoveX");
            return;
        } else if (!loopMethods.stringRemoveX("xx").equals("xx")) {
            System.out.println("Error in stringRemoveX");
            return;
        } else if (!loopMethods.stringRemoveX("x").equals("x")) {
            System.out.println("Error in stringRemoveX");
            return;
        } else if (!loopMethods.stringRemoveX("").equals("")) {
            System.out.println("Error in stringRemoveX");
            return;
        } else {
            System.out.println("Correct implementation of stringRemoveX");
        }

        System.out.println("Code looks good!");

    }
}

