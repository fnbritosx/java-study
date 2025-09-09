package devbrito.marathonjava.javacore.association.domain;

public class School {
    private String name;
    private Teacher[] teachers;

    public School(String name) {
        this.name = name;
    }

    public School(String name, Teacher[] teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public void schoolPrinter() {
        System.out.println(name);
        if (teachers != null) {
            for (Teacher teacher : teachers) {
                System.out.println(teacher.getName());
            }
        }
    }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }
    }


