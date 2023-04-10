package en.codegym.task.pro.task06.task0610;

public class Solution {
    public static void main(String[] args) {
        Person person = new Person("John", "Dane");
        System.out.println("Dossier:");
        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("Full name: " + person.getFullName());

    }
    public static class Person {
        private String firstName;
        private String lastName;
        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getFullName() {
            return firstName + " " + lastName;
        }
        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
}
