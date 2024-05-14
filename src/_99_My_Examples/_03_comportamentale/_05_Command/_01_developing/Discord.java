package _99_My_Examples._03_comportamentale._05_Command._01_developing;

import java.util.ArrayList;
import java.util.List;

public class Discord {
    private List<CodeOrder> tasks = new ArrayList<>();

    public void takeTask(CodeOrder task) {
        tasks.add(task);
    }

    public void sendTasks() {
        for(CodeOrder task : tasks) {
            task.code();
        }
        tasks.clear();
    }
}
