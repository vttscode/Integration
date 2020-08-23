package lt.vytautas.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
@ToString(of = {"id", "uniqCode", "name"})
@EqualsAndHashCode(of = {"id"})
public class Beneficiary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique=true)
    private String uniqCode;
    private String name;

    public Beneficiary() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUniqCode() {
        return uniqCode;
    }

    public void setUniqCode(String uniqCode) {
        String uuidPart = UUID.randomUUID().toString();
        this.uniqCode = uniqCode + uuidPart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;

    }
}
