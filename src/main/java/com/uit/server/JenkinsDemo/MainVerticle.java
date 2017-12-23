package com.uit.server.JenkinsDemo;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

public class MainVerticle extends AbstractVerticle {
  private HttpServer httpServer;
  private Vertx vertx;

  @Override
  public void init(Vertx vertx, Context context) {
    this.vertx = vertx;
    this.httpServer = this.vertx.createHttpServer();
  }

  @Override
  public void start() {
    Router router = Router.router(this.vertx);
    router.route().handler(BodyHandler.create());

    router.get("/TestJenkins/doGet").handler(this::DoGet);
    router.post("/TestJenkins/doPost").handler(this::DoPost);
    //router.get("/TestJenkins/MySessionID").handler(this::DoGetSession);
    
    this.httpServer.requestHandler(router::accept).listen(8089);
  }

  private void DoGet(RoutingContext rt) {
    rt.response().end("Do Get Request Working Well");
  }
  
  private void DoGetSession(RoutingContext rt) {
    rt.response().end("Your IP is "+ rt.request().remoteAddress().host());
  }
  
  private void DoPost(RoutingContext rt) {
    rt.response().end("Do Post Request Working Well");
  }
  
  
}
