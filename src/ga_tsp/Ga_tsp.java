/*
* TSP_GA.java
* Create a tour and evolve a solution
*/

package ga_tsp;

public class Ga_tsp {

    public static void main(String[] args) {

        // Create and add our cities
        City city = new City(10, 75);
        TourManager.addCity(city);
        City city2 = new City(36, 9);
        TourManager.addCity(city2);
        City city3 = new City(91, 78);
        TourManager.addCity(city3);
        City city4 = new City(54, 53);
        TourManager.addCity(city4);
        City city5 = new City(8, 51);
        TourManager.addCity(city5);
        City city6 = new City(78, 51);
        TourManager.addCity(city6);
        City city7 = new City(73, 14);
        TourManager.addCity(city7);
        City city8 = new City(23, 56);
        TourManager.addCity(city8);
        City city9 = new City(15, 40);
        TourManager.addCity(city9);
        City city10 = new City(26, 60);
        TourManager.addCity(city10);
        City city11 = new City(74, 98);
        TourManager.addCity(city11);
        City city12 = new City(91, 16);
        TourManager.addCity(city12);
        City city13 = new City(92, 75);
        TourManager.addCity(city13);
        City city14 = new City(63, 73);
        TourManager.addCity(city14);
        City city15 = new City(95, 16);
        TourManager.addCity(city15);
        City city16 = new City(21, 84);
        TourManager.addCity(city16);
        City city17 = new City(4, 23);
        TourManager.addCity(city17);
        City city18 = new City(41, 29);
        TourManager.addCity(city18);
        City city19 = new City(36, 74);
        TourManager.addCity(city19);
        City city20 = new City(56, 15);
        TourManager.addCity(city20);
        City city21 = new City(14, 18);
        TourManager.addCity(city21);
        City city22 = new City(26, 80);
        TourManager.addCity(city22);
        City city23 = new City(49, 13);
        TourManager.addCity(city23);
        City city24 = new City(24, 94);
        TourManager.addCity(city24);
        City city25 = new City(5, 92);
        TourManager.addCity(city25);
        City city26 = new City(66, 43);
        TourManager.addCity(city26);
        City city27 = new City(48, 26);
        TourManager.addCity(city27);
        City city28 = new City(13, 33);
        TourManager.addCity(city28);
        City city29 = new City(11, 53);
        TourManager.addCity(city29);
        City city30 = new City(47, 65);
        TourManager.addCity(city30);
        City city31 = new City(15, 70);
        TourManager.addCity(city31);
        City city32 = new City(37, 91);
        TourManager.addCity(city32);
        City city33 = new City(63, 54);
        TourManager.addCity(city33);
        City city34 = new City(66, 8);
        TourManager.addCity(city34);
        City city35 = new City(52, 28);
        TourManager.addCity(city35);
        City city36 = new City(61, 34);
        TourManager.addCity(city36);
        City city37 = new City(70, 13);
        TourManager.addCity(city37);
        City city38 = new City(91, 55);
        TourManager.addCity(city38);
        City city39 = new City(36, 60);
        TourManager.addCity(city39);
        City city40 = new City(20, 20);
        TourManager.addCity(city40);
        City city41 = new City(39, 2);
        TourManager.addCity(city41);
        City city42 = new City(29, 90);
        TourManager.addCity(city42);
        City city43 = new City(87, 46);
        TourManager.addCity(city43);
        City city44 = new City(62, 87);
        TourManager.addCity(city44);
        City city45 = new City(70, 92);
        TourManager.addCity(city45);
        City city46 = new City(19, 74);
        TourManager.addCity(city46);
        City city47 = new City(32, 10);
        TourManager.addCity(city47);
        City city48 = new City(81, 84);
        TourManager.addCity(city48);
        City city49 = new City(73, 90);
        TourManager.addCity(city49);

        // Initialize population
        Population pop = new Population(50, true);
        System.out.println("Initial distance: " + pop.getFittest().getDistance());

        // Evolve population for 100 generations
        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 100; i++) {
            pop = GA.evolvePopulation(pop);
        }

        // Print final results
        System.out.println("Finished");
        System.out.println("Final distance: " + pop.getFittest().getDistance());
        System.out.println("Solution:");
        System.out.println(pop.getFittest());
    }
}