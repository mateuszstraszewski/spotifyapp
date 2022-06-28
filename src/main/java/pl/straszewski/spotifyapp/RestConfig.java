package pl.straszewski.spotifyapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

//@Order(Ordered.HIGHEST_PRECEDENCE)
//@Configuration
//public class RestConfig {
//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.addAllowedOrigin("http://localhost:4200");
//        config.addAllowedHeader("*");
//        config.addAllowedHeader("Authorization");
//        config.addAllowedMethod("OPTIONS");
//        config.addAllowedMethod("GET");
//        config.addAllowedMethod("POST");
//        config.addAllowedMethod("PUT");
//        config.addAllowedMethod("DELETE");
//        source.registerCorsConfiguration("/**", config);
//        return new CorsFilter(source);
//    }
//}

//@Configuration
//public class CorsConfig {
//    //IMPORTANT: it has to be a normal configuration class,
//    //not extending WebMvcConfigurerAdapter or other Spring Security class
//    @Bean
//    public FilterRegistrationBean<CorsFilter> customCorsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.setAllowedMethods(Collections.singletonList("*"));
//        config.setAllowedHeaders(Collections.singletonList("*"));
//        config.addAllowedOrigin("http://localhost:4200");
//        config.addAllowedOrigin("http://production.url");
//        config.setAllowCredentials(true);
//        source.registerCorsConfiguration("/**", config);
//        FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
//
//        //IMPORTANT #2: I didn't stress enough the importance of this line in my original answer,
//        //but it's here where we tell Spring to load this filter at the right point in the chain
//        //(with an order of precedence higher than oauth2's filters)
//        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
//        return bean;
//    }
//}

//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
//public class MyCorsFilter implements Filter {
//
//    public MyCorsFilter () {
//        super();
//    }
//
//    @Override
//    public final void doFilter(final ServletRequest req, final ServletResponse res, final FilterChain chain) throws IOException, ServletException {
//        final HttpServletResponse response = (HttpServletResponse) res;
//        response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
//
//        // without this header jquery.ajax calls returns 401 even after successful login and SSESSIONID being succesfully stored.
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//
//        response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
//        response.setHeader("Access-Control-Max-Age", "3600");
//        response.setHeader("Access-Control-Allow-Headers", "X-Requested-With, Authorization, Origin, Content-Type, Version");
//        response.setHeader("Access-Control-Expose-Headers", "X-Requested-With, Authorization, Origin, Content-Type");
//
//        final HttpServletRequest request = (HttpServletRequest) req;
//        if (!request.getMethod().equals("OPTIONS")) {
//            chain.doFilter(req, res);
//        } else {
//            // do not continue with filter chain for options requests
//        }
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//    }
//}
//
