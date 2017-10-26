package by.tc.task02.dao.parse.build.impl;

import by.tc.task02.dao.parse.build.BuilderCommand;
import by.tc.task02.dao.parse.helpaction.ParseHelper;
import by.tc.task02.entity.EmptyElementEntity;
import by.tc.task02.entity.Entity;

public class EmptyElementEntityBuilder implements BuilderCommand {
    @Override
    public Entity build(String tag) {
        EmptyElementEntity emptyElementEntity = new EmptyElementEntity();
        emptyElementEntity.setTag(ParseHelper.getNameTag(tag));
        emptyElementEntity.setAttributes(ParseHelper.getAttributes(tag));
        return emptyElementEntity;
    }
}
