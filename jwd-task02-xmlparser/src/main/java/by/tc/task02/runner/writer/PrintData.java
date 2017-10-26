package by.tc.task02.runner.writer;


import by.tc.task02.entity.ComplexEntity;
import by.tc.task02.entity.Entity;
import by.tc.task02.entity.SimpleEntity;

public class PrintData {
    private StringBuilder output;

    public PrintData() {
        output = new StringBuilder();
    }

    private void buildOutput(Entity entity) {
        if (entity instanceof ComplexEntity) {
            output.append(PrintHelper.getEntityInfo(entity)).append("\n");
            for (Entity elem : ((ComplexEntity) entity).getEntities()) {
                buildOutput(elem);
            }
        } else if (entity instanceof SimpleEntity) {
            output.append(PrintHelper.getEntityInfo(entity));
            output.append(": ").append(((SimpleEntity) entity).getContent()).append("\n");
        } else {
            output.append(PrintHelper.getEntityInfo(entity)).append("\n");
        }
    }

    public void print(Entity entity) {
        buildOutput(entity);
        System.out.println(output);
    }
}




