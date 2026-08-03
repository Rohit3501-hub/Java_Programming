package OnlineExaminationSystem;

public class MCQ extends Question {
    private int correctOption;
    private int studentAnswer;

    public MCQ(int questionId, String questionTitle, int marks, String difficultLevel, int correctOption, int studentAnswer) {
        super( questionId, questionTitle, marks, difficultLevel);
        this.correctOption = correctOption;
        this.studentAnswer = studentAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println("Question Type : MCQ");
        System.out.println("Question : " + getQuestionTitle());
        System.out.println();
        System.out.println("Option 1");
        System.out.println("Option 2");
        System.out.println("Option 3");
        System.out.println("Option 4");

    }

    @Override
    public void evaluateAnswer() {
        System.out.println("Correct Option : " + correctOption);
        System.out.println("Student Answer : " + studentAnswer);


        if (correctOption == studentAnswer) {
            System.out.println("Answer is Correct");
            System.out.println("Marks Obtained : " + getMarks());
        } else {
            System.out.println("Answer is Incorrect");
            System.out.println("Marks Obtained : 0");
        }
    }
}