class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if(firstName != null){
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if(lastName != null){
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if(!firstName.equals("") && !lastName.equals("")){
            return firstName + " " + lastName;
        } else if (!firstName.equals("") && lastName.equals("")) {
            return firstName;
        } else if (firstName.equals("") && !lastName.equals("")) {
            return lastName;
        } else {
            return "Unknown";
        }
    }
}