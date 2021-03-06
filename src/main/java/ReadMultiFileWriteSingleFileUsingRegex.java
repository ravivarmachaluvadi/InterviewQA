import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

// Java program to merge all files of a directory
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ReadMultiFileWriteSingleFileUsingRegex {

    public static void main(String[] args) throws IOException
    {
        Pattern pattern = Pattern.compile("\\d{17}");

        // create instance of directory
        File dir = new File("/Users/ravivarmachaluvadi/Documents/Read");

        // create obejct of PrintWriter for output file
        PrintWriter pw = new PrintWriter("/Users/ravivarmachaluvadi/Documents/output.txt");

        // Get list of all the files in form of String Array
        String[] fileNames = dir.list();

        // loop for reading the contents of all the files
        // in the directory GeeksForGeeks
        for (String fileName : fileNames) {
            System.out.println("Reading from " + fileName);

            // create instance of file from Name of
            // the file stored in string Array
            File f = new File(dir, fileName);

            // create object of BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(f));
            //pw.println("Contents of file " + fileName);

            // Read from current file
            String line = br.readLine();
            while (line != null) {
                Matcher matcher = pattern.matcher(line);
                // write to the output file
                if(matcher.find()) {
                    //pw.println(line);
                    pw.println(matcher.group());
                }
                line = br.readLine();
            }
            pw.flush();
        }
        System.out.println("Reading from all files" +
                " in directory " + dir.getName() + " Completed");
    }
}

