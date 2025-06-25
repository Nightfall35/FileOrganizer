package org.learn.model;

import java.nio.file.Path;
import java.util.Objects;

public class DirectoryItem implements Item{
    private final String name;
    private final String path;
    private final String extension;

    public DirectoryItem(String name, String path, String extension) {
        this.name = Objects.requireNonNull(name,"Name cannot be null");
        this.path = Objects.requireNonNull(path,"Path cannot be null");
        this.extension = extension != null ? extension :"";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String getExtension() {
        return extension;
    }

    @Override
    public String toString() {
        return "DirectoryItem{" +
                "name="+path +'\''+
                ", path="+path +
                ",extension='"+ extension +'\''+
                '}';
    }

    @Override 
    public boolean equals(Object o) {
        if(this == 0) return true;
        if(!(o instanceof DirectoryItem that)) return false;
        return name.equals(that.name) &&
               path.equals(that.path) &&
               extension.equals(that.extension);
    }

    @Override 
    public int hashCode() {
        return Objects.hash(name, path, extension);
    }
}
