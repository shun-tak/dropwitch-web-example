package com.github.shuntak.resources;

import com.codahale.metrics.annotation.Timed;
import com.github.shuntak.api.ResponseBody;
import com.github.shuntak.api.data.UserRegisterRequestData;
import com.github.shuntak.entity.User;
import com.github.shuntak.entity.dao.UserDao;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Produces({MediaType.APPLICATION_JSON, "application/x-msgpack"})
@Timed
public class UserResource {
    private UserDao userDao;

    public UserResource(UserDao userDao) {
        this.userDao = userDao;
    }

    @GET
    @Path("/{id}")
    @UnitOfWork
    public ResponseBody get(@PathParam("id") Long id) {
        User user = userDao.findById(id);
        return new ResponseBody(user);
    }

    @POST
    @Path("/register")
    @Consumes({MediaType.APPLICATION_JSON, "application/x-msgpack"})
    @UnitOfWork
    public ResponseBody register(UserRegisterRequestData data) {
        User user = userDao.create(data.getName());
        return new ResponseBody(user);
    }
}
