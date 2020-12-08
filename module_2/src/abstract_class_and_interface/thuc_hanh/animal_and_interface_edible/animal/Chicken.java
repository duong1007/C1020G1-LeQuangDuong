package abstract_class_and_interface.thuc_hanh.animal_and_interface_edible.animal;

import abstract_class_and_interface.thuc_hanh.animal_and_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "ò ó o o o o o o o o";
    }

    @Override
    public String howToEat() {
        return "fried";
    }
}
