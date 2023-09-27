package
import java.io.*;
import java.io.FileReader;
import java.util.LinkedList;

public class FileHandler {
    public LinkedList<Member> readFile(){
        LinkedList<Member> m = new LinkedList<>();
        String lineRead;
        String[] splitLine;
        Member mem;
        try (BufferedReader reader = new
                BufferedReader(new FileReader("members.csv"))) {
            lineRead = reader.readLine();
            while (lineRead != null) {
                splitLine = lineRead.split(", ");

                if (splitLine[0].equals("S")) {
                    mem = new SingleClubMember('S',
                            Integer.parseInt(splitLine[1]), splitLine[2],
                            Double.parseDouble(splitLine[3]),
                            Integer.parseInt(splitLine[4]));
                } else
            }
        }