package model;

public class Classes {
    private String id;
    private String description;

    @Override
    public String toString() {
        return "Classes{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Classes() {
    }

    public Classes(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
