import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyClassLoader  extends ClassLoader{
    private String nameClass;
    private Path filePath;

    public MyClassLoader (String nameClass, Path filePath){
        this.nameClass = nameClass;
        this.filePath = filePath;
    }

    @Override
    public Class findClass(String nameClass) throws ClassNotFoundException {
       if (nameClass.equals(this.nameClass)) {
           try {
               return defineClass(nameClass, Files.readAllBytes(this.filePath), 0, Files.readAllBytes(this.filePath).length);
           } catch (IOException e) {
               e.printStackTrace();
           }
       } else {
           throw new ClassNotFoundException(nameClass);
       }
       return null;
    }



}
