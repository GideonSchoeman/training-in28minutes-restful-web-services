package com.gsc.rest.webservices.test.restfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*@ApiModel:
 * Provides additional information about Swagger models.
 * Use @ApiModel to change the name of the model and add a description to it.
 *
 * To support polymorphism and inheritance, we use the discriminator and the subTypes fields. Both must be used for the Swagger output to be valid.
 */
@ApiModel(description="All details about the user. ")
public class User {
    private Integer id;

    @Size(min=2, message="Name should have at least 2 characters")
/*@ApiModelProperty:
 *   Adds and manipulates data of a model property.
 *   The @ApiModelProperty allows controlling Swagger-specific definitions such as allowed values, and additional notes.
 *   It also offers additional filtering properties in case you want to hide the property in certain scenarios.
 */
	@ApiModelProperty(notes="Name should have atleast 2 characters")
    private String name;

    @Past
	@ApiModelProperty(notes="Birth date should be in the past")
    private Date birthDate;

	protected User() {

	}

    public User(Integer id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, birthDate=%s]", id, name, birthDate);
	}

}
