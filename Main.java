import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors


public class Main
{
    Path CSV_File_Name = path/to/file;
    List<String[]> dataLines = new ArrayList<>();

    
    public static void main(String[] args)
    {
        dataLines.add(new String[] 
          { "John", "Doe", "38", "Comment Data\nAnother line of comment data" });
        dataLines.add(new String[] 
          { "Jane", "Doe, Jr.", "19", "She said \"I'm being quoted\"" });

        }
    public void givenDataArray_whenConvertToCSV_thenOutputCreated() throws IOException {
            File csvOutputFile = new File(CSV_FILE_NAME);
            try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
                dataLines.stream()
                  .map(this::convertToCSV)
                  .forEach(pw::println);
            }
            assertTrue(csvOutputFile.exists());
        }
    }
}
