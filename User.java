package in.udith.database;

class User {

    // Variables
    String name, password;
    int id;

    // Constructor with two parameters - name and password
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // Constructor with three parameters - id and name and password
    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    // Getting id
    public int getId() {
        return id;
    }
    //Setting id
    public void setId(int id) {
        this.id = id;
    }


    // Getting name
    public String getName() {
        return name;
    }
    //Setting name
    public void setName(String name) {
        this.name = name;
    }

    // Getting password
    public String getPassword() {
        return password;
    }
    //Setting name
    public void setPassword(String password) {
        this.password = password;
    }
}
