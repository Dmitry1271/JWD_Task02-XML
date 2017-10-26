package by.ts.task02.runner;


import by.ts.task02.dao.DAOFactory;
import by.ts.task02.dao.EntityDAO;

public class Runner {
    public static void main(String[] args) {
        DAOFactory instance = DAOFactory.getInstance();
        EntityDAO entityDAO = instance.getEntityDAO();
        System.out.println(entityDAO.parse());
    }
}
