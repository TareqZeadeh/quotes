/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\STUDENT\\java-401\\quotes\\app\\src\\main\\resources\\recentquotes.json");
        List<Quotes> quotes = jsonParser(path);
        System.out.println(quotes);
    }



    public static List<Quotes> jsonParser(Path path) {
        List<Quotes> quotes = null;
        final Type REVIEW_TYPE = new TypeToken<List<Quotes>>() {
        }.getType();
        try (
                BufferedReader bufferedReader = Files.newBufferedReader(path);
        ) {

            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            quotes = gson.fromJson(bufferedReader, REVIEW_TYPE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return quotes;
    }
}