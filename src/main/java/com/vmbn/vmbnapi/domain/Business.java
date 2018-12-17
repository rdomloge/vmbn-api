package com.vmbn.vmbnapi.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.rest.core.annotation.RestResource;


@Entity
public class Business {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private Double askingPrice;
	
	private Double turnover;
	
	private Double netProfit;
	
	private String location;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "fk_propertyInformation")
	private PropertyInformation propertyInformation;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "fk_businessOperation")
	private BusinessOperation businessOperation;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "fk_franchiseInformation")
	private FranchiseInformation franchiseInformation;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "fk_otherInformation")
	private OtherInformation otherInformation;
	
	@OneToMany(
			mappedBy = "business",
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    )
	@RestResource(path = "images", rel="images")
	private Set<Image> images;
	
	@ElementCollection
	@Lob
	private List<String> description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAskingPrice() {
		return askingPrice;
	}

	public void setAskingPrice(Double askingPrice) {
		this.askingPrice = askingPrice;
	}

	public Double getTurnover() {
		return turnover;
	}

	public void setTurnover(Double turnover) {
		this.turnover = turnover;
	}

	public Double getNetProfit() {
		return netProfit;
	}
	
	public Set<Image> getImages() {
		return images;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}

	public void setNetProfit(Double netProfit) {
		this.netProfit = netProfit;
	}

	public List<String> getDescription() {
		return description;
	}

	public void setDescription(List<String> description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public PropertyInformation getPropertyInformation() {
		return propertyInformation;
	}

	public void setPropertyInformation(PropertyInformation propertyInformation) {
		this.propertyInformation = propertyInformation;
	}

	public BusinessOperation getBusinessOperation() {
		return businessOperation;
	}

	public void setBusinessOperation(BusinessOperation businessOperation) {
		this.businessOperation = businessOperation;
	}

	public FranchiseInformation getFranchiseInformation() {
		return franchiseInformation;
	}

	public void setFranchiseInformation(FranchiseInformation franchiseInformation) {
		this.franchiseInformation = franchiseInformation;
	}

	public OtherInformation getOtherInformation() {
		return otherInformation;
	}

	public void setOtherInformation(OtherInformation otherInformation) {
		this.otherInformation = otherInformation;
	}
}
