package unoworkout.model.card;

public class ColorCard implements Card {

    private Color color;
    private String value;

    public ColorCard(Color color, String value) {
        this.color= color;
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getCardStatus() {
        return color.toString()+ " " + value;
    }

    @Override
    public boolean isColor() {
        return true;
    }

    @Override
    public boolean isAction() {
        return (value == "SKIP" ||
            value == "REVERSE" ||
            value == "DRAW 2");
    }
}
