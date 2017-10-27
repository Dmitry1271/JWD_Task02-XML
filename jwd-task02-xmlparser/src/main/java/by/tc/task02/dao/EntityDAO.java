package by.tc.task02.dao;

import by.tc.task02.entity.Entity;
import by.tc.task02.exception.FilePathException;

import java.io.IOException;

public interface EntityDAO {
    Entity parse() throws IOException, FilePathException;
}
