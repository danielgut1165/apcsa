import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FixTester {
    public static String[] parseLines(String path) {
        String[] lines = null;
        try {
            lines = Files.readAllLines(Paths.get(path)).toArray(new String[0]);    
        } catch (IOException e) {
            System.out.println("Path to code.txt is incorrect");
            // e.printStackTrace();
        }
        return lines;
    }

    public static int checkLength(String input) {
        int length = 0;
        for (int i = 0; i < input.length(); i++) {
            if (!input.substring(i, i+1).equals(" ")) {
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {

        // Checking for the -ea flag and the end of the command
        if (args.length != 1 || !args[0].equals("-ea")) {
            System.out.println("Add the -ea flag to the end of the command");
            return;
        }

        // Parsing out the code and printlns
        String[] lines = parseLines("code.txt");
        String[] answers = parseLines("output.txt");
        if (lines.length == 0) {
            System.out.println("Run: cat FixPractice.java > code.txt");
        }
        if (answers.length == 0) {
            System.out.println("Run: java FixPractice.java > output.txt");
        }

        // Checking for no more additonal lines of code
        assert lines.length == 43 : "Don't add/remove and lines. You should have 40 lines total";

        // Section 1
        assert lines[3].trim().equals("int var = 5;") : "Line 4: Should be int var = 5;";
        assert checkLength(lines[4]) == 26 : "Line 5: Use either Prefix or Postfix";
        assert checkLength(lines[5]) == 26 : "Line 6: Use either Prefix or Postfix";
        assert checkLength(lines[6]) == 26 : "Line 7: Use either Prefix or Postfix";
        assert checkLength(lines[7]) == 26 : "Line 8: Use either Prefix or Postfix";
        assert lines[8].trim().equals("System.out.println(var);") : "Line 9: Should be System.out.println(var)";
        assert lines[9].contains("+") : "Line 10 must use +=";
        assert lines[10].trim().equals("System.out.println(var);") : "Line 11: Should be System.out.println(var)";
        assert lines[11].contains("*") : "Line 12 must use *=";
        assert lines[12].trim().equals("System.out.println(var);") : "Line 13: Should be System.out.println(var)";
        assert lines[13].contains("%") : "Line 14 must use %=";
        assert lines[14].trim().equals("System.out.println(var);") : "Line 15: Should be System.out.println(var)";
        assert lines[15].contains("-") : "Line 16 must use -=";
        assert lines[16].trim().equals("System.out.println(var);") : "Line 17: Should be System.out.println(var)";
        assert lines[17].contains("/") : "Line 18 must use /=";
        assert lines[18].trim().equals("System.out.println(var);") : "Line 19: Should be System.out.println(var)";
        assert answers[0].equals("5") : "Answer from Section 1 is incorrect";
        assert answers[1].equals("7") : "Answer from Section 1 is incorrect";
        assert answers[2].equals("8") : "Answer from Section 1 is incorrect";
        assert answers[3].equals("8") : "Answer from Section 1 is incorrect";
        assert answers[4].equals("9") : "Answer from Section 1 is incorrect";
        assert answers[5].equals("16") : "Answer from Section 1 is incorrect";
        assert answers[6].equals("48") : "Answer from Section 1 is incorrect";
        assert answers[7].equals("14") : "Answer from Section 1 is incorrect";
        assert answers[8].equals("-21") : "Answer from Section 1 is incorrect";
        assert answers[9].equals("-7") : "Answer from Section 1 is incorrect";

        // Section 2
        assert checkLength(lines[20]) <= 15 : "Line 21: Answer should be between 1-99";
        assert checkLength(lines[21]) <= 18 : "Line 22: Answer should be between 1-99";
        assert checkLength(lines[22]) <= 17 : "Line 23: Answer should be between 1-99";
        assert checkLength(lines[23]) <= 21 : "Line 24: Answer should be between 1-99";
        assert checkLength(lines[24]) <= 17 : "Line 25: Answer should be between 1-99";
        assert checkLength(lines[25]) <= 20 : "Line 26: Answer should be between 1-99";
        assert checkLength(lines[26]) <= 15 : "Line 27: Answer should be between 1-99";
        assert checkLength(lines[27]) <= 18 : "Line 28: Answer should be between 1-99";
        assert lines[28].trim().equals("System.out.println(\"The amount of bytes in an int is: \" + intBytes);") : "Line 29: System.out.println(\"The amount of bytes in an int is: \" + intBytes);";
        assert lines[29].trim().equals("System.out.println(\"The amount of bytes in an double is: \" + doubleBytes);"): "Line 30: System.out.println(\"The amount of bytes in an double is: \" + doubleBytes);";
        assert lines[30].trim().equals("System.out.println(\"The amount of nibbles in an int is: \" + intNibbles);"): "Line 31: System.out.println(\"The amount of nibbles in an int is: \" + intNibbles);";
        assert lines[31].trim().equals("System.out.println(\"The amount of nibbles in an double is: \" + doubleNibbles);"): "Line 32: System.out.println(\"The amount of nibbles in an double is: \" + doubleNibbles);";
        assert lines[32].trim().equals("System.out.println(\"The amount of crumbs in an int is: \" + intCrumbs);"): "Line 33: System.out.println(\"The amount of crumbs in an int is: \" + intCrumbs);";
        assert lines[33].trim().equals("System.out.println(\"The amount of crumbs in an double is: \" + doubleCrumbs);"): "Line 34: System.out.println(\"The amount of crumbs in an double is: \" + doubleCrumbs);";
        assert lines[34].trim().equals("System.out.println(\"The amount of bits in an int is: \" + intBits);"): "Line 35: System.out.println(\"The amount of bits in an int is: \" + intBits);";
        assert lines[35].trim().equals("System.out.println(\"The amount of bits in an double is: \" + doubleBits);"): "Line 36: System.out.println(\"The amount of bits in an double is: \" + doubleBits);";
        assert Integer.parseInt(answers[10].substring(answers[10].length() - 1)) == Integer.SIZE / 8 : "Answer from Section 2 is incorrect";
        assert Integer.parseInt(answers[11].substring(answers[11].length() - 1)) == Double.SIZE / 8 : "Answer from Section 2 is incorrect";
        assert Integer.parseInt(answers[12].substring(answers[12].length() - 1)) == Integer.SIZE / 4 : "Answer from Section 2 is incorrect";
        assert Integer.parseInt(answers[13].substring(answers[13].length() - 2)) == Double.SIZE / 4 : "Answer from Section 2 is incorrect";
        assert Integer.parseInt(answers[14].substring(answers[14].length() - 2)) == Integer.SIZE / 2 : "Answer from Section 2 is incorrect";
        assert Integer.parseInt(answers[15].substring(answers[15].length() - 2)) == Double.SIZE / 2 : "Answer from Section 2 is incorrect";
        assert Integer.parseInt(answers[16].substring(answers[16].length() - 2)) == Integer.SIZE : "Answer from Section 2 is incorrect";
        assert Integer.parseInt(answers[17].substring(answers[17].length() - 2)) == Double.SIZE : "Answer from Section 2 is incorrect";

        // Section 3
        assert lines[37].trim().equals("int minimum_value = Integer.MIN_VALUE;") : "Line 38: int minimum_value = Integer.MIN_VALUE;";
        assert lines[38].trim().equals("int maximum_value = Integer.MAX_VALUE;") : "Line 39: int maximum_value = Integer.MAX_VALUE;";
        assert checkLength(lines[39].trim()) == 36 : "Line 40: Use either Prefix or Postfix";
        assert checkLength(lines[40].trim()) == 36 : "Line 41: Use either Prefix or Postfix";
        assert Integer.parseInt(answers[18]) == Integer.MAX_VALUE : "Answer from Section 3 is incorrect";
        assert Integer.parseInt(answers[19]) == Integer.MIN_VALUE : "Answer from Section 3 is incorrect";

        System.out.println("Code looks good!");
    }
}
