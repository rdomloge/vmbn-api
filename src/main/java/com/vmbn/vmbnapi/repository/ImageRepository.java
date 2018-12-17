package com.vmbn.vmbnapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vmbn.vmbnapi.domain.Image;

//@RepositoryRestResource(collectionResourceRel = "images", path = "images")
@CrossOrigin( {"http://localhost:81"} )
public interface ImageRepository extends PagingAndSortingRepository<Image, Integer> {

}
