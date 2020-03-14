public class MVC_Main {
    public static void main(String[] args) {

        // Fetches the student record based on his/her roll number from the database.
        MVC_Model model = retriveStudentFromDatabase();

        // Creates a view to write student name and number on console.
        MVC_View view = new MVC_View();

        MVC_Controller controller = new MVC_Controller(model, view);

        controller.updateView();

        // Updates the model data.
        controller.setStudentName("Tom");
        controller.updateView();
    }

    // Returns students names and roll numbers.
    private static MVC_Model retriveStudentFromDatabase() {
        MVC_Model student = new MVC_Model();
        student.setName("Coleman");
        student.setRollNo("1");
        return student;
    }
}