package by.tc.task02.dao.parse.build.impl;

import by.tc.task02.entity.SimpleEntity;
import by.tc.task02.dao.parse.build.BuilderCommand;
import by.tc.task02.dao.parse.helpaction.ParseHelper;
import by.tc.task02.entity.Entity;

public class SimpleEntityBuilder implements BuilderCommand {
    @Override
    public Entity build(String tag) {
        SimpleEntity simpleEntity = new SimpleEntity();
        simpleEntity.setTag(ParseHelper.getNameTag(tag));
        simpleEntity.setAttributes(ParseHelper.getAttributes(tag));
        simpleEntity.setContent(ParseHelper.getContent(tag));
        return simpleEntity;
    }
}
