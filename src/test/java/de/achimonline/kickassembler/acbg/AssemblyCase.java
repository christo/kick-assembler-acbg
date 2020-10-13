package de.achimonline.kickassembler.acbg;

import java.io.File;

class AssemblyCase {
    public AssemblyCase(String project, File source) {
        this.project = project;
        this.source = source;
    }

    private final String project;
    private final File source;
    public String getCaseName() {
        return project + source.getName().replaceAll("\\.\\w+$", "");
    }

    public String getExtension() {
        return source.getName().replaceFirst(".*(\\.\\w+)$", "$1");
    }
    public String getProject() {
        return project;
    }

    public File getSource() {
        return source;
    }
}
