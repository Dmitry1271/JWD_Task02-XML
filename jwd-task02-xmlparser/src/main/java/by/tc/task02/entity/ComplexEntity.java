package by.tc.task02.entity;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ComplexEntity extends Entity {
    private LinkedList<Entity> entities = new LinkedList<>();

    public ComplexEntity() {
    }

    public ComplexEntity(String tag, Map<String, String> attributes) {
        super(tag, attributes);

    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(LinkedList<Entity> entities) {
        this.entities = entities;
    }

    public void addEntity(Entity entity) {
        entities.addFirst(entity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        ComplexEntity that = (ComplexEntity) o;

        return entities != null ? entities.equals(that.entities) : that.entities == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (entities != null ? entities.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + entities;
    }
}
