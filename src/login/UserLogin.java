package login;

public class UserLogin {
    private String name;
    private String validName;
    private String password;
    private String validPassword;

    public UserLogin(String name, String password, String validName, String validPassword) {
        this.name = name;
        this.password = password;
        this.validName = validName;
        this.validPassword = validPassword;
    }

    public String getName() {
        return name;
    }

    public String getValidName() {
        return validName;
    }

    public String getPassword() {
        return password;
    }

    public String getValidPassword() {
        return validPassword;
    }


    public void register() {
    
        if (name.equals(validName) && password.equals(validPassword)) {
            System.out.println("User registered successfully!");
        } else {
            System.out.println("Name or password do not match.");
        }
    }

}