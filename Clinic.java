import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            int choice = input.nextInt();

            if (choice == 3) {
                System.out.println("Exiting the clinic...");
                input.close();
                break;
            }

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch(choice){
                case 1:
                    pet = new Dog();
                    petFile.setPetId("P001");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("Aspin");
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("P002");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;
                default:
                    System.out.println("Invalid choice!\n");
                    continue;
            }

            System.out.println("Pet id is " + petFile.getPetId());
            System.out.println("Pet name is " + petFile.getPetName());
            System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
            if (petFile.getPet() instanceof Dog) {
                System.out.println("Breed: " + ((Dog) petFile.getPet()).getBreed());
            } else if (petFile.getPet() instanceof Cat) {
                System.out.println("Number of lives: " + ((Cat) petFile.getPet()).getNoOfLives());
            }
            System.out.println("Communication sound: "+ petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play());
            System.out.println();
        }
    }
}