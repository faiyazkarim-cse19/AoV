public class Main {
    public static void main(String[] args) {
        VillageLeaf brickHouse = new VillageLeaf("Brick House");
        VillageLeaf mangoTree = new VillageLeaf("Mango Tree");
        VillageLeaf swimmingPool = new VillageLeaf("Swimming Pool");
        VillageLeaf mudHouse = new VillageLeaf("Mud House");
        VillageLeaf bananaTree = new VillageLeaf("Banana Tree");
        VillageLeaf pond = new VillageLeaf("Pond");


        // Define composite components (villages)
        VillageComposite allVillages = new VillageComposite("All Villages:");

        VillageComposite village1 = new VillageComposite("Village 1:");
        village1.addComponent(brickHouse);
        village1.addComponent(mangoTree);
        village1.addComponent(swimmingPool);

        VillageComposite village2 = new VillageComposite("Village 2:");
        village2.addComponent(mudHouse);
        village2.addComponent(bananaTree);
        village2.addComponent(pond);

        allVillages.addComponent(village1);
        allVillages.addComponent(village2);

        village1.drawVillage();
        System.out.println("------------------");
        village2.drawVillage();
        System.out.println("------------------");
        allVillages.drawVillage();
    }
}