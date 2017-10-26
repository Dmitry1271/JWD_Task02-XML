package by.tc.task02.dao.parse.build.impl;


import by.tc.task02.dao.parse.helpaction.ParseHelper;
import by.tc.task02.entity.ComplexEntity;
import by.tc.task02.entity.Entity;
import by.tc.task02.dao.parse.build.BuilderCommand;

public class ComplexEntityBuilder implements BuilderCommand {
    @Override
    public Entity build(String tag) {
        ComplexEntity complexEntity = new ComplexEntity();
        complexEntity.setTag(ParseHelper.getNameTag(tag));
        complexEntity.setAttributes(ParseHelper.getAttributes(tag));
        return complexEntity;
    }
}
