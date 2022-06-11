public class Main {
    public static void main(String[] args) {
        
    }

    //Create Class
    class Student {
        //Create Attributes
        String name;
        int age;
        String address;
        String phone;
        String email;
    }
    Student (){
        this.name = "";
        this.age = 0;
        this.address = "";
        this.phone = "";
        this.email = "";
    }
    Student (String name, int age, String address, String phone, String email){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    Student student1 = new Student();
    System.out.println(student1.name);
}
