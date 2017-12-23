package com.uit.server.JenkinsDemo;

import io.vertx.core.Vertx;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Vertx vertx =  Vertx.vertx();
      vertx.deployVerticle(new MainVerticle(), res->{
        if(res.succeeded()) {
          System.out.println("Deploy Succeeded");
        }else {
          System.out.println("Deploy Failed");
        }
        
      });
    }
}
