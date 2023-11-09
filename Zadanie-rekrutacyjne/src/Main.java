import model.ComplexBlock;
import model.MyBlock;
import model.Wall;
import repo.Block;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyBlock block1 = new MyBlock("Red", "Concrete");
        MyBlock block2 = new MyBlock("Blue", "Metal");
        MyBlock block3 = new MyBlock("Green", "Concrete");
        MyBlock block4 = new MyBlock("Red", "Plastic");


        List<Block> blocks = Arrays.asList(block1, block2, block3, block4);
        ComplexBlock complexBlock = new ComplexBlock("White", blocks);
        Wall wall = new Wall(complexBlock.getBlocks());

        System.out.println("Metoda count: " + wall.count() + "\n");

        System.out.println("Metoda findBlocksByColors: " + wall.findBlocksByColor("red") + "\n");

        System.out.println("Metoda findBlockByColors: " + wall.findBlockByColor("rEd") + "\n");

        System.out.println("Metoda findBlockByColors: " + wall.findBlocksByMaterial("a") + "\n");

        System.out.println(complexBlock);

        /*
        * Powinno rzucic wyjątkiem IllegalArgumentException: Null argument
        * */
        wall.findBlocksByMaterial(null).forEach(System.out::println);
    }
}