package Practice4.Memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Memento mem = new Memento();
        Character character = new Character("Kazuma", "Fighter", "Human");
        Stats stats = Stats.generate();
        character.setAttributes(stats);
        character.printSheet();
        System.out.println();

        stats = Stats.generate();
        stats.print();
        System.out.println();
        mem.setState(stats);
        careTaker.add(mem);

        stats = Stats.generate();
        stats.print();
        System.out.println();
        mem.setState(stats);
        careTaker.add(mem);

        mem = careTaker.get(0);
        stats = mem.getState();
        stats.print();
        System.out.println();

        mem = careTaker.get(1);
        stats = mem.getState();
        stats.print();
        System.out.println();

        character.setAttributes(stats);
        character.printSheet();
    }
}
