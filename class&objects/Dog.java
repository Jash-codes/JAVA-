
public class Dog {

        String name;
        int age;
        String breed;
        String color;

        public Dog(String name,int age,String breed,String color){
            this.name = name;
            this.age = age;
            this.breed = breed;
            this.color = color;
        }

        public String getname() {return name;}
        public int getage() {return age;}
        public String getbreed() {return breed;}
        public String getcolor(){return color;}
        
        @Override
        public String toString(){
            return "Name is: " + name + "\n age is " + age + "\n breed is : " + breed + "\n the color is: " + color;
        }

        public static void main(String[] args) {
            
            Dog rocky = new Dog("rocky", 2, "Dashund", "Brown and black");
            System.out.println(rocky);
        }
}
