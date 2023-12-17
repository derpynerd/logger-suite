package org.example.exec;

import org.example.config.ConfigLoader;
import org.example.io.IOUtil;

import java.io.*;
import java.util.Properties;

import static org.example.constants.FileNames.FILE_LOCALE;
import static org.example.constants.Messages.*;

public class Runner {

    public static void Startup() throws IOException {

        Properties properties = ConfigLoader.getProperties();
        File file = new File(properties.getProperty(FILE_LOCALE));

        // --------- Logging ---------
        // --------- Note: Write in a cleaner way
        if (file.createNewFile()) {
            System.out.println(FILE_CREATED + SPACE + file.getName());
        }
        else {
            System.out.println(FILE_EXISTS);
        }
        // --------- End Note
        // ---------------------------

        IOUtil.Write();

        // Display(IOManager.Read());

    }


}
