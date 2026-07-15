
package com.example.librarymanagement;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

public class TestToCheckLoggerInMainApplication {

    @Test
    public void shouldMainApplicationContainLoggerImplementation() throws IOException{
        String content=Files.readString(Paths.get("src/main/java/com/example/librarymanagement/LibrarymanagementApplication.java"));
        assertTrue(content.contains("Logger"));
    }
    
}