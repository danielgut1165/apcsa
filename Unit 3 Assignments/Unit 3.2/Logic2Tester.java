public class Logic2Tester {
    public static void main(String[] args) {
        Logic2 logicMethods = new Logic2();

        // TEST CASES: speedingTicket
        if (logicMethods.speedingTicket(60, false) != 0) {
            System.out.println("Error in speedingTicket");
            return;
        } else if (logicMethods.speedingTicket(65, false) != 1) {
            System.out.println("Error in speedingTicket");
            return;
        } else if (logicMethods.speedingTicket(65, true) != 0) {
            System.out.println("Error in speedingTicket");
            return;
        } else if (logicMethods.speedingTicket(80, false) != 1) {
            System.out.println("Error in speedingTicket");
            return;
        } else if (logicMethods.speedingTicket(85, false) != 2) {
            System.out.println("Error in speedingTicket");
            return;
        } else if (logicMethods.speedingTicket(85, true) != 1) {
            System.out.println("Error in speedingTicket");
            return;
        } else if (logicMethods.speedingTicket(70, false) != 1) {
            System.out.println("Error in speedingTicket");
            return;
        } else if (logicMethods.speedingTicket(75, false) != 1) {
            System.out.println("Error in speedingTicket");
            return;
        } else if (logicMethods.speedingTicket(75, true) != 1) {
            System.out.println("Error in speedingTicket");
            return;
        } else if (logicMethods.speedingTicket(40, false) != 0) {
            System.out.println("Error in speedingTicket");
            return;
        } else if (logicMethods.speedingTicket(40, true) != 0) {
            System.out.println("Error in speedingTicket");
            return;
        } else if (logicMethods.speedingTicket(90, false) != 2) {
            System.out.println("Error in speedingTicket");
            return;
        } else {
            System.out.println("Correct implementation of speedingTicket");
        }


        // TEST CASES: partyTime
        if (logicMethods.partyTime(6, 8) != 1) {
            System.out.println("Error in partyTime");
            return;
        } else if (logicMethods.partyTime(3, 8) != 0) {
            System.out.println("Error in partyTime");
            return;
        } else if (logicMethods.partyTime(20, 6) != 2) {
            System.out.println("Error in partyTime");
            return;
        } else if (logicMethods.partyTime(12, 6) != 2) {
            System.out.println("Error in partyTime");
            return;
        } else if (logicMethods.partyTime(11, 6) != 1) {
            System.out.println("Error in partyTime");
            return;
        } else if (logicMethods.partyTime(11, 4) != 0) {
            System.out.println("Error in partyTime");
            return;
        } else if (logicMethods.partyTime(4, 5) != 0) {
            System.out.println("Error in partyTime");
            return;
        } else if (logicMethods.partyTime(5, 5) != 1) {
            System.out.println("Error in partyTime");
            return;
        } else if (logicMethods.partyTime(6, 6) != 1) {
            System.out.println("Error in partyTime");
            return;
        } else if (logicMethods.partyTime(5, 10) != 2) {
            System.out.println("Error in partyTime");
            return;
        } else if (logicMethods.partyTime(5, 9) != 1) {
            System.out.println("Error in partyTime");
            return;
        } else if (logicMethods.partyTime(10, 4) != 0) {
            System.out.println("Error in partyTime");
            return;
        } else if (logicMethods.partyTime(10, 20) != 2) {
            System.out.println("Error in partyTime");
            return;
        } else {
            System.out.println("Correct implementation of partyTime");
        }



        // TEST CASES: adding2For3
        if (logicMethods.adding2For3(1, 2, 3) != true) {
            System.out.println("Error in adding2For3");
            return;
        } else if (logicMethods.adding2For3(3, 1, 2) != true) {
            System.out.println("Error in adding2For3");
            return;
        } else if (logicMethods.adding2For3(3, 2, 2) !=  false) {
            System.out.println("Error in adding2For3");
            return;
        } else if (logicMethods.adding2For3(2, 3, 1) != true) {
            System.out.println("Error in adding2For3");
            return;
        } else if (logicMethods.adding2For3(5, 3, -2) != true) {
            System.out.println("Error in adding2For3");
            return;
        } else if (logicMethods.adding2For3(5, 3, -3) != false) {
            System.out.println("Error in adding2For3");
            return;
        } else if (logicMethods.adding2For3(2, 5, 3) != true) {
            System.out.println("Error in adding2For3");
            return;
        } else if (logicMethods.adding2For3(9, 5, 5) != false) {
            System.out.println("Error in adding2For3");
            return;
        } else if (logicMethods.adding2For3(9, 4, 5) != true) {
            System.out.println("Error in adding2For3");
            return;
        } else if (logicMethods.adding2For3(5, 4, 9) != true) {
            System.out.println("Error in adding2For3");
            return;
        } else if (logicMethods.adding2For3(3, 3, 0) != true) {
            System.out.println("Error in adding2For3");
            return;
        } else if (logicMethods.adding2For3(3, 3, 2) != false) {
            System.out.println("Error in adding2For3");
            return;
        } else {
            System.out.println("Correct implementation of adding2For3");
        }


        // TEST CASE: sharingIsCaring
        if (logicMethods.sharingIsCaring(12, 23) != true) {
            System.out.println("Error in sharingIsCaring");
            return;
        } else if (logicMethods.sharingIsCaring(12, 43) != false) {
            System.out.println("Error in sharingIsCaring");
            return;
        } else if (logicMethods.sharingIsCaring(12, 44) != false) {
            System.out.println("Error in sharingIsCaring");
            return;
        } else if (logicMethods.sharingIsCaring(23, 12) != true) {
            System.out.println("Error in sharingIsCaring");
            return;
        } else if (logicMethods.sharingIsCaring(23, 39) != true) {
            System.out.println("Error in sharingIsCaring");
            return;
        } else if (logicMethods.sharingIsCaring(23, 19) != false) {
            System.out.println("Error in sharingIsCaring");
            return;
        } else if (logicMethods.sharingIsCaring(30, 90) != true) {
            System.out.println("Error in sharingIsCaring");
            return;
        } else if (logicMethods.sharingIsCaring(30, 91) != false) {
            System.out.println("Error in sharingIsCaring");
            return;
        } else if (logicMethods.sharingIsCaring(55, 55) != true) {
            System.out.println("Error in sharingIsCaring");
            return;
        } else if (logicMethods.sharingIsCaring(55, 44) != false) {
            System.out.println("Error in sharingIsCaring");
            return;
        } else {
            System.out.println("Correct implementation of sharingIsCaring");
        }



        // TEST CASE: abFronts
        if (!logicMethods.abFronts("Hello").equals("llo")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("java").equals("va")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("away").equals("aay")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("axy").equals("ay")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("abc").equals("abc")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("xby").equals("by")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("ab").equals("ab")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("ax").equals("a")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("axb").equals("ab")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("aaa").equals("aa")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("xbc").equals("bc")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("bbb").equals("bb")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("bazz").equals("zz")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("ba").equals("")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("abxyz").equals("abxyz")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("hi").equals("")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("his").equals("s")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("xz").equals("")) {
            System.out.println("Error in abFronts");
            return;
        } else if (!logicMethods.abFronts("zzz").equals("z")) {
            System.out.println("Error in abFronts");
            return;
        } else {
            System.out.println("Correct implementation of abFronts");
        }



        // TEST CASE: makingDuplicates
        if (!logicMethods.makingDuplicates("Hello").equals("HeHeHe")) {
            System.out.println("Error in makingDuplicates");
            return;
        } else if (!logicMethods.makingDuplicates("ab").equals("ababab")) {
            System.out.println("Error in makingDuplicates");
            return;
        } else if (!logicMethods.makingDuplicates("H").equals("HHH")) {
            System.out.println("Error in makingDuplicates");
            return;
        } else if (!logicMethods.makingDuplicates("").equals("")) {
            System.out.println("Error in makingDuplicates");
            return;
        } else if (!logicMethods.makingDuplicates("Candy").equals("CaCaCa")) {
            System.out.println("Error in makingDuplicates");
            return;
        } else if (!logicMethods.makingDuplicates("Code").equals("CoCoCo")) {
            System.out.println("Error in makingDuplicates");
            return;
        } else {
            System.out.println("Correct implementation of makingDuplicates");
        }

        System.out.println("Code looks good!");

    }
}

