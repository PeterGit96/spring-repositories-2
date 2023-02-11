package co.develhope.springrepositories2.entities;

import javax.persistence.*;

@Entity
@Table(name = "programming_language")
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private Integer firstAppearance;
    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage() { }

    public ProgrammingLanguage(Long id, String name, Integer firstAppearance, String inventor) {
        this.id = id;
        this.name = name;
        this.firstAppearance = firstAppearance;
        this.inventor = inventor;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getFirstAppearance() {
        return firstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

}