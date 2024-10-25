import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors


public class Create_EditFiles
{
    public String convertToCSV(String[] data) {
        return Stream.of(data)
          .map(this::escapeSpecialCharacters)
          .collect(Collectors.joining(","));
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
