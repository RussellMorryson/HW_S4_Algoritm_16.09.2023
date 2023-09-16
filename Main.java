public class Main {
    public static void main (String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
/*
Homework s4 algorims 15.09.2023
* Красно-черное дерево имеет следующие критерии:
• Каждая нода имеет цвет (красный или черный)
• Корень дерева всегда черный
• Новая нода всегда красная
• Красные ноды могут быть только левым ребенком
• У краной ноды все дети черного цвета
*/
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(8);
        tree.add(1);  
        tree.add(9);
        tree.add(0);
        tree.add(10); 
        tree.print();
    }
}
