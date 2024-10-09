package com.test.demo.entity;



import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.Instant;
import java.util.List;

@Entity
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40, nullable = false)
    @Size(max = 40)
    private String centerName;

    @Column(length = 12, nullable = false, unique = true)
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$")
    private String centerCode;

    @Embedded
    private Address address;

    @Min(1)
    private Integer studentCapacity;

    @ElementCollection
    @Column(name = "courses_offered")
    private List<String> coursesOffered;

    @Column(nullable = false)
    private Instant createdOn;

    @Email
    private String contactEmail;

    @Pattern(regexp = "^\\d{10}$")
    private String contactPhone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterCode() {
		return centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getStudentCapacity() {
		return studentCapacity;
	}

	public void setStudentCapacity(Integer studentCapacity) {
		this.studentCapacity = studentCapacity;
	}

	public List<String> getCoursesOffered() {
		return coursesOffered;
	}

	public void setCoursesOffered(List<String> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	@Override
	public String toString() {
		return "TrainingCenter [id=" + id + ", centerName=" + centerName + ", centerCode=" + centerCode + ", address="
				+ address + ", studentCapacity=" + studentCapacity + ", coursesOffered=" + coursesOffered
				+ ", createdOn=" + createdOn + ", contactEmail=" + contactEmail + ", contactPhone=" + contactPhone
				+ "]";
	}

	public TrainingCenter(Long id, @Size(max = 40) String centerName,
			@Pattern(regexp = "^[a-zA-Z0-9]{12}$") String centerCode, Address address, @Min(1) Integer studentCapacity,
			List<String> coursesOffered, Instant createdOn, @Email String contactEmail,
			@Pattern(regexp = "^\\d{10}$") String contactPhone) {
		super();
		this.id = id;
		this.centerName = centerName;
		this.centerCode = centerCode;
		this.address = address;
		this.studentCapacity = studentCapacity;
		this.coursesOffered = coursesOffered;
		this.createdOn = createdOn;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;
	}

	public TrainingCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

   
    
}

@Embeddable
class Address {
    @NotBlank
    private String detailedAddress;
    
    @NotBlank
    private String city;
    
    @NotBlank
    private String state;
    
    @Pattern(regexp = "^\\d{6}$")
    private String pincode;

	public String getDetailedAddress() {
		return detailedAddress;
	}

	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [detailedAddress=" + detailedAddress + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}

	public Address(@NotBlank String detailedAddress, @NotBlank String city, @NotBlank String state,
			@Pattern(regexp = "^\\d{6}$") String pincode) {
		super();
		this.detailedAddress = detailedAddress;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
}
