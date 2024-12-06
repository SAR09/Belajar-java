package prgrammermuda.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class OpenOptionsTest {

    @Test
    void append() {
            Path path = Path.of("append.txt");
            try(Writer writer = Files.newBufferedWriter(path,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
                for (int i = 0; i < 100; i++) {
                    writer.write("Hello World\n");
                    writer.flush();
                }
            } catch (IOException e) {
                Assertions.fail(e);
            }
    }

}


