package by.tc.task02.entity;


public class SimpleEntity extends Entity {
    private String content;

    public SimpleEntity() {
    }

    public SimpleEntity(String tag) {
        super(tag);
    }

    public SimpleEntity(String tag, String content) {
        super(tag);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        SimpleEntity that = (SimpleEntity) o;

        return content != null ? content.equals(that.content) : that.content == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SimpleEntity{" +
                "content='" + content + '\'' +
                '}';
    }
}
