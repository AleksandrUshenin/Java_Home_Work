package OOP1;

/**
 * Start
 */
public class Start {
    public static void main(String[] args) {
        System.out.println("создаем семью");

        TreeFamily<People> treeFamily = new TreeFamily<>();
        treeFamily.add(new Men("Василий", "Пупкин", null, null));
        Women women = new Women("Оля", "НеПупкина", null, null);
        treeFamily.wedding(treeFamily.getListPeople().get(0), women);
        System.out.println("теперь 2 человека в семье муж и жена");
        treeFamily.makeChildren(treeFamily.getListPeople().get(0), women,"Лена", "Андрей");
        System.out.println("создаем ребенка");

        System.out.println(treeFamily.getListPeople());

        treeFamily.growChild((Child)treeFamily.getListPeople().get(0).getChildrens().get(0));
        System.out.println("ребенок подрос");

        System.out.println(treeFamily.getListPeople());

        System.out.println("жена умерла");
        treeFamily.funeral(women);

        System.out.println(treeFamily.getListPeople());

        System.out.println("пытаемся создать ребенка");
        treeFamily.makeChildren(treeFamily.getListPeople().get(0), women,"Аня", "Александр");

        System.out.println(treeFamily.getListPeople());

        System.out.println("создаем новую жену");
        women = new Women("Катя", "НеПупкина", null, null);

        treeFamily.wedding(treeFamily.getListPeople().get(1), women);
        System.out.println("женим их");
        System.out.println(treeFamily.getListPeople());

        System.out.println("делаем детей");
        treeFamily.makeChildren(treeFamily.getListPeople().get(1), women,"Аня", "Александр");
        System.out.println(treeFamily.getListPeople());

        treeFamily.makeChildren(treeFamily.getListPeople().get(1), women,"Юля", "Петя");

        System.out.println(treeFamily.getListPeople());

        women = new Women("Катя2", "НеПупкина2", null, null);

        treeFamily.wedding(treeFamily.getListPeople().get(1), women);

        System.out.println(treeFamily.getListPeople());

        System.out.println("exit");
    }
}