package SwapColumn;

import java.io.*;
import java.util.Base64;

public class Test {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\examples\\input.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line = null;
        int count = 0;
        while ((line = br.readLine()) != null) { // read through file line by line
            if (count == 0) {
                // count == 0 means the first line
            } else {
                String str[] = line.split(",");
                String time = str[3];
                FileWriter normal = new FileWriter("D:\\examples\\output.txt", true);
                normal.write(time + "\t" + line.replaceAll(",", "/") + "@\n");

                FileWriter encoded = new FileWriter("D:\\examples\\encoded.txt", true);
                Base64.Encoder encoder = Base64.getEncoder();
                String originalString = line.replaceAll(",", "/") + "@\n";
                String encodedString = encoder.encodeToString(originalString.getBytes());
                encoded.write(time + "\t" + encodedString);

                normal.close();
                encoded.close();
            }
            count++; // count increments as you read lines
        }
        br.close();
    }
}
