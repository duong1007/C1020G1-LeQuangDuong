package abstract_class_and_interface.thuc_hanh.animal_and_interface_edible.animal;


import abstract_class_and_interface.thuc_hanh.animal_and_interface_edible.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "gâu gâu";
    }

    @Override
    public String howToEat() {
        return "Meet";
    }
}
