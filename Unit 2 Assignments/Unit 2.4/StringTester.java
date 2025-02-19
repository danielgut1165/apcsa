import java.util.ArrayList;

public class StringTester {
    public static void main(String[] args) {
        StringMethods stringMethods = new StringMethods();

        // TEST CASES: noStartingLetters
        if (!stringMethods.noStartingLetters("Hello", "There").equals("ellohere")) {
            System.out.println("Error in noStartingLetters");
            return;
        } else if (!stringMethods.noStartingLetters("java", "code").equals("avaode")) {
            System.out.println("Error in noStartingLetters");
            return;
        } else if (!stringMethods.noStartingLetters("shotl", "java").equals("hotlava")) {
            System.out.println("Error in noStartingLetters");
            return;
        } else if (!stringMethods.noStartingLetters("ab", "xy").equals("by")) {
            System.out.println("Error in noStartingLetters");
            return;
        } else if (!stringMethods.noStartingLetters("ab", "x").equals("b")) {
            System.out.println("Error in noStartingLetters");
            return;
        } else if (!stringMethods.noStartingLetters("x", "ac").equals("c")) {
            System.out.println("Error in noStartingLetters");
            return;
        } else if (!stringMethods.noStartingLetters("a", "x").equals("")) {
            System.out.println("Error in noStartingLetters");
            return;
        } else if (!stringMethods.noStartingLetters("kit", "kat").equals("itat")) {
            System.out.println("Error in noStartingLetters");
            return;
        } else if (!stringMethods.noStartingLetters("mart", "dart").equals("artart")) {
            System.out.println("Error in noStartingLetters");
            return;
        } else {
            System.out.println("Correct implementation of noStartingLetters");
        }
        
        // TEST CASES: chopOffEnds
        if (!stringMethods.chopOffEnds("Hello").equals("ell")) {
            System.out.println("Error in chopOffEnds");
            return;
        } else if (!stringMethods.chopOffEnds("java").equals("av")) {
            System.out.println("Error in chopOffEnds");
            return;
        } else if (!stringMethods.chopOffEnds("coding").equals("odin")) {
            System.out.println("Error in chopOffEnds");
            return;
        } else if (!stringMethods.chopOffEnds("code").equals("od")) {
            System.out.println("Error in chopOffEnds");
            return;
        } else if (!stringMethods.chopOffEnds("ab").equals("")) {
            System.out.println("Error in chopOffEnds");
            return;
        } else if (!stringMethods.chopOffEnds("Chocolate!").equals("hocolate")) {
            System.out.println("Error in chopOffEnds");
            return;
        } else if (!stringMethods.chopOffEnds("kitten").equals("itte")) {
            System.out.println("Error in chopOffEnds");
            return;
        } else if (!stringMethods.chopOffEnds("woohoo").equals("ooho")) {
            System.out.println("Error in chopOffEnds");
            return;
        } else {
            System.out.println("Correct implementation of chopOffEnds");
        }

        // TEST CASES: spliceMiddleTwo
        if (!stringMethods.spliceMiddleTwo("string").equals("ri")) {
            System.out.println("Error in spliceMiddleTwo");
            return;
        } else if (!stringMethods.spliceMiddleTwo("code").equals("od")) {
            System.out.println("Error in spliceMiddleTwo");
            return;
        } else if (!stringMethods.spliceMiddleTwo("Practice").equals("ct")) {
            System.out.println("Error in spliceMiddleTwo");
            return;
        } else if (!stringMethods.spliceMiddleTwo("ab").equals("ab")) {
            System.out.println("Error in spliceMiddleTwo");
            return;
        } else if (!stringMethods.spliceMiddleTwo("0123456789").equals("45")) {
            System.out.println("Error in spliceMiddleTwo");
            return;
        } else {
            System.out.println("Correct implementation of spliceMiddleTwo");
        }

        // TEST CASES: rotateLeftTwo
        if (!stringMethods.rotateLeftTwo("Hello").equals("lloHe")) {
            System.out.println("Error in rotateLeftTwo");
            return;
        } else if (!stringMethods.rotateLeftTwo("java").equals("vaja")) {
            System.out.println("Error in rotateLeftTwo");
            return;
        } else if (!stringMethods.rotateLeftTwo("Hi").equals("Hi")) {
            System.out.println("Error in rotateLeftTwo");
            return;
        } else if (!stringMethods.rotateLeftTwo("code").equals("deco")) {
            System.out.println("Error in rotateLeftTwo");
            return;
        } else if (!stringMethods.rotateLeftTwo("cat").equals("tca")) {
            System.out.println("Error in rotateLeftTwo");
            return;
        } else if (!stringMethods.rotateLeftTwo("12345").equals("34512")) {
            System.out.println("Error in rotateLeftTwo");
            return;
        } else if (!stringMethods.rotateLeftTwo("Chocolate").equals("ocolateCh")) {
            System.out.println("Error in rotateLeftTwo");
            return;
        } else if (!stringMethods.rotateLeftTwo("bricks").equals("icksbr")) {
            System.out.println("Error in rotateLeftTwo");
            return;
        } else {
            System.out.println("Correct implementation of rotateLeftTwo");
        }

        // TEST CASES: rotateRightTwo
        if (!stringMethods.rotateRightTwo("Hello").equals("loHel")) {
            System.out.println("Error in rotateRightTwo");
            return;
        } else if (!stringMethods.rotateRightTwo("java").equals("vaja")) {
            System.out.println("Error in rotateRightTwo");
            return;
        } else if (!stringMethods.rotateRightTwo("Hi").equals("Hi")) {
            System.out.println("Error in rotateRightTwo");
            return;
        } else if (!stringMethods.rotateRightTwo("code").equals("deco")) {
            System.out.println("Error in rotateRightTwo");
            return;
        } else if (!stringMethods.rotateRightTwo("cat").equals("atc")) {
            System.out.println("Error in rotateRightTwo");
            return;
        } else if (!stringMethods.rotateRightTwo("12345").equals("45123")) {
            System.out.println("Error in rotateRightTwo");
            return;
        } else if (!stringMethods.rotateRightTwo("Chocolate").equals("teChocola")) {
            System.out.println("Error in rotateRightTwo");
            return;
        } else if (!stringMethods.rotateRightTwo("bricks").equals("ksbric")) {
            System.out.println("Error in rotateRightTwo");
            return;
        } else {
            System.out.println("Correct implementation of rotateRightTwo");
        }

        // TEST CASES: whereIsWaldo
        if (stringMethods.whereIsWaldo("To be, or not to be: that waldo is the question.") != 26) {
            System.out.println("Error in whereIsWaldo");
            return;
        } else if (stringMethods.whereIsWaldo("waldo All the world's a stage, and all the men and women merely players.") != 0) {
            System.out.println("Error in whereIsWaldo");
            return;
        } else if (stringMethods.whereIsWaldo("Romeo, Romeo! Wherefore art thou waldo") != 33) {
            System.out.println("Error in whereIsWaldo");
            return;
        } else if (stringMethods.whereIsWaldo("Now is the winter waldo of our discontent waldo.") != 18) {
            System.out.println("Error in whereIsWaldo");
            return;
        } else if (stringMethods.whereIsWaldo("Is this a dagger which I see before me, the handle toward my hand?") != -1) {
            System.out.println("Error in whereIsWaldo");
            return;
        } else {
            System.out.println("Correct implementation of whereIsWaldo");
        }

        // TEST CASES: generateRandomNumber
        int lowerBound = 1;
        int upperBound = 10;
        int range = upperBound - lowerBound;
        while (range < 100000) {
            // System.out.println("Testing generateRandomNumber function on the range: " + lowerBound + " - " + upperBound);
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = lowerBound; i <= upperBound; i++) {
                list.add(i);
            }
            
            boolean emptyList = false;
            for (int i = 0; i < 100000000; i++) {
                Integer rand = Integer.valueOf(stringMethods.generateRandomNumber(lowerBound, upperBound));
                list.remove(rand);
                if (list.isEmpty()) {
                    emptyList = true;
                    break;
                }
            }

            if (emptyList) {
                // System.out.println("generateRandomNumber function works on the range: " + lowerBound + " - " + upperBound);
                lowerBound *= 10;
                upperBound *= 10;
                range = upperBound - lowerBound;
            } else {
                System.out.println("generateRandomNumber function breaks on the range: " + lowerBound + " - " + upperBound);
                return;
            }
        }
        System.out.println("Correct implementation of generateRandomNumber");
        System.out.println("Code looks good!");

    }
}
