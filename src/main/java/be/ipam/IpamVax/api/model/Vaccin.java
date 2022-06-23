package be.ipam.IpamVax.api.model;

import java.util.Objects;
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
 * Vaccin
 */
@ApiModel(description = "Vaccin")

public class Vaccin extends RepresentationModel<Vaccin>  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("vaccinId")
  private BigDecimal vaccinId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("ageMin")
  private Integer ageMin;

  @JsonProperty("doseMin")
  private Integer doseMin;

  @JsonProperty("booster")
  private Boolean booster;

  public Vaccin vaccinId(BigDecimal vaccinId) {
    this.vaccinId = vaccinId;
    return this;
  }

  /**
   * vaccin ID
   * @return vaccinId
  */
  @ApiModelProperty(value = "vaccin ID")

  @Valid

  public BigDecimal getVaccinId() {
    return vaccinId;
  }

  public void setVaccinId(BigDecimal vaccinId) {
    this.vaccinId = vaccinId;
  }

  public Vaccin name(String name) {
    this.name = name;
    return this;
  }

  /**
   * vaccin name
   * @return name
  */
  @ApiModelProperty(value = "vaccin name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Vaccin ageMin(Integer ageMin) {
    this.ageMin = ageMin;
    return this;
  }

  /**
   * age min
   * @return ageMin
  */
  @ApiModelProperty(value = "age min")


  public Integer getAgeMin() {
    return ageMin;
  }

  public void setAgeMin(Integer ageMin) {
    this.ageMin = ageMin;
  }

  public Vaccin doseMin(Integer doseMin) {
    this.doseMin = doseMin;
    return this;
  }

  /**
   * dose min
   * @return doseMin
  */
  @ApiModelProperty(value = "dose min")


  public Integer getDoseMin() {
    return doseMin;
  }

  public void setDoseMin(Integer doseMin) {
    this.doseMin = doseMin;
  }

  public Vaccin booster(Boolean booster) {
    this.booster = booster;
    return this;
  }

  /**
   * is booster
   * @return booster
  */
  @ApiModelProperty(value = "is booster")


  public Boolean getBooster() {
    return booster;
  }

  public void setBooster(Boolean booster) {
    this.booster = booster;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vaccin vaccin = (Vaccin) o;
    return Objects.equals(this.vaccinId, vaccin.vaccinId) &&
        Objects.equals(this.name, vaccin.name) &&
        Objects.equals(this.ageMin, vaccin.ageMin) &&
        Objects.equals(this.doseMin, vaccin.doseMin) &&
        Objects.equals(this.booster, vaccin.booster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaccinId, name, ageMin, doseMin, booster);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vaccin {\n");
    
    sb.append("    vaccinId: ").append(toIndentedString(vaccinId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ageMin: ").append(toIndentedString(ageMin)).append("\n");
    sb.append("    doseMin: ").append(toIndentedString(doseMin)).append("\n");
    sb.append("    booster: ").append(toIndentedString(booster)).append("\n");
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

