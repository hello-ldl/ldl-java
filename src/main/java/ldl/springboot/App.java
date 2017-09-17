package ldl.springboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@Configuration  
@ComponentScan  
@EnableAutoConfiguration
@RestController
public class App
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class);
    }
    
    @RequestMapping("/{service}")
    @ResponseBody
    public String test(@PathVariable String service,HttpServletRequest request, HttpServletResponse response){
    	System.out.println(request.getSession().getId());
    	return service;
    }
}
