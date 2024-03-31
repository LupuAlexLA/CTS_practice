package _00_ChatGPT_sameProblems._05_Builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> tehnologiesUsed = new ArrayList<>();
        tehnologiesUsed.add("dotnet");
        tehnologiesUsed.add("angular");

        Builder builder = new Builder();
        builder.addProjectType("ASP").addtehnologiesUsed(tehnologiesUsed);
        Package aPackage = builder.build();

        System.out.println(aPackage);
    }
}
