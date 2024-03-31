package _00_ChatGPT_sameProblems._05_Builder;

import java.util.List;

public class Package implements AbstractServicePackage {
    private String projectType;
    private List<String> tehnologiesUsed;
    private int supportDurationMonths;
    private String supportLevel;
    private List<String> trainingTypes;
    private int trainingDurationDays;
    private float totalPrice;

    public Package() {
    }

    public Package(String projectType, List<String> tehnologiesUsed, int supportDurationMonths, String supportLevel,
                   List<String> trainingTypes, int trainingDurationDays, float totalPrice) {
        this.projectType = projectType;
        this.tehnologiesUsed = tehnologiesUsed;
        this.supportDurationMonths = supportDurationMonths;
        this.supportLevel = supportLevel;
        this.trainingTypes = trainingTypes;
        this.trainingDurationDays = trainingDurationDays;
        this.totalPrice = totalPrice;
    }

    @Override
    public String getProjectType() {
        return projectType;
    }

    @Override
    public List<String> getTechnologiesUsed() {
        return tehnologiesUsed;
    }

    @Override
    public int getSupportDurationMonths() {
        return supportDurationMonths;
    }

    @Override
    public String getSupportLevel() {
        return supportLevel;
    }

    @Override
    public List<String> getTrainingTypes() {
        return trainingTypes;
    }

    @Override
    public int getTrainingDurationDays() {
        return trainingDurationDays;
    }

    @Override
    public float getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Package{" +
                "projectType='" + projectType + '\'' +
                ", tehnologiesUsed=" + tehnologiesUsed +
                ", supportDurationMonths=" + supportDurationMonths +
                ", supportLevel='" + supportLevel + '\'' +
                ", trainingTypes=" + trainingTypes +
                ", trainingDurationDays=" + trainingDurationDays +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
