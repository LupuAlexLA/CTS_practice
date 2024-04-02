package practiceInainteDeTest1._00_ChatGPT_sameProblems._05_Builder;

import java.util.List;

public interface AbstractServicePackage {
    String getProjectType();
    List<String> getTechnologiesUsed();
    int getSupportDurationMonths();
    String getSupportLevel();
    List<String> getTrainingTypes();
    int getTrainingDurationDays();
    float getTotalPrice();
}
