package Knio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTeste02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("minhapasta/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();


        System.out.println("creationTime " + creationTime);
        System.out.println("lasModifiedTime " + lastModifiedTime);
        System.out.println("lasAccessTime " + lastAccessTime);
        System.out.println("---------------------");

        BasicFileAttributeView FileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        FileAttributeView.setTimes(lastModifiedTime, newCreationTime, lastAccessTime);


        creationTime = FileAttributeView.readAttributes().creationTime();
        lastModifiedTime = FileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = FileAttributeView.readAttributes().lastAccessTime();


        System.out.println("creationTime " + creationTime);
        System.out.println("lasModifiedTime " + lastModifiedTime);
        System.out.println("lasAccessTime " + lastAccessTime);

    }
}
