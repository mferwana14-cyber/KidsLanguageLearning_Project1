/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kidslanguagelearning_project1;

/**
 *
 * @author A
 */
public class KidsLanguageLearning_Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    public class Quiz {
    private final int quizID;
    private double score;
       
    
    public Quiz(int quizID) {
        this.quizID = quizID;
        this.score = 0.0;
    }
    
    
    public int getQuizID() { return quizID; }
    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }
 
    }
   

/**
 *
 * @author A
 */
public class QuizView
{
    public void displayResult(Quiz quiz) {
        System.out.println("--- Interactive Quiz Result ---");
        System.out.println("Quiz ID: " + quiz.getQuizID());
        System.out.println("Final Score: " + quiz.getScore() + "%");
        System.out.println("Well done! Keep learning.");
    }
    
    }
   public interface ScoringStrategy {
    
    double calculate(int correctAnswers, int totalQuestions);
}

   public class BeginnerScoring implements ScoringStrategy {

    @Override
    public double calculate(int correctAnswers, int totalQuestions) {
        // حساب بسيط: الدرجة تعتمد فقط على نسبة الإجابات الصحيحة من المجموع
        if (totalQuestions == 0) return 0;
        return (correctAnswers / (double) totalQuestions) * 100;
    } 

    public class QuizController {
    private final Quiz model;
    private final ScoringStrategy strategy;

    public QuizController(Quiz model, ScoringStrategy strategy) {
        this.model = model;
        this.strategy = strategy;
    }

    public void processResult(int correct, int total) {
        double finalScore = strategy.calculate(correct, total);
        model.setScore(finalScore); 
   
   public class MainApp {
    {
        
        Quiz myQuiz = new Quiz(501);

        ScoringStrategy beginnerStrategy = (ScoringStrategy) new BeginnerScoring();

        QuizController controller = new QuizController(myQuiz, beginnerStrategy);

        controller.processResult(8, 10);

        QuizView view = new QuizView();
        view.displayResult(myQuiz);
    }


    
    
}
