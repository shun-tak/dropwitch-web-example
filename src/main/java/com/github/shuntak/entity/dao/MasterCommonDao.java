package com.github.shuntak.entity.dao;

import com.github.shuntak.entity.MasterCommon;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

import java.util.List;

public class MasterCommonDao extends AbstractDAO<MasterCommon> {
    public MasterCommonDao(SessionFactory factory) {
        super(factory);
    }

    public List getAll() {
        return criteria().list();
    }
}
