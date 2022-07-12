package Experiments;

abstract class Human {
    int age;
    String name;

    Human(){
        age = 0;
        name = "undefined";
    }
    Human(int age, String name){
        this.age = age;
        this.name = name;
    }
    void salaryBonusCalc(int ageStartOfStage){
        if (age<26) System.out.println(0);
        else System.out.println(((age - ageStartOfStage )/10)*1000);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
        else System.out.println("Incorrectly ");
    }
}
