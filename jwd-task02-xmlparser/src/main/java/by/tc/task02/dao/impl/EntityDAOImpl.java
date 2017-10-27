package by.tc.task02.dao.impl;


import by.tc.task02.dao.EntityDAO;
import by.tc.task02.dao.parse.Parser;
import by.tc.task02.entity.Entity;
import by.tc.task02.exception.FilePathException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntityDAOImpl implements EntityDAO {
    private BufferedReader reader = null;

    @Override
    public Entity parse() throws IOException, FilePathException {
        try {
            if (EntityDAOImpl.class.getResourceAsStream("/resources.xml") == null) {
                throw new FilePathException("Incorrect file path!");
            }

            reader = new BufferedReader(new InputStreamReader(EntityDAOImpl.class.getResourceAsStream("/resources.xml")));

            String line;
            Parser parser = new Parser();
            while ((line = reader.readLine()) != null) {
                parser.parseLine(line);
            }
            return parser.getEntity();

        } catch (IOException e) {
            throw new IOException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }
    }
}
