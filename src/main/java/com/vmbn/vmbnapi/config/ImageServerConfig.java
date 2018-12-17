package com.vmbn.vmbnapi.config;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ImageServerConfig extends WebMvcConfigurerAdapter {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ImageServerConfig.class);

	@Value("${static.path:/Users/rdomloge/Documents/workspace/vmbn-api/media-storage/}")
	private String staticPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/media/**").addResourceLocations("file://"+staticPath);
        LOGGER.info("Serving files from {}", staticPath);
    }

//	@Override
//	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		converters.add(byteArrayHttpMessageConverter());
//	}
//
//	@Bean
//	public ByteArrayHttpMessageConverter byteArrayHttpMessageConverter() {
//		ByteArrayHttpMessageConverter arrayHttpMessageConverter = new ByteArrayHttpMessageConverter();
//		arrayHttpMessageConverter.setSupportedMediaTypes(getSupportedMediaTypes());
//		return arrayHttpMessageConverter;
//	}
//
//	private List<MediaType> getSupportedMediaTypes() {
//		List<MediaType> list = new ArrayList<MediaType>();
//		list.add(MediaType.IMAGE_JPEG);
//		list.add(MediaType.IMAGE_PNG);
//		list.add(MediaType.APPLICATION_OCTET_STREAM);
//		return list;
//	}

}
