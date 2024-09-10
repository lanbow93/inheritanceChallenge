
import java.time.LocalDateTime;


public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public Worker(String name, String birthDate){
        this(name, birthDate, "N/A");
    }



    public int getAge(){
        int currentYear = LocalDateTime.now().getYear();
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return currentYear - birthYear;
    }

    public double collectPay(){
        return 100.00;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    
}
