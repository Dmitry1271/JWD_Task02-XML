package by.tc.task02.dao.parse.build;

import by.tc.task02.dao.parse.build.impl.EmptyElementEntityBuilder;
import by.tc.task02.dao.parse.build.impl.SimpleEntityBuilder;
import by.tc.task02.dao.parse.build.impl.ComplexEntityBuilder;

import java.util.HashMap;
import java.util.Map;

public class BuilderDirector {
    private Map<String, BuilderCommand> builders = new HashMap<>();

    public BuilderDirector() {
        builders.put("COMPLEX_TAG", new ComplexEntityBuilder());
        builders.put("SELF_CLOSING_TAG", new EmptyElementEntityBuilder());
        builders.put("SIMPLE_TAG", new SimpleEntityBuilder());
    }

    public BuilderCommand getBuilder(String tagType) {
        return builders.get(tagType);
    }
}
