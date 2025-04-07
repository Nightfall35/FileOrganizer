package org.learn.varient;

import org.learn.model.DirectoryItem;
import org.learn.model.FileItem;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class AbstractFileOrganizer {
    protected final List<DirectoryItem> directoryItems = new ArrayList<>();
    protected final List<FileItem> fileItems = new ArrayList<>();

    public void addItems(File dir) {
        for (var file : Objects.requireNonNull(dir.listFiles())) {
            if (file.isDirectory())
                directoryItems.add(new DirectoryItem(
                                file.getName(),
                                file.getPath(),
                                getFullExtension(file.getName())
                        )
                );
            else
                fileItems.add(new FileItem(
                                file.getName(),
                                file.getPath(),
                                getFullExtension(file.getName())
                        )
                );
        }
    }

    private static String getFullExtension(String fileName) {
        String[] parts = fileName.split("\\.");
        if (parts.length > 1) {
            return String.join(".", Arrays.copyOfRange(parts, 1, parts.length)).toLowerCase();
        }
        return "";
    }

    protected boolean hasSameName(File dir, String category){
        return category.equals(dir.getName());
    }

    public abstract void moveFiles();

}
