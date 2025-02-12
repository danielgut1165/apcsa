public class AreaTester {
    public static void main(String[] args) {
        AreaFormulas formulas = new AreaFormulas();

        boolean found_incorrect_answer = false;
        for (int i = 0; i < 1000; i++) {
            int num1 = (int) (Math.random() * 1000) + 1;
            int num2 = (int) (Math.random() * 1000) + 1;
            int num3 = (int) (Math.random() * 1000) + 1;

            if (formulas.SquareCalculation(num1) != num1 * num1) {
                System.out.println("Square area formula is incorrect");
                found_incorrect_answer = true;
                break;
            }
            if (formulas.RectangleCalculation(num1, num2) != num1 * num2) {
                System.out.println("Rectangle area formula is incorrect");
                found_incorrect_answer = true;
                break;
            }
            if (formulas.CircleCalculation(num3) != Math.PI * num3 * num3) {
                System.out.println("Circle area formula is incorrect");
                found_incorrect_answer = true;
                break;
            }
            if (formulas.TriangleCalculation(num1, num2) != 0.5 * num1 * num2) {
                System.out.println("Triangle area formula is incorrect");
                found_incorrect_answer = true;
                break;
            }
            if (formulas.TrapezoidCalculation(num1, num2, num3) != 0.5 * (num1 + num2) * num3) {
                System.out.println("Trapezoid area formula is incorrect");
                found_incorrect_answer = true;
                break;
            }
            if (formulas.EllipseCalculation(num2, num3) != Math.PI * num2 * num3) {
                System.out.println("Ellipse area formula is incorrect");
                found_incorrect_answer = true;
                break;
            }
        }

        if (!found_incorrect_answer) {
            System.out.println("All formulas look good!");
        }
    }
}
