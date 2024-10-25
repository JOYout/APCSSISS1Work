import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors


public class Create_EditFiles
{
public String convertToCSV(String[] data) {
    return Stream.of(data)
      .map(this::escapeSpecialCharacters)
      .collect(Collectors.joining(","));
}

}
