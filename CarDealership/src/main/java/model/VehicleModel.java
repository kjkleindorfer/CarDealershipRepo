
/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Feb 28, 2022
 */
package model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import controller.LocalDateAttributeConverter;


@Entity
@Table(name="ModelTable")

public class VehicleModel{
	//will be an entity
	//autogenerated id
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	//specific name ex: ford (fusion)
	@Column(name="Model")
	private String model;
	
	//specific brand ex: (ford) fusion
	@Column(name="Make")
	private String make;
	
	//all wheel 4wd etc
	@Column(name="DriveTrain")
	private String driveTrain;
	
	//base sticker price of vehicle
	@Column(name="Price")
	private String price;
	
	@Column(name="DateAdded")
	@Convert(converter = LocalDateAttributeConverter.class)
	private LocalDate addedToLot;

	
	//TODO figure out how to link the two ^*/
	public VehicleModel() {
		super();
	}
	public VehicleModel(String model, String make, String driveTrain, String price, LocalDate addedToLot) {
		this.model = model;
		this.make = make;
		this.driveTrain = driveTrain;
		this.price = price;
		this.addedToLot = addedToLot;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getDriveTrain() {
		return driveTrain;
	}
	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public LocalDate getAddedToLot() {
		return addedToLot;
	}
	public void setAddedToLot(LocalDate addedToLot) {
		this.addedToLot = addedToLot;
	}
	//removed some variables just to make the project simpler
	@Override
	public String toString() {
		return "VehicleModel [brand=" + make + ", model=" + model + ", dateAdded=" + addedToLot.toString() + 
				", price=" + price + ", driveTrain=" + driveTrain;
	}
	}

