package com.zuulgateway.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import Filters.ErrorFilter;
import Filters.PostFilter;
import Filters.PreFilter;
import Filters.RouteFilter;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
@EnableFeignClients("com.clientui")
public class ZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}
		@Bean
		public PreFilter preFilter() {
		    return new PreFilter();
		}
		
		@Bean
		public PostFilter postFilter() {
		    return new PostFilter();
		}
		@Bean
		public ErrorFilter errorFilter() {
		    return new ErrorFilter();
		}
		@Bean
		public RouteFilter routeFilter() {
		    return new RouteFilter();
		
	}
}
