package chapter5;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class p190 {
    public static void main(String[] args) {

        long uniqueWords = 0;
        try (Stream<String> lines =
                Files.lines(Paths.get(".\\data.txt"), Charset.defaultCharset())
        ){
          uniqueWords = lines.flatMap(line -> Arrays.stream(line.split("\\s+")))
                  .distinct()
                  .count();

            System.out.println("총단어수 :" + uniqueWords);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
