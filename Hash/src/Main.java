import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        // put in random index ------->
        examScores.put("Math", 75);
        examScores.put("Science", 95);
        examScores.put("Bio", 40);

        examScores.putIfAbsent("Math", 70);

        System.out.println(examScores.toString());

        System.out.println(examScores.get("Math"));

        System.out.println(examScores.getOrDefault("Social", -1));

//        examScores.clear();
//        examScores.size();
        examScores.remove("Bio");
        System.out.println(examScores.toString());

        System.out.println(examScores.containsKey("Math"));

        examScores.forEach((subject, score) -> {
            System.out.println(subject + " - " + score);
        });
    }
}