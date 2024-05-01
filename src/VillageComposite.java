import java.util.ArrayList;

public class VillageComposite implements VillageComponent{
    ArrayList<VillageComponent> components;
    String componentName;

    VillageComposite(String compName) {
        super();
        this.components = new ArrayList<>();
        this.componentName = compName;
    }

    void addComponent(VillageComponent component) {
        this.components.add(component);
    }

    @Override
    public void drawVillage() {
        System.out.println(componentName);
        for (VillageComponent component : components) {
            component.drawVillage();
        }
    }
}
