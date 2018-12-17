package com.vmbn.vmbnapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vmbn.vmbnapi.domain.Business;

//@RepositoryRestResource(collectionResourceRel = "businesses", path = "businesses")
@CrossOrigin( {"http://localhost:81"} )
public interface BusinessRepository extends PagingAndSortingRepository<Business, Integer> {

}
