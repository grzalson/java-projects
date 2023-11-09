package model;



import repo.Block;
import repo.CompositeBlock;

import java.util.List;
import java.util.stream.Collectors;

public class ComplexBlock implements CompositeBlock {
    private String color;

    private String material;

    private List<Block> blocks;
    public ComplexBlock(String color, List<Block> blocks){
        /*
         * Ze względu na to, że CompositeBlock extenduje Block, ComplexBlock musi overridować metody getColor i getMaterial.
         * Kolor uznałem, że może mieć swoj własny (np. po pomalowaniu).
         * Meteriał natomiast jest problemem, ponieważ ComplexBlock mógłby składać się z materiałów różnego rodzaju.
         * Z tego powodu uznałem, że materiałem będą wszystkie unikalne meteriały, z których zrobione są bloki składające się na całość
         * */
        this.color = color;
        this.material = blocks.stream().map(Block::getMaterial).distinct().collect(Collectors.joining(", "));
        this.blocks = blocks;
    }
    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
    public List<Block> getBlocks() {
        return this.blocks;
    }

    @Override
    public String toString() {
        return "ComplexBlock = {color: " + color + ", materials: " + material + "}";
    }
}
