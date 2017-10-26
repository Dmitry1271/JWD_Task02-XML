package by.tc.task02.dao.parse.build;

import by.tc.task02.entity.Entity;

public interface BuilderCommand {
    Entity build(String tag);
}
