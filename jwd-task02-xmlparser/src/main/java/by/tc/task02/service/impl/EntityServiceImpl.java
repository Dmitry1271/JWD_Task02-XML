package by.tc.task02.service.impl;

import by.tc.task02.dao.DAOFactory;
import by.tc.task02.dao.EntityDAO;
import by.tc.task02.entity.Entity;
import by.tc.task02.service.EntityService;

public class EntityServiceImpl implements EntityService {
    @Override
    public Entity parse() {
        DAOFactory instance = DAOFactory.getInstance();
        EntityDAO entityDAO = instance.getEntityDAO();

        Entity entity = entityDAO.parse();
        return entity;
    }
}
