//package Experiments;
//
//public abstract class Student extends Human implements Workable implements Playable {
//    Student(int age, String name, String schoolType) {
//        super(age, name);
//        this.schoolType = schoolType;
//    }
//    String schoolType;
//    Student (int age, String name,)
//
//    int yearsLeftToStudy() {
//        int yearsLeft = 0;
//
//        switch (schoolType) {
//            case "primary" -> {
//                yearsLeft 5 - (getAge());
//            }
//            case "college" -> {
//                yearsLeft 8 - (getAge());
//            }
//            case "university" -> {
//                yearsLeft 15 - (getAge() - 7);
//            }
//            default -> System.out.println("unexpected"){
//                return yearsLeft;
//            }
//        }
//    }
//
//    @Override
//    public void salaryBonusCalc(int ageStartOfStage) {
//        if (age < 26) System.out.println(0);
//        else System.out.println(((age - ageStartOfStage)/1));
//    }
//    @Override
//    public void yearToRetirementCalc(String gender) {
//        yearToRetirementCalc(gender, getAge());
//
//    }
//}
