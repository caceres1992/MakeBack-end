package com.make.miracle.backend.dto;

public class Instituciones {
    private Long id;
    private String type_institution;
    private String name;
    private int total;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType_institution() {
        return type_institution;
    }

    public void setType_institution(String type_institution) {
        this.type_institution = type_institution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
