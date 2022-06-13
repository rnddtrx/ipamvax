package be.ipam.IpamVax.api.model;

import java.util.Objects;
import be.ipam.IpamVax.api.model.PeopleSchedule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.hateoas.RepresentationModel;

/**
 * A patient
 */
@ApiModel(description = "A patient")

public class People extends RepresentationModel<People>  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("peopleId")
  private BigDecimal peopleId;

  @JsonProperty("firstname")
  private String firstname;

  @JsonProperty("lastname")
  private String lastname;

  @JsonProperty("nationalNumber")
  private String nationalNumber;

  @JsonProperty("password")
  private String password;

  @JsonProperty("dateOfBirth")
  private String dateOfBirth;

  @JsonProperty("placeOfBirth")
  private String placeOfBirth;

  @JsonProperty("countryOfBirth")
  private String countryOfBirth;

  @JsonProperty("addressStreet")
  private String addressStreet;

  @JsonProperty("addressNumber")
  private String addressNumber;

  @JsonProperty("addressPostalCode")
  private String addressPostalCode;

  @JsonProperty("addressCity")
  private String addressCity;

  @JsonProperty("peopleSchedules")
  @Valid
  private List<PeopleSchedule> peopleSchedules = null;

  public People peopleId(BigDecimal peopleId) {
    this.peopleId = peopleId;
    return this;
  }

  /**
   * People ID
   * @return peopleId
  */
  @ApiModelProperty(value = "People ID")

  @Valid

  public BigDecimal getPeopleId() {
    return peopleId;
  }

  public void setPeopleId(BigDecimal peopleId) {
    this.peopleId = peopleId;
  }

  public People firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * Firstname
   * @return firstname
  */
  @ApiModelProperty(value = "Firstname")


  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public People lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * Lastname
   * @return lastname
  */
  @ApiModelProperty(value = "Lastname")


  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public People nationalNumber(String nationalNumber) {
    this.nationalNumber = nationalNumber;
    return this;
  }

  /**
   * national number
   * @return nationalNumber
  */
  @ApiModelProperty(value = "national number")


  public String getNationalNumber() {
    return nationalNumber;
  }

  public void setNationalNumber(String nationalNumber) {
    this.nationalNumber = nationalNumber;
  }

  public People password(String password) {
    this.password = password;
    return this;
  }

  /**
   * password
   * @return password
  */
  @ApiModelProperty(value = "password")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public People dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * dob
   * @return dateOfBirth
  */
  @ApiModelProperty(value = "dob")


  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public People placeOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
    return this;
  }

  /**
   * pob
   * @return placeOfBirth
  */
  @ApiModelProperty(value = "pob")


  public String getPlaceOfBirth() {
    return placeOfBirth;
  }

  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public People countryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
    return this;
  }

  /**
   * cob
   * @return countryOfBirth
  */
  @ApiModelProperty(value = "cob")


  public String getCountryOfBirth() {
    return countryOfBirth;
  }

  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  public People addressStreet(String addressStreet) {
    this.addressStreet = addressStreet;
    return this;
  }

  /**
   * Address
   * @return addressStreet
  */
  @ApiModelProperty(value = "Address")


  public String getAddressStreet() {
    return addressStreet;
  }

  public void setAddressStreet(String addressStreet) {
    this.addressStreet = addressStreet;
  }

  public People addressNumber(String addressNumber) {
    this.addressNumber = addressNumber;
    return this;
  }

  /**
   * Number
   * @return addressNumber
  */
  @ApiModelProperty(value = "Number")


  public String getAddressNumber() {
    return addressNumber;
  }

  public void setAddressNumber(String addressNumber) {
    this.addressNumber = addressNumber;
  }

  public People addressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
    return this;
  }

  /**
   * Postcode
   * @return addressPostalCode
  */
  @ApiModelProperty(value = "Postcode")


  public String getAddressPostalCode() {
    return addressPostalCode;
  }

  public void setAddressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
  }

  public People addressCity(String addressCity) {
    this.addressCity = addressCity;
    return this;
  }

  /**
   * City
   * @return addressCity
  */
  @ApiModelProperty(value = "City")


  public String getAddressCity() {
    return addressCity;
  }

  public void setAddressCity(String addressCity) {
    this.addressCity = addressCity;
  }

  public People peopleSchedules(List<PeopleSchedule> peopleSchedules) {
    this.peopleSchedules = peopleSchedules;
    return this;
  }

  public People addPeopleSchedulesItem(PeopleSchedule peopleSchedulesItem) {
    if (this.peopleSchedules == null) {
      this.peopleSchedules = new ArrayList<>();
    }
    this.peopleSchedules.add(peopleSchedulesItem);
    return this;
  }

  /**
   * Collection of schedule.
   * @return peopleSchedules
  */
  @ApiModelProperty(value = "Collection of schedule.")

  @Valid

  public List<PeopleSchedule> getPeopleSchedules() {
    return peopleSchedules;
  }

  public void setPeopleSchedules(List<PeopleSchedule> peopleSchedules) {
    this.peopleSchedules = peopleSchedules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    People people = (People) o;
    return Objects.equals(this.peopleId, people.peopleId) &&
        Objects.equals(this.firstname, people.firstname) &&
        Objects.equals(this.lastname, people.lastname) &&
        Objects.equals(this.nationalNumber, people.nationalNumber) &&
        Objects.equals(this.password, people.password) &&
        Objects.equals(this.dateOfBirth, people.dateOfBirth) &&
        Objects.equals(this.placeOfBirth, people.placeOfBirth) &&
        Objects.equals(this.countryOfBirth, people.countryOfBirth) &&
        Objects.equals(this.addressStreet, people.addressStreet) &&
        Objects.equals(this.addressNumber, people.addressNumber) &&
        Objects.equals(this.addressPostalCode, people.addressPostalCode) &&
        Objects.equals(this.addressCity, people.addressCity) &&
        Objects.equals(this.peopleSchedules, people.peopleSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peopleId, firstname, lastname, nationalNumber, password, dateOfBirth, placeOfBirth, countryOfBirth, addressStreet, addressNumber, addressPostalCode, addressCity, peopleSchedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class People {\n");
    
    sb.append("    peopleId: ").append(toIndentedString(peopleId)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    nationalNumber: ").append(toIndentedString(nationalNumber)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    addressStreet: ").append(toIndentedString(addressStreet)).append("\n");
    sb.append("    addressNumber: ").append(toIndentedString(addressNumber)).append("\n");
    sb.append("    addressPostalCode: ").append(toIndentedString(addressPostalCode)).append("\n");
    sb.append("    addressCity: ").append(toIndentedString(addressCity)).append("\n");
    sb.append("    peopleSchedules: ").append(toIndentedString(peopleSchedules)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

