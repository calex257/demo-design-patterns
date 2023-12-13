package builder;

public class User {
    int age;
    String firstName;
    String lastName;
    boolean isAdmin;
    String nationality;

    public User(int age, String firstName, String lastName, boolean isAdmin, String nationality) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isAdmin=" + isAdmin +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public static class UserBuilder {
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

}
