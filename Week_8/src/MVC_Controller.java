public class MVC_Controller {
    private MVC_Model model;
    private MVC_View view;
 
    public MVC_Controller(MVC_Model model, MVC_View view){
       this.model = model;
       this.view = view;
    }
 
    public void setStudentName(String name){
       model.setName(name);		
    }
 
    public String getStudentName(){
       return model.getName();		
    }
 
    public void setStudentRollNo(String rollNo){
       model.setRollNo(rollNo);		
    }
 
    public String getStudentRollNo(){
       return model.getRollNo();		
    }
 
    public void updateView(){				
       view.printStudentDetails(model.getName(), model.getRollNo());
    }	
 }