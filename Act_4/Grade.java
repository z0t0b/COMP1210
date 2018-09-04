/**
 * This program calculates the user's COMP 1210 grade
 * based on user input.
 *
 * Activity 4B
 * 9/30/17
 */
public class Grade {

   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   
   // Declares all variables.
   private double exam1, exam2, finalExam;
   private double activityAvg;
   private double quizAvg;
   private double projectAvg;
   private String studentName;
   
   /**
    * Declares all constants.
    */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private static final double EXAM_WEIGHT = 0.15, FINAL_WEIGHT = 0.30,
      ACT_WEIGHT = 0.05, QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   
   /**
    * Creates constructor class "Grade".
    * @param studentNameIn for studentName.
    */
   public Grade(String studentNameIn) {
      studentName = studentNameIn;
   }

   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   
   /**
    * Sets lab averages.
    * @param activityAvgIn for activityAvg.
    * @param quizAvgIn for quizAvg.
    */
   public void setLabAverages(double activityAvgIn, double quizAvgIn) {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
   
   /**
    * Sets project average.
    * @param projectAvgIn for projectAvg.
    */
   public void setProjectAvg(double projectAvgIn) {
      projectAvg = projectAvgIn;
   }
   
   /**
    * Sets exam scores.
    * @param examType for if statements.
    * @param examScoreIn for exam1, exam2, or finalExam.
    */
   public void setExamScore(int examType, double examScoreIn) {
      if (examType == EXAM_1) {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2) {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL) {
         finalExam = examScoreIn;
      }
   
   }
   
   /**
    * Calculates grade.
    * @return grade.
    */
   public double calculateGrade() {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
         + finalExam * FINAL_WEIGHT
         + activityAvg * ACT_WEIGHT
         + quizAvg * QUIZ_WEIGHT
         + projectAvg * PROJ_WEIGHT;
      return grade;
   }
   
   /**
    * Prints name and grade to the screen.
    * @return studentName, calculateGrade().
    */
   public String toString() {
      return "Name: " + studentName + "\n"
         + "Course Grade: " + calculateGrade();
   }
   
}