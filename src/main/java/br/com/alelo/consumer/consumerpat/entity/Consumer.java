package br.com.alelo.consumer.consumerpat.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Consumer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private int documentNumber;
	private Date birthDate;

	// contacts
	private int mobilePhoneNumber;
	private int residencePhoneNumber;
	private int phoneNumber;
	private String email;

	// Address
	private String street;
	private int number;
	private String city;
	private String country;
	private int portalCode;

	// cards
	private long foodCardNumber;
	private Double foodCardBalance;

	private long fuelCardNumber;
	private Double fuelCardBalance;

	private long drugstoreCardNumber;
	private Double drugstoreCardBalance;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Consumer consumer = (Consumer) o;
		return documentNumber == consumer.documentNumber && mobilePhoneNumber == consumer.mobilePhoneNumber
				&& residencePhoneNumber == consumer.residencePhoneNumber && phoneNumber == consumer.phoneNumber
				&& number == consumer.number && portalCode == consumer.portalCode
				&& foodCardNumber == consumer.foodCardNumber
				&& Double.compare(consumer.foodCardBalance, foodCardBalance) == 0
				&& fuelCardNumber == consumer.fuelCardNumber
				&& Double.compare(consumer.fuelCardBalance, fuelCardBalance) == 0
				&& drugstoreCardNumber == consumer.drugstoreCardNumber
				&& Double.compare(consumer.drugstoreCardBalance, drugstoreCardBalance) == 0
				&& Objects.equals(id, consumer.id) && Objects.equals(name, consumer.name)
				&& Objects.equals(birthDate, consumer.birthDate) && Objects.equals(email, consumer.email)
				&& Objects.equals(street, consumer.street) && Objects.equals(city, consumer.city)
				&& Objects.equals(country, consumer.country);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + documentNumber;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

}