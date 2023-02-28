package com.userdep.userdep.entiites;

import jakarta.persistence.*;

@Entity
@Table(name="tb_department")
public class Department {
    //Atributos da classe e suas anotações
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;

    // Construtor  da clase
    public Department(){
    }

    //Metodos Acessores da classe
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
}
