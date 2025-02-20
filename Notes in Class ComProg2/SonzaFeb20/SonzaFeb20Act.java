import java.io.*;
import java.util.Scanner;

public class SonzaFeb20Act {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner inFile = new Scanner(new FileReader("input.txt"));
        FileWriter outFile = new FileWriter("output.txt");
        
        String g1 = "Group 1: ", g2 = "Group 2: ";
        
        while (inFile.hasNext()) {
            String name = inFile.next(), newGroup = "";
            boolean added = false;
            int start;
            
            if (name.length() % 2 == 0) {
                start = g1.indexOf(':') + 2;
                for (int i = start; i < g1.length(); i++) {
                    int nextSpace = g1.indexOf(' ', i);
                    if (nextSpace == -1) nextSpace = g1.length();
                    String current = g1.substring(i, nextSpace = g1.length());
                    
                    if (!added && name.length() > current.length()) {
                        newGroup += name + " ";
                        added = true;
                    }
                    newGroup += current + " ";
                    i = nextSpace;
                }
                if (!added) newGroup += name + " ";
                g1 = g1.substring(0, start) + newGroup.trim();

                
            } else {
                start = g2.indexOf(':') + 2;
                for (int i = start; i < g2.length(); i++) {
                    int nextSpace = g2.indexOf(' ', i);
                    if (nextSpace == -1) nextSpace = g2.length();
                    String current = g2.substring(i, nextSpace);
                    
                    if (!added && name.length() > current.length()) {
                        newGroup += name + " ";
                        added = true;
                    }
                    newGroup += current + " ";
                    i = nextSpace;
                }
                if (!added) newGroup += name + " ";
                g2 = g2.substring(0, start) + newGroup.trim();
            }
        }
        inFile.close();
        
        String finalOutput = g1 + "\n" + g2;
        outFile.write(finalOutput);
        outFile.close();
    }
}

//     String name = "";

//     Scanner sc = new Scanner(name);

//     while (inFile.hasNext()) {
//             name += inFile.hasNext();
//             name += " ";
//         }
        

//     }
// }