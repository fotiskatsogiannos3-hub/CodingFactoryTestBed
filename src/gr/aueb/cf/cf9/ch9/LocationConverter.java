import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Reads location data from a CSV file and prints each entry
 * as a JavaScript-style object with location, latitude, and longitude.
 */
public class LocationConverter {
    /**
     * Reads locations.txt and writes the converted output to locations_out.txt.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        String inFilePath = "locations.txt";
        String outFilePath = "locations_out.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            String line;
            reader.readLine();   // καταναλώνει την επικεφαλίδα

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                ps.printf("{ location: '%s', latitude: %s, longitude: %s },\n", tokens[0], tokens[1], tokens[2]);
                System.out.printf("{ location: '%s', latitude: %s, longitude: %s },\n", tokens[0], tokens[1], tokens[2]);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}