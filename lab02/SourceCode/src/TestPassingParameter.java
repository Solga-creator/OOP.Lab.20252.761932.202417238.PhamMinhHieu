/**
 * 1) Pass-by-value: swap vs changeTitle (references).
 * 2) DigitalVideoDisc constructor overloads (lab section 8).
 * Run from {@code src}: {@code javac DigitalVideoDisc.java TestPassingParameter.java && java TestPassingParameter}
 */
public class TestPassingParameter {

    public static void main(String[] args) {
        runSwapAndChangeTitleDemo();
        testDigitalVideoDiscConstructors();
    }

    static void runSwapAndChangeTitleDemo() {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc(
                "Jungle", "Adventure", "Someone", 120, 10.0);

        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc(
                "Cinderella", "Animation", "Disney", 90, 12.0);

        System.out.println("--- Before swap ---");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        swap(jungleDVD, cinderellaDVD);

        System.out.println("\n--- After swap (references in main unchanged) ---");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());

        System.out.println("\n--- After changeTitle(jungleDVD, cinderellaDVD.getTitle()) ---");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        DigitalVideoDisc temp = dvd1;
        dvd1 = dvd2;
        dvd2 = temp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        dvd.setTitle(title);
    }

    static void testDigitalVideoDiscConstructors() {
        System.out.println("\n========== DigitalVideoDisc: constructor tests ==========");

        DigitalVideoDisc byTitle = new DigitalVideoDisc("Only title set");
        printDvd("Constructor (String title)", byTitle);

        DigitalVideoDisc byCategoryTitleCost = new DigitalVideoDisc("Animation", "Aladin", 18.99);
        printDvd("Constructor (String category, String title, double cost)", byCategoryTitleCost);

        DigitalVideoDisc byDirectorCategoryTitleCost = new DigitalVideoDisc(
                "George Lucas", "Science Fiction", "Star Wars", 24.95);
        printDvd("Constructor (String director, String category, String title, double cost)",
                byDirectorCategoryTitleCost);

        DigitalVideoDisc full = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        printDvd("Constructor (String title, String category, String director, int length, double cost)", full);
    }

    static void printDvd(String label, DigitalVideoDisc d) {
        System.out.println(label);
        System.out.println("  title=" + d.getTitle()
                + " | category=" + d.getCategory()
                + " | cost=" + d.getCost()
                + " | director=" + d.getDirector()
                + " | length=" + d.getLength());
    }
}
