package org.learn.model;

import java.util.Arrays;

public class ExtensionsCategory {
    private String category;
    private String[] extensions;

    public ExtensionsCategory(String category, String[] extensions) {
        this.category = category;
        this.extensions = extensions;
    }

    public String getCategory() {
        return category;
    }

    public String[] getExtensions() {
        return extensions;
    }

    public boolean contains(String extension){
        return Arrays.asList(extensions).contains(extension);
    }
}
