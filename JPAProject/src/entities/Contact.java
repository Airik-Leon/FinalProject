package entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String email;
	private String latitude;
	private String longitude;
}
