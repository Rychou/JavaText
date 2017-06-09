package Review.Night;

public class Worker {
    private String name;
    private int age;
    private double salary;
    public Worker(String name,int age ,double salary){
        this.name =name;
        this.age=age;
        this.salary =salary;
    }

    @Override

    public boolean equals(Object o){
        if (o == null)
            return false;
        if (!(o instanceof Worker))
            return false;
        Worker w = (Worker)o;
        if (this.name == w.name && this.age == w.age)
            return true;
        else return false;
    }

    @Override
    public int hashCode(){
        return Integer.parseInt(this.name.hashCode()+ "" +this.age);
    }
    @Override
    public String toString(){
        return name +" "+age+" "+salary;
    }
}
