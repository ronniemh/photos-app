package dev.ronniemoncayo.photoapp.api.users.PhotosAppApiUsers.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * CreateUserRequestModel
 */
public class CreateUserRequestModel {

    @NotNull(message = "first name can not be null")
    @Size(min = 2, message = "First name must not be less than twi characters")
    private String firstName;

    @NotNull(message = "last name can not be null")
    @Size(min = 2, message = "Last name must not be less than twi characters")
    private String lastName;

    @NotNull(message = "Password can not be null")
    @Size(min = 2, max = 16, message = "Password must be equal or grater than 8 characters and less than 16 characters.")
    private String password;

    @NotNull(message = "Email can not be null")
    @Email
    private String email;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}