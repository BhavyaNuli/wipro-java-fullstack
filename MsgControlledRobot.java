import java.io.*;
import java.util.*;

public class MsgControlledRobot {
    public String moveRobot(int input1, int input2, String input3, String input4) {
        int X = input1, Y = input2;
        String currentPos = input3, msg = input4;

        int currX = Integer.parseInt(currentPos.split("-")[0]);
        int currY = Integer.parseInt(currentPos.split("-")[1]);
        String currD = currentPos.split("-")[2];
        String[] instructions = msg.split(" ");
        StringBuilder output = new StringBuilder();

        for (String instruction : instructions) {
            if (instruction.equals("M")) {
                switch (currD) {
                    case "E":
                        if (currX + 1 > X) return output.append("-ER").toString();
                        currX++;
                        break;
                    case "W":
                        if (currX - 1 < 0) return output.append("-ER").toString();
                        currX--;
                        break;
                    case "N":
                        if (currY + 1 > Y) return output.append("-ER").toString();
                        currY++;
                        break;
                    case "S":
                        if (currY - 1 < 0) return output.append("-ER").toString();
                        currY--;
                        break;
                }
            } else {
                switch (currD) {
                    case "E":
                        currD = instruction.equals("L") ? "N" : "S";
                        break;
                    case "W":
                        currD = instruction.equals("L") ? "S" : "N";
                        break;
                    case "N":
                        currD = instruction.equals("L") ? "W" : "E";
                        break;
                    case "S":
                        currD = instruction.equals("L") ? "E" : "W";
                        break;
                }
            }

            output.delete(0, output.length());
            output.append(currX).append("-").append(currY).append("-").append(currD);
        }
        return output.toString();
    }
}
