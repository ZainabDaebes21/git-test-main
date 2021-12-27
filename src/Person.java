public class Person {
    String name;
    String adress;
    String employee;
    int age;
    int phone;


    public Person(String name,String adress, String employee, int age, int phone) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getPhone(){
        return phone;
    }
    
    public void setPhone(int phone){
        this.phone=phone;
    }

}
