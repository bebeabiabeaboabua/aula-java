
public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    public double missingPoints(){
        return 60 - finalGrade();
    }

    public String pass(){
        if(finalGrade() >= 60){
            return "PASS";
        }else{
            return "FAILED\nmissing "+missingPoints()+" points";
        }
    }

    public String mensagem(){
        String mensagem = name+"\nFinal grade: "+finalGrade()+"\n"+pass();
        return mensagem;
    }
    
}
