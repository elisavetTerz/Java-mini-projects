package gr.aueb.cf.ch15.accounts.model;

public class IdentifiableEntity {
    private Long id; //long does not have null

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
