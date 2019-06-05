package cn.hxzy.config;

import cn.hxzy.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    //配置拦截器
    @Bean
    public LoginInterceptor loginInterceptor(){
        LoginInterceptor loginInterceptor = new LoginInterceptor();
        return loginInterceptor;
    }

    //添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.loginInterceptor()).addPathPatterns("/**");
    }
}
