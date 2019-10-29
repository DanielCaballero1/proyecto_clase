package py.daniel.caballero.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.daniel.caballero.controller.HomeController;
import py.daniel.caballero.dao.ProyectoDAO;



@EnableWebMvc

//Carga los componentes segun el paquete especificado
@ComponentScan(basePackageClasses = { HomeController.class, ProyectoDAO.class })

public class AppWebConfiguration extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/static/");
		resolver.setSuffix(".html");
		return resolver;
	}
	
	//Habilitar las peticiones para recursos estáticos dentro de AppWebConfiguration.
		@Override
			public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
				configurer.enable();
			}
		
		//paquete package org.springframework.format.datetime
		@Bean  	
		public FormattingConversionService mvcConversionService() 
		{ 
		 	DefaultFormattingConversionService conversionService =  	new DefaultFormattingConversionService(true);
		 	DateFormatterRegistrar registrar = new DateFormatterRegistrar(); 
		 	registrar.setFormatter(new DateFormatter("yyyy-MM-dd"));  
		 	registrar.registerFormatters(conversionService); 
		 	return conversionService; 
		 	} 

		
		
}
 

	

