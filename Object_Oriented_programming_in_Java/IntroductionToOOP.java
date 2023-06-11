public class Car {
        private String make = "China";
        private String model = "A03";
        private String color = "Grey";
        private int doors = 27;
        private boolean convertible = true;

        // How to use the Getter Class
        public String getmake(){
                return make;
        }

        public String getModel() {
                return model;
        }

        public String getColor() {
                return color;
        }

        public int getDoors() {
                return doors;
        }

        public boolean isConvertible() {
                return convertible;
        }

        // How to use the Setter classes
        public void setMake(String make){
                if (make == null) make = "Unknown";
                String lowercaseMake = make.toLowerCase();
                switch (lowercaseMake) {
                        case "holden", "range rover", "benz" -> this.make = make;
                        default -> {
                                this.make = "Unsupported";
                        }
                }
        }

        public void setModel(String model) {
                this.model = model;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public void setDoors(int doors) {
                this.doors = doors;
        }

        public void setConvertible(boolean convertible) {
                this.convertible = convertible;
        }

        public void describeCar(){
            System.out.println(doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
        }

}


public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.describeCar();
        car.setMake("benz");
        System.out.println("Make = " + car.getmake());
//        System.out.println("color " + car.getColor());
//        System.out.println("Door " + car.getDoors());


    }
}
