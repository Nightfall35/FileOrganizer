package org.learn.model;

public class FileItem implements Item {
    private final String name;
    private final String path;
    private final String extension;

    public FileItem(String name, String path, String extension) {
        this.name = name;
        this.path = path;
        this.extension = extension;
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
}
