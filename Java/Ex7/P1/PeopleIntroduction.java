class Person {
  private String name;
 public Person(String name) {
   this.name = name;
 }
 public String introduction() {
    return "My name is " + name + ".";
  }
}

class Student extends Person {
  private String id;
  public Student(String name, String id){
    super(name);
    this.id = id;
  }
  public String introduction() {
    return "I am a student. " + super.introduction() + " My ID is "+ id + ".";
  }
}

class EnglishPerson extends Person {
  public EnglishPerson(String name) {
    super(name);
  }
 public String introduction() {
     return "How do you do? " + super.introduction();
  }
}

class EnglishStudent extends Student {
  public EnglishStudent(String name, String id){
      super(name, id);
  }
  public String introduction() {
    return "How do you do? " + super.introduction();
  }
}
class JapanesePerson extends Person {
  public JapanesePerson(String name) {
    super(name);
  }
 public String introduction() {
     return "Hajime mashite. " + super.introduction();
  }
}

class JapaneseStudent extends Student {
  public JapaneseStudent(String name, String id){
      super(name, id);
  }
  public String introduction() {
    return "Hajime mashite? " + super.introduction();
  }
}

public class PeopleIntroduction {
  public static void main(String[] args) {
      Person persons[] = {
			 new Student("Saito","s115333"),
			 new Person("Sato"),
			 new EnglishStudent("Ken","s115336"),
			 new EnglishPerson("Kento"),
			 new JapaneseStudent("Watabe","s115341"), 
			 new JapanesePerson("Watanabe")};

      for(int i = 0 ; i < persons.length ; i++){
        System.out.println(persons[i].introduction());
      }
   }
}
