package io.nuls.rpcserver.resources;

import io.nuls.rpcserver.entity.RpcResult;
import io.nuls.util.param.AssertUtil;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Niels on 2017/9/25.
 * nuls.io
 */
@Path("/")
public class ExampleResouce {

    public ExampleResouce() {
    }

    @GET
    @Produces("application/json")
    public RpcResult getMessage0() {
        return RpcResult.getSuccess().setData("hello world");
    }

    @GET
    @Path("/test")
    @Produces("application/json")
    public String getMessage() {
        return RpcResult.getSuccess().setData("hello world222222222222222222").toString();
    }

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public RpcResult getMessage2(@QueryParam("key") String key) {
        AssertUtil.canNotEmpty(key,"测试抛出异常");
        return RpcResult.getSuccess().setData("hello world3333333333333333333333");
    }
}