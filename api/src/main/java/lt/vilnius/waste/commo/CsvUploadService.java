package lt.vilnius.waste.commo;

import java.nio.file.Path;

public interface CsvUploadService {

    void parseFile(Path pathToFile);

    String getFilePattern();

    int getOrder();
}
