package ua.lviv.iot.persistence.dao;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ua.lviv.iot.Automarket;

@Named
@Dependent
public class AutomarketDaoImpl extends AbstractDao<Automarket> implements AutomarketDao, Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Automarket> getEntityClass() {
        return Automarket.class;
    }

    @Override
    public void remove(Integer id) {

    }

//    @Resource
//    private UserTransaction userTransaction;

}
