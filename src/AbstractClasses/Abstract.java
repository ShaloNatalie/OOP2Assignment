package AbstractClasses;

public class Abstract {
    public static void main(String[] args) {

        Admin currentAdmin = new Admin(3456, "Natalie", "nasimiyu2006");

        User currentUser = new User(8899, "Warren");

        currentAdmin.performOperation(new Update());

        currentUser.performOperation(new View());


    }
}