package _00_ChatGPT_sameProblems._05_Builder;

import java.util.List;

public class Builder {
    private String projectType;
    private List<String> tehnologiesUsed;
    private int supportDurationMonths;
    private String supportLevel;
    private List<String> trainingTypes;
    private int trainingDurationDays;
    private float totalPrice;

    Builder addProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }

    Builder addtehnologiesUsed(List<String> tehnologiesUsed) {
        this.tehnologiesUsed = tehnologiesUsed;
        return this;
    }

    Package build() {
        return new Package(projectType, tehnologiesUsed, supportDurationMonths, supportLevel,
                trainingTypes, trainingDurationDays, totalPrice);
    }
}
