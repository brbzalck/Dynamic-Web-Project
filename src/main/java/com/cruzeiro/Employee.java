package com.cruzeiro;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {
	@NotNull(message = "Id é obrigatório")
	@Min(value=0, message="Id deve ser maior ou igual a 0.")
	@Max(value=10, message="Id deve ser menor ou igual a 10.")
	private int id;
	
	@NotNull(message="Campo obrigatório")
	@Size(min=2, message="Digite no mínimo 2 caracteres")
	private String firstName;
	private String lastName;
	private String city;
	private String zipcode;
	private String bussinessUnit;
	private String[] languages;
	private LinkedHashMap<String, String> citiesOptions;
	
	public Employee() {
		citiesOptions = new LinkedHashMap<>();
		citiesOptions.put("SP", "São Paulo");
		citiesOptions.put("RJ", "Rio de Janeiro");
		citiesOptions.put("MG", "Minas Gerais");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getBussinessUnit() {
		return bussinessUnit;
	}
	public void setBussinessUnit(String bussinessUnit) {
		this.bussinessUnit = bussinessUnit;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	public LinkedHashMap<String, String> getCitiesOptions() {
		return citiesOptions;
	}
	public void setCitiesOptions(LinkedHashMap<String, String> citiesOptions) {
		this.citiesOptions = citiesOptions;
	}
}
