package com.kbs.OneToMany.OneToManyRelationship.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "extensionType")
    private String extensionType;
    @Column(name = "fileSize")
    private double fileSize;
    //there can be many files to one folder
    @ManyToOne
    // the file must have a folder before saved to the database
    @JoinColumn(name="folder_id", nullable = false)
    private Folder folder;

    public File(String name, String extensionType, double fileSize, Folder folder) {
        this.name = name;
        this.extensionType = extensionType;
        this.fileSize = fileSize;
        this.folder = folder;
    }

    public File() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtensionType() {
        return extensionType;
    }

    public void setExtensionType(String extensionType) {
        this.extensionType = extensionType;
    }

    public double getfileSize() {
        return fileSize;
    }

    public void setfileSize(double size) {
        this.fileSize = size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
