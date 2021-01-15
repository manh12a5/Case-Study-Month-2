package storage;

import model.PPerson;

import java.util.Map;

public interface ReadAndWriteTypeMap {
    void readFileMap(Map<String, PPerson> pPersonMap);
    void writeFileMap(Map<String, PPerson> pPersonMap);
}
