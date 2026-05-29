package gr.aueb.cf.cf9.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.UUID;

/**
 * Copies a binary file given by the user from a predefined folder
 * to a new file with a unique name, then prints its metadata.
 */
public class BinaryFileCopy {
    public static void main(String[] args) {
        String basePath = "C:/tmp/";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Δώσε το όνομα του αρχείου (στον φάκελο " + basePath + "): ");
            String userInputFile = scanner.nextLine().trim();

            Path source = Paths.get(basePath, userInputFile);

            if (!Files.exists(source)) {
                System.err.println("Το αρχείο δεν υπάρχει: " + source.toAbsolutePath());
                return;
            }

            String uniqueName = UUID.randomUUID().toString().replace(":", "_") + userInputFile;
            Path target = Paths.get(basePath, uniqueName);

            Files.copy(source, target);

            System.out.println("Αρχικό αρχείο: " + source.toAbsolutePath());
            System.out.println("Αποθηκευμένο αρχείο: " + target.toAbsolutePath());
            System.out.println("Επέκταση: " + getExtension(userInputFile));

        } catch (IOException e) {
            System.err.println("Σφάλμα κατά την αντιγραφή: " + e.getMessage());
        }
    }

    /**
     * Returns the file extension of the given filename, or an empty string if there is none.
     *
     * @param filename the name of the file
     * @return the extension without the dot, or "" if not found
     */
    public static String getExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == filename.length() - 1) {
            return "";
        }
        return filename.substring(dotIndex + 1);
    }
}