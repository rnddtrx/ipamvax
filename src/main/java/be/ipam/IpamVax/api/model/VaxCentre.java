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
        Objects.equals(this.peopleSchedules, vaxCentre.peopleSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaxCentreId, peopleSchedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaxCentre {\n");
    
    sb.append("    vaxCentreId: ").append(toIndentedString(vaxCentreId)).append("\n");
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

