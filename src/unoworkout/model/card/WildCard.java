package unoworkout.model.card;

public class WildCard implements Card{

    private String type;

    public WildCard(String type) {
        this.type = type;
    }
    @Override
    public String getValue() {
        return type;
    }

    @Override
    public String getCardStatus() {
        return type;
    }

    @Override
    public boolean isColor() {
        return false;
    }

    @Override
    public boolean isAction() {
        return true;
    }
}
