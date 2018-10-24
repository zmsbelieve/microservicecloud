package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
{
//	@Autowired
//	private HystrixInterceptor hystrixInterceptor;
	@Bean
	@LoadBalanced
	public RestTemplate loadBalanced(){
		return new RestTemplate();
	}
//	@Bean
//	@Primary
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}

	@Bean
	public IRule myRule(){
//		return new RandomRule();
		return new RetryRule();
	}
//	@Bean
//	public FilterRegistrationBean filterRegistrationBean(){
//		FilterRegistrationBean filterRegistrationBean= new FilterRegistrationBean();
//		filterRegistrationBean.setFilter(hystrixInterceptor);
//		filterRegistrationBean.addUrlPatterns("/*");
//		return filterRegistrationBean;
//
//	}
}
//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
// applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">