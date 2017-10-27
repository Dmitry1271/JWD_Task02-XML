package by.tc.task02.dao.parse;

import by.tc.task02.dao.parse.constatnts.TagConstants;
import by.tc.task02.entity.Entity;
import by.tc.task02.entity.ComplexEntity;
import by.tc.task02.exception.InvalidFileException;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private final int DEPTH_DIFFERENCE = 1;

    private TagStack tagStack = new TagStack();
    private Stack<Entity> entities = new Stack<>();


    public void parseLine(String line) throws InvalidFileException {
        Pattern pattern = Pattern.compile(TagConstants.FINDER);
        Matcher matcher = pattern.matcher(line.trim());

        while (matcher.find()) {
            String tag = matcher.group();
            if (!tag.trim().isEmpty()) {
                Entity entity = tagStack.getEntityFromTag(tag);
                if (entity != null) {
                    handleEntity(entity);
                }
            } else {
                throw new InvalidFileException("Incorrect data in th file");
            }
        }
    }

    private void handleEntity(Entity entity) {
        if (entities.isEmpty() || entity.getDepth() == entities.peek().getDepth()) {
            entities.add(entity);
        } else {
            while (!entities.isEmpty() && entities.peek().getDepth() - entity.getDepth() == DEPTH_DIFFERENCE) {
                ((ComplexEntity) entity).addEntity(entities.pop());
            }
            entities.add(entity);
        }
    }

    public Entity getEntity() {
        return entities.pop();
    }

}
