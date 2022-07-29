import com.fasterxml.jackson.annotation.JsonProperty;

public class FactAboutCats {

    private final String id;

    private final String text;

    private final String type;

    private final String user;

    private final Integer upvotes;

    public FactAboutCats(@JsonProperty("id") String id,
                         @JsonProperty("text") String text,
                         @JsonProperty("user") String user,
                         @JsonProperty("upvotes") Integer upvotes,
                         @JsonProperty("type") String type
    ) {
        this.id = id;
        this.text = text;
        this.user = user;
        this.upvotes = upvotes;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + "\n" +
                "Факт: " + getText() + "\n" +
                "Тип животного: " + getType() + "\n" +
                "Имя пользователя: " + getUser() + "\n" +
                "Количество голосов: " + getUpvotes() + "\n";
    }
}
