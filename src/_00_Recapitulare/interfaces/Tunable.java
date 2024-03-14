package _00_Recapitulare.interfaces;

public interface Tunable {
    int upgradeStage();

    default boolean isTunable() {
        return true;
    }
}
