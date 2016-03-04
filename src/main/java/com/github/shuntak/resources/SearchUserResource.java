package com.github.shuntak.resources;

import com.codahale.metrics.annotation.Timed;
import com.github.shuntak.api.ResponseCommonBody;
import com.github.shuntak.entity.dao.PostDao;
import com.github.shuntak.entity.dao.UserDao;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/searchUser")
@Produces({MediaType.APPLICATION_JSON, "application/x-msgpack"})
@Timed
public class SearchUserResource {
    private PostDao postDao;
    private UserDao userDao;

    public SearchUserResource(PostDao postDao, UserDao userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }

    @GET
    @UnitOfWork
    public ResponseCommonBody get() {
        return new ResponseCommonBody(new ArrayList<>());
    }
}
