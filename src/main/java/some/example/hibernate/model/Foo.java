package some.example.hibernate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Foo {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private int someField;

    /**
     * This collection is supposed to be populated with all bars that have the
     * same value {@link Bar#getSomeField()} as {@link this#someField}.
     * Both columns {@code some_field} columns exist and should be used for the
     * join (? or subselect?).
     */
    @OneToMany
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Set<Bar> bars;

    public int getId() {
        return id;
    }

    public int getSomeField() {
        return someField;
    }

    public void setSomeField(int someField) {
        this.someField = someField;
    }

    public Set<Bar> getBars() {
        return bars;
    }
}
