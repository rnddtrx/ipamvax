package be.ipam.IpamVax.api.model;

import java.util.Objects;
import be.ipam.IpamVax.api.model.People;
import be.ipam.IpamVax.api.model.VaxCentre;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.hateoas.RepresentationModel;

/**
 * Schedule
 */
@ApiModel(description = "Schedule")

public class PeopleSchedule extends RepresentationModel<PeopleSchedule>  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("scheduleId")
  private BigDecimal scheduleId;

  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("people")
  private People people;

  @JsonProperty("vaxCentre")
  private VaxCentre vaxCentre;

  public PeopleSchedule scheduleId(BigDecimal scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  /**
   * Schedule ID
   * @return scheduleId
  */
  @ApiModelProperty(value = "Schedule ID")

  @Valid

  public BigDecimal getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(BigDecimal scheduleId) {
    this.scheduleId = scheduleId;
  }

  public PeopleSchedule startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Start Time
   * @return startTime
  */
  @ApiModelProperty(value = "Start Time")


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public PeopleSchedule people(People people) {
    this.people = people;
    return this;
  }

  /**
   * Get people
   * @return people
  */
  @ApiModelProperty(value = "")

  @Valid

  public People getPeople() {
    return people;
  }

  public void setPeople(People people) {
    this.people = people;
  }

  public PeopleSchedule vaxCentre(VaxCentre vaxCentre) {
    this.vaxCentre = vaxCentre;
    return this;
  }

  /**
   * Get vaxCentre
   * @return vaxCentre
  */
  @ApiModelProperty(value = "")

  @Valid

  public VaxCentre getVaxCentre() {
    return vaxCentre;
  }

  public void setVaxCentre(VaxCentre vaxCentre) {
    this.vaxCentre = vaxCentre;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeopleSchedule peopleSchedule = (PeopleSchedule) o;
    return Objects.equals(this.scheduleId, peopleSchedule.scheduleId) &&
        Objects.equals(this.startTime, peopleSchedule.startTime) &&
        Objects.equals(this.people, peopleSchedule.people) &&
        Objects.equals(this.vaxCentre, peopleSchedule.vaxCentre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleId, startTime, people, vaxCentre);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleSchedule {\n");
    
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
    sb.append("    vaxCentre: ").append(toIndentedString(vaxCentre)).append("\n");
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

