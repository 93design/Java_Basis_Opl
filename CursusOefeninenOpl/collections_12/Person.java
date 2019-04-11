package collections.collections_12;

public class Person implements Comparable<Person>{
   private String firstName;
   private String lastName;
   private GenderType gender;
   
   private int age;
   private float weight;
   private float height;
   
   public Person() {
   }
   
   public Person(String firstName, String lastName, GenderType gender, int age,
         float weight, float height) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.gender = gender;
      this.age = age;
      this.weight = weight;
      this.height = height;
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

   public GenderType getGender() {
      return gender;
   }

   public void setGender(GenderType gender) {
      this.gender = gender;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public float getWeight() {
      return weight;
   }

   public void setWeight(float weight) {
      this.weight = weight;
   }

   public float getHeight() {
      return height;
   }

   public void setHeight(float height) {
      this.height = height;
   }

   @Override
   public String toString() {
      return String
            .format(
                  "Person [firstName=%s, lastName=%s, gender=%s, age=%s, weight=%s, height=%s]",
                  firstName, lastName, gender, age, weight, height);
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + age;
      result = prime * result
            + ((firstName == null) ? 0 : firstName.hashCode());
      result = prime * result + ((gender == null) ? 0 : gender.hashCode());
      result = prime * result + Float.floatToIntBits(height);
      result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
      result = prime * result + Float.floatToIntBits(weight);
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Person other = (Person) obj;
      if (age != other.age)
         return false;
      if (firstName == null) {
         if (other.firstName != null)
            return false;
      } else if (!firstName.equals(other.firstName))
         return false;
      if (gender != other.gender)
         return false;
      if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
         return false;
      if (lastName == null) {
         if (other.lastName != null)
            return false;
      } else if (!lastName.equals(other.lastName))
         return false;
      if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
         return false;
      return true;
   }

   @Override
   public int compareTo(Person o) {
      // TODO Auto-generated method stub
      return this.getLastName().compareTo(o.getLastName());
   }

}
