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
 * VaxCentre
 */
@ApiModel(description = "VaxCentre")

public class VaxCentre extends RepresentationModel<VaxCentre>  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("vaxCentreId")
  private BigDecimal vaxCentreId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("addressStreet")
  private String addressStreet;

  @JsonProperty("addressNumber")
  private String addressNumber;

  @JsonProperty("addressCity")
  private String addressCity;

  @JsonProperty("peopleSchedules")
  @Valid
  private List<PeopleSchedule> peopleSchedules = null;

  public VaxCentre vaxCentreId(BigDecimal vaxCentreId) {
    this.vaxCentreId = vaxCentreId;
    return this;
  }

  /**
   * vaxCentre ID
   * @return vaxCentreId
  */
  @ApiModelProperty(value = "vaxCentre ID")

  @Valid

  public BigDecimal getVaxCentreId() {
    return vaxCentreId;
  }

  public void setVaxCentreId(BigDecimal vaxCentreId) {
    this.vaxCentreId = vaxCentreId;
  }

  public VaxCentre name(String name) {
    this.name = name;
    return this;
  }

  /**
   * vaxCentre name
   * @return name
  */
  @ApiModelProperty(value = "vaxCentre name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VaxCentre addressStreet(String addressStreet) {
    this.addressStreet = addressStreet;
    return this;
  }

  /**
   * vaxCentre street
   * @return addressStreet
  */
  @ApiModelProperty(value = "vaxCentre street")


  public String getAddressStreet() {
    return addressStreet;
  }

  public void setAddressStreet(String addressStreet) {
    this.addressStreet = addressStreet;
  }

  public VaxCentre addressNumber(String addressNumber) {
    this.addressNumber = addressNumber;
    return this;
  }

  /**
   * vaxCentre number
   * @return addressNumber
  */
  @ApiModelProperty(value = "vaxCentre number")


  public String getAddressNumber() {
    return addressNumber;
  }

  public void setAddressNumber(String addressNumber) {
    this.addressNumber = addressNumber;
  }

  public VaxCentre addressCity(String addressCity) {
    this.addressCity = addressCity;
    return this;
  }

  /**
   * vaxCentre city
   * @return addressCity
  */
  @ApiModelProperty(value = "vaxCentre city")


  public String getAddressCity() {
    return addressCity;
  }

  public void setAddressCity(String addressCity) {
    this.addressCity = addressCity;
  }

  public VaxCentre peopleSchedules(List<PeopleSchedule> peopleSchedules) {
    this.peopleSchedules = peopleSchedules;
    return this;
  }

  public VaxCentre addPeopleSchedulesItem(PeopleSchedule peopleSchedulesItem) {
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
    VaxCentre vaxCentre = (VaxCentre) o;
    return Objects.equals(this.vaxCentreId, vaxCentre.vaxCentreId) &&
        Objects.equals(this.name, vaxCentre.name) &&
        Objects.equals(this.addressStreet, vaxCentre.addressStreet) &&
        Objects.equals(this.addressNumber, vaxCentre.addressNumber) &&
        Objects.equals(this.addressCity, vaxCentre.addressCity) &&
        Objects.equals(this.peopleSchedules, vaxCentre.peopleSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaxCentreId, name, addressStreet, addressNumber, addressCity, peopleSchedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaxCentre {\n");
    
    sb.append("    vaxCentreId: ").append(toIndentedString(vaxCentreId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addressStreet: ").append(toIndentedString(addressStreet)).append("\n");
    sb.append("    addressNumber: ").append(toIndentedString(addressNumber)).append("\n");
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

