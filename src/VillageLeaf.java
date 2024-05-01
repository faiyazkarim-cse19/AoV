//Class for shapes
public class VillageLeaf implements VillageComponent{
    String componentName;
    public VillageLeaf(String compName){
        super();
        this.componentName = compName;
    }

    @Override
    public void drawVillage() {
        System.out.println(this.componentName);
    }
}
