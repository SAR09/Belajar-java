package prgrammermuda.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ClosableTest {

    @Test
    void closeIO() throws IOException {
        Path path = Path.of("pom.xml");
        InputStream inputStream = null;
        try {
            // lakukan apapun dengan input stream
            inputStream = Files.newInputStream(path);
        }catch (IOException exception){
            Assertions.fail(exception);
        }finally {
            if (inputStream != null){
                inputStream.close();
            }
        }
    }

    @Test
    void closeIOWithTryResources() {
        Path path = Path.of("pom.xml");

        try(InputStream inputStream = Files.newInputStream(path);) {
           // lakukan apapun dengan input stream
        }catch (IOException exception){
            Assertions.fail(exception);
        }
    }
}
