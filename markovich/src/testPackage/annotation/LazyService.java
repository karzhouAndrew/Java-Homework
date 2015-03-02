package testPackage.annotation;

@Service(name = "This is Lazy Service")
public class LazyService {

    @Init
    public String lazyInit() throws Exception {
        System.out.println("Lazy init method");
        return null;
    }
}
