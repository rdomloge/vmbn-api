package com.vmbn.vmbnapi.mvc;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.ServletContextResource;

@RestController
public class MediaController {
	
	@Autowired
    private ServletContext servletContext;

//	@RequestMapping(value = "/image-byte-array", method = RequestMethod.GET)
//	public @ResponseBody byte[] getImageAsByteArray() throws IOException {
//	    InputStream in = servletContext.getResourceAsStream("/WEB-INF/images/image-example.jpg");
//	    return IOUtils.toByteArray(in);
//	}
//	
//	@RequestMapping(value = "/image-response-entity", method = RequestMethod.GET)
//	public ResponseEntity<byte[]> getImageAsResponseEntity() throws IOException {
//	    HttpHeaders headers = new HttpHeaders();
//	    InputStream in = servletContext.getResourceAsStream("/WEB-INF/images/image-example.jpg");
//	    byte[] media = IOUtils.toByteArray(in);
//	    headers.setCacheControl(CacheControl.noCache().getHeaderValue());
//	     
//	    ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(media, headers, HttpStatus.OK);
//	    return responseEntity;
//	}
	
	@ResponseBody
	@RequestMapping(value = "/image-resource", method = RequestMethod.GET)
	public Resource getImageAsResource() {
	   return new ServletContextResource(servletContext, "architect.jpg");
	}
}
