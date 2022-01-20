import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String name = "HelloClass";
        Path path = Path.of("D:\\MyFolder\\15 Lesson Java Core\\Lab1\\out\\production\\Lab1\\HelloClass.class");
       MyClassLoader myClassLoader = new MyClassLoader(name,path);
        System.out.println(myClassLoader.findClass(name));
    }
}
