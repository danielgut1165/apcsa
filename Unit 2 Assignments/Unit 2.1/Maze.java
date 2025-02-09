import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Maze {
    private int myWidth;
    private int myHeight;
    private int myDirection; // 0 - North, 1 - East, 2 - South, 3 - West
    private int myX;
    private int myY;

    public Maze(int width, int height, int x_pos, int y_pos) {
        myWidth = width;
        myHeight = height;
        myDirection = 0;
        myX = x_pos;
        myY = y_pos;
    }

    public void turnRight() {
        myDirection = (myDirection + 1) % 4;
    }
 
    public void turnLeft() {
        myDirection = (myDirection - 1 + 4) % 4;
    }

    public void moveForward() {
        String[] lines = null;
        try {
            lines = Files.readAllLines(Paths.get("Maze.txt")).toArray(new String[0]);    
        } catch (IOException e) {
            System.out.println("Path to Maze.txt is incorrect");
        }
        lines[myY] = lines[myY].replace('@', ' ');

        if (myDirection == 0 && checkValidLocation(myX, myY - 1)) {
            myY--;
        } else if (myDirection == 1 && checkValidLocation(myX + 1, myY)) {
            myX++;
        } else if (myDirection == 2 && checkValidLocation(myX, myY + 1)) {
            myY++;
        } else if (myDirection == 3 && checkValidLocation(myX - 1, myY)) {
            myX--;
        } else {
            System.out.println("Invalid Direction/Position");
            return;
        }
        lines[myY] = lines[myY].substring(0, myX) + "@" + lines[myY].substring(myX + 1);

        try {
            Files.write(Paths.get("Maze.txt"), Arrays.asList(lines), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Error writing to Maze.txt: " + e.getMessage());
        }
    }

    public void print() {
        String[] lines = null;
        try {
            lines = Files.readAllLines(Paths.get("Maze.txt")).toArray(new String[0]);    
        } catch (IOException e) {
            System.out.println("Path to Maze.txt is incorrect");
            // e.printStackTrace();
        }
        for (String line : lines) {
            System.out.println(line);
        }
    }

    private static boolean checkValidLocation(int x_pos, int y_pos) {
        String[] lines = null;
        try {
            lines = Files.readAllLines(Paths.get("Maze.txt")).toArray(new String[0]);    
        } catch (IOException e) {
            System.out.println("Path to Maze.txt is incorrect");
            // e.printStackTrace();
        }
        return lines[y_pos].charAt(x_pos) != 'X';
    }

    private int getDirection() {
        return myDirection;
    }
}
