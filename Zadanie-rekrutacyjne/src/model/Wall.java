package model;

import repo.Block;
import repo.Structure;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Wall implements Structure {
    private List<Block> blocks;
    public Wall(List<Block> blocks){
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        if (color == null){
            throw new IllegalArgumentException("Null argument");
        }
        /*
        * Przyjmuję, że zwracam pierwszy znaleziony blok o danym kolorze oraz ignoruję wielkość liter argumentu
        * */
        return findByPredicate(block -> block.getColor().equalsIgnoreCase(color)).stream().findFirst();

    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        if (material == null){
            throw new IllegalArgumentException("Null argument");
        }
        return findByPredicate((block -> block.getMaterial().equalsIgnoreCase(material)));
    }

    /*
    * Stworzyłem metode, która pozwala na przeszukiwanie listy bloków po zadanym predicate,
    * aby móc ją wykorzystywać w metodach typu find
    * */
    private List<Block> findByPredicate(Predicate<Block> predicate){
        return blocks.stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }

    @Override
    public List<Block> findBlocksByColor(String color) {
        if (color == null){
            throw new IllegalArgumentException("Null argument");
        }
        return findByPredicate(block -> block.getColor().equalsIgnoreCase(color));
    }
}
