package Filters;


import javax.servlet.http.HttpServletRequest;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class PreFilter  extends ZuulFilter {

	 // private static Logger log = LoggerFactory.getLogger(PreFilter.class);
	@Override
	  public String filterType() {
	    return "pre";
	  }
	 
	  @Override
	  public int filterOrder() {
	    return 1;
	  }
	 
	  @Override
	  public boolean shouldFilter() {
	    return true;
	  }
	 
	  @Override
	  public Object run() {
	    RequestContext ctx = RequestContext.getCurrentContext();
	    HttpServletRequest request = ctx.getRequest();
	 
	    System.out.println("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
	    return null;
	  }
	}