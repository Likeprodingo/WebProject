package com.shitikov.project.model.dao;

import com.shitikov.project.model.entity.User;
import com.shitikov.project.model.entity.application.Application;
import com.shitikov.project.model.entity.type.OrderStatus;
import com.shitikov.project.model.exception.DaoException;

import java.util.List;
import java.util.Map;

public interface ApplicationDao extends BaseDao<Long, Application> {
    List<Application> findByUserLogin(String login) throws DaoException;

    boolean checkByApplicationId(long applicationId) throws DaoException;

    Map<OrderStatus, Application> findByUser(User user) throws DaoException;
}
