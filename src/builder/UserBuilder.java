package builder;

public class UserBuilder {
    private int age;
    private String firstName;
    private String lastName;
    private boolean isAdmin;
    private String nationality;

    public UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setAdmin(boolean admin) {
        isAdmin = admin;
        return this;
    }

    public UserBuilder setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public User build() {
        return new User(age, firstName, lastName, isAdmin, nationality);
    }
}
