package testPackage.annotation;

@Service(name = "Super Simple Service")
public class SimpleService {

    @Init
    public String initService() {
        System.out.println("Init service class");
        return null;
    }

    public String simpleMethod() {
        System.out.println("Just a simple class method");
        return null;
    }
}
