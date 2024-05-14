public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Car car1 = new Car("red", "BMW", 5);
<<<<<<< HEAD
        Car car2 = new Car("green", "Audi", 3);
        Car car3 = new Car("cyan", "Mercedes", 3)

        Car car4 = new Car("yellow", "Renault", 4);

        //An dieser Stelle befindet sich nun ein Array
        //Dieses Array wird mit einem Sortieralgorithmus sortiert
        //Optimaler Code Yippie
=======
        Car car2 = new Car("green", "Audi", 3);
        Car car3 = new Car("cyan", "Mercedes-Benz", 3);
>>>>>>> merge-conflict

        factory.buildCar(car1);
        factory.buildCar(car2);

    }
}

