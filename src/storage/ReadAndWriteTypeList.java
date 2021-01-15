package storage;

import model.PPerson;

import java.util.List;

public interface ReadAndWriteTypeList {
    void readFileList(List<PPerson> pPersonList);
    void writeFileList(List<PPerson> pPersonList);
}
