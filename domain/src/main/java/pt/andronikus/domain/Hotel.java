package pt.andronikus.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private int classification;
    private boolean isOpen;

    protected Hotel(){}

    public Hotel(String name, int classification, boolean isOpen){
        this.name = name;
        this.classification = classification;
        this.isOpen = isOpen;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getClassification() {
        return classification;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
