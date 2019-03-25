package local.edeploy.javacore.Xnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributosBasicosTest {
    public static void main(String[] args) throws IOException {
        Date primeiroDeDezembro = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
        File file = new File("folder2\\aquivo.txt");
        file.createNewFile();

        file.setLastModified(primeiroDeDezembro.getTime());

        System.out.println(file.lastModified());
        file.delete();

        Path path = Paths.get("folder2\\aquivo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.fromMillis(primeiroDeDezembro.getTime());
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);

        path = Paths.get("src\\local\\edeploy\\javacore\\Aintroducaoclasses\\classes\\Carro.java");
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));

//        BasicFileAttributes: atributos básicos
//        PosixFileAttributes: manipulação em sistemas baseados em Unix
//        DosFileAttributes:   manipulação em sistemas baseados em Windows

        BasicFileAttributes atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("\nATRIBUTOS BÁSICOS");
        System.out.println(atributosBasicos.creationTime());
        System.out.println(atributosBasicos.lastAccessTime());
        System.out.println(atributosBasicos.lastModifiedTime());
        System.out.println(atributosBasicos.isDirectory());

        System.out.println("\n------------------------------------------");

//        BasicFileAttributeView: alteração atributos básicos
//        PosixFileAttributeView: alteração em sistemas baseados em Unix
//        DosFileAttributeView:   alteração manipulação em sistemas baseados em Windows
//        FileOwnerAttributeView: setar dono de arquivo ou diretório
//        AclFileOwnerAttributeView: permissões avançadas de arquivo ou diretório

        FileTime lastModified = atributosBasicos.lastModifiedTime();
        FileTime created = atributosBasicos.creationTime();
        FileTime lastAcess = FileTime.fromMillis(System.currentTimeMillis());

        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        basicView.setTimes(lastModified, lastAcess, created);

        System.out.println(atributosBasicos.creationTime());
        System.out.println(atributosBasicos.lastAccessTime());
        System.out.println(atributosBasicos.lastModifiedTime());
        System.out.println(atributosBasicos.isDirectory());
    }
}
