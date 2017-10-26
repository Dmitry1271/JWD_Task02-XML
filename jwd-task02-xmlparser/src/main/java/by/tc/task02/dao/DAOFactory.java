package by.tc.task02.dao;

import by.tc.task02.dao.impl.EntityDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final EntityDAO entityDAO = new EntityDAOImpl();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public EntityDAO getEntityDAO() {
        return entityDAO;
    }
}
