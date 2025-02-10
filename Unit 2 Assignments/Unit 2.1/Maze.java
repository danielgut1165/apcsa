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
    private String[] lines;

    public Maze(int width, int height, int x_pos, int y_pos) {
        myWidth = width;
        myHeight = height;
        myDirection = 0;
        myX = x_pos;
        myY = y_pos;

        // Getting the starting position of the maze
        try {
            lines = Files.readAllLines(Paths.get("Maze.txt")).toArray(new String[0]);    
        } catch (IOException e) {
            System.out.println("Path to Maze.txt is incorrect");
        }
    }

    public void turnRight() {
        myDirection = (myDirection + 1) % 4;
    }
 
    public void turnLeft() {
        myDirection = (myDirection - 1 + 4) % 4;
    }

    public void moveForward() {
        lines[myY] = lines[myY].replace('@', ' ');

        if (myDirection == 0 && checkValidLocation(myX, myY - 1)) {
            myY--;
        } else if (myDirection == 1 && checkValidLocation(myX + 1, myY)) {
            myX++;
        } else if (myDirection == 2 && checkValidLocation(myX, myY + 1)) {
            myY++;
        } else if (myDirection == 3 && checkValidLocation(myX - 1, myY)) {
            myX--;
        }
        lines[myY] = lines[myY].substring(0, myX) + "@" + lines[myY].substring(myX + 1);
    }

    public void print() {
        if (lines == null) {
            System.out.println("Maze has not been initialized");
        }
        for (String line : lines) {
            System.out.println(line);
        }
    }

    private boolean checkValidLocation(int x_pos, int y_pos) {
        if (x_pos < 0 || x_pos >= myWidth) {
            System.out.println("Out of Bounds!");
            return false;
        }
        else if (y_pos < 0 || y_pos >= myHeight) {
            System.out.println("Out of Bounds!");
            return false;
        }
        else if (lines[y_pos].charAt(x_pos) == 'X') {
            System.out.println("Hit a wall!");
            return false;
        }
        else if (lines[y_pos].charAt(x_pos) == 'E') {
            System.out.println("Finished the Maze!");
            return true;
        }
        return true;
    }

    private int getDirection() {
        return myDirection;
    }
}
