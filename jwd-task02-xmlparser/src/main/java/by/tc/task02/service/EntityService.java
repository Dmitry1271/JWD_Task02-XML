package by.tc.task02.service;

import by.tc.task02.entity.Entity;
import by.tc.task02.exception.FilePathException;

import java.io.IOException;

public interface EntityService {
    Entity parse() throws IOException, FilePathException;
}
