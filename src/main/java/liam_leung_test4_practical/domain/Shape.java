package liam_leung_test4_practical.domain;
import liam_leung_test4_practical.ShapeInterface;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author liaml_000
 */
@Entity
public abstract class Shape implements ShapeInterface{

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}