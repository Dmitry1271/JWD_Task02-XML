package by.tc.task02.runner;

import by.tc.task02.runner.writer.PrintData;
import by.tc.task02.service.EntityService;
import by.tc.task02.service.ServiceFactory;

public class Runner {
    public static void main(String[] args) {
        ServiceFactory instance = ServiceFactory.getInstance();
        EntityService entityService = instance.getEntityService();
        PrintData printData = new PrintData();
        printData.print(entityService.parse());
    }
}
