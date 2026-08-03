package OnlineExaminationSystem;

public class main {
   public  static void main(String[] args) {

       MCQ mcq = new MCQ(101, "Which is used to inherit a class in java", 5, "Easy", 1, 1);
       mcq.displayQuestion();
       mcq.evaluateAnswer();
    }
}
