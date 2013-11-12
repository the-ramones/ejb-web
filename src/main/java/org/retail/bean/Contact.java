package org.retail.bean;

/**
 *
 * @author the-ramones
 */
public class Contact {

    private String firstname;
    private String lastname;
    private String telephone;
    private String email;

    public Contact() {
    }

    public Contact(String firstname, String lastname, String telephone, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.telephone = telephone;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Contact{" + "firstname=" + firstname + ", lastname=" + lastname + ", telephone=" + telephone + ", email=" + email + '}';
    }
}
