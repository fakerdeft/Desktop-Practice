import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadFile {
    private static final ReadFile readfile = new ReadFile();

    private ReadFile() {
    }

    public static ReadFile getReadfile() {
        return readfile;
    }

    public void readFile() throws IOException {
        String filePath = "src/main/db/test.txt";
        File file = new File(filePath);
        String path = file.getPath();
        System.out.println("path = " + path);

        BufferedReader reader = new BufferedReader(
                new FileReader(path, StandardCharsets.UTF_8));
        String str;
        StringBuilder db = new StringBuilder();

        while ((str = reader.readLine()) != null) {
            if (db.toString().equals("")) {
                db.append(str);
                continue;
            }
            db.append("/").append(str);
        }
        System.out.println("db = " + db);

        reader.close();
    }
}
