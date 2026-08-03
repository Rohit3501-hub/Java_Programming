package OnlineExaminationSystem;

public class CodingQuestion extends Question {
    private String programmingLanguage;
    private int testCasesPassed;
    private int totalTestCases;

    public CodingQuestion(int questionId, String questionTitle, int marks, String difficultLevel, String programmingLanguage, int testCasesPassed, int totalTestCases) {
        super(questionId, questionTitle, marks, difficultLevel);
        this.programmingLanguage = programmingLanguage;
        this.testCasesPassed = testCasesPassed;
        this.totalTestCases = totalTestCases;
    }

    @Override
    public void displayQuestion() {
        System.out.println("Question type : " + getQuestionId());
        System.out.println("Question Language :" + getDifficultLevel());
        System.out.println("Question Title : " + getQuestionTitle());
        System.out.println("Marks : " + getMarks());
        System.out.println("Programming Language : " + programmingLanguage);
        System.out.println("Test Cases Passed : " + testCasesPassed);
        System.out.println("Total Test Cases : " + totalTestCases);
    }

    @Override
    public void evaluateAnswer() {
        double score = ((double) testCasesPassed / totalTestCases) * getMarks();
        System.out.println("Score for this coding question: " + score);

    }
}
