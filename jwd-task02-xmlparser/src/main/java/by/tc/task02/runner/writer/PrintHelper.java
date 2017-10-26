package by.tc.task02.runner.writer;

import by.tc.task02.entity.Entity;

import java.util.Map;

public final class PrintHelper {
    private PrintHelper() {
    }

    public static String getEntityInfo(Entity entity) {
        return printTabs(entity) +
                entity.getTag() +
                getEntityAttributes(entity);
    }

    private static String getEntityAttributes(Entity entity) {
        StringBuilder string = new StringBuilder();

        Map<String, String> attributes = entity.getAttributes();
        if (!attributes.isEmpty()) {
            string.append("[ ");
            for (String key : attributes.keySet()) {
                string.append(key).append("=\"").append(attributes.get(key)).append("\" ");
            }
            string.append("]");
        }
        return string.toString();
    }

    private static String printTabs(Entity entity) {
        StringBuilder tabs = new StringBuilder();
        for (int i = 0; i < entity.getDepth() - 1; ++i) {
            tabs.append("\t");
        }
        return tabs.toString();
    }
}
