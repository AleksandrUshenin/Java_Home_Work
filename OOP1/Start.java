package OOP1;

/**
 * Start
 */
public class Start {
    public static void main(String[] args) {
        TreeFamily<People> treeFamily = new TreeFamily<>();
        treeFamily.add(new Men("Василий", "Пупкин", null, null));
        Women women = new Women("Оля", "НеПупкина", null, null);
        treeFamily.wedding(treeFamily.getListPeople().get(0), women);
        treeFamily.makeChildren(treeFamily.getListPeople().get(0), women,"Лена", "Андрей");

        System.out.println(treeFamily.getListPeople());

        treeFamily.growChild((Child)treeFamily.getListPeople().get(0).getChildrens().get(0));

        System.out.println(treeFamily.getListPeople());

        treeFamily.funeral(women);

        System.out.println(treeFamily.getListPeople());

        treeFamily.makeChildren(treeFamily.getListPeople().get(0), women,"Аня", "Александр");

        System.out.println(treeFamily.getListPeople());

        women = new Women("Катя", "НеПупкина", null, null);

        treeFamily.wedding(treeFamily.getListPeople().get(1), women);

        treeFamily.makeChildren(treeFamily.getListPeople().get(1), women,"Аня", "Александр");
        treeFamily.makeChildren(treeFamily.getListPeople().get(1), women,"Юля", "Петя");

        System.out.println(treeFamily.getListPeople());

        women = new Women("Катя2", "НеПупкина2", null, null);

        treeFamily.wedding(treeFamily.getListPeople().get(1), women);

        System.out.println(treeFamily.getListPeople());

        System.out.println("exit");
    }
}