package _00_RecapTest.factory.classes;

public class OptionFactory implements AbstractOptionFactory {
    @Override
    public Subscription createOption(String optionType) {
        switch (optionType) {
            case "X" -> {
                return new OptionX();
            }
            case "Y" -> {
                return new OptionY();
            }
            case "Z" -> {
                return new OptionZ();
            }
            default -> {
                return null;
            }
        }
    }
}
