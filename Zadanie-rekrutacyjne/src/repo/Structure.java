package repo;

import repo.Block;

import java.util.List;
import java.util.Optional;

public interface Structure {
    // zwraca dowolny element o podanym kolorze
    Optional<Block> findBlockByColor(String color);

    // zwraca wszystkie elementy z danego materiału
    List<Block> findBlocksByMaterial(String material);

    //zwraca liczbę wszystkich elementów tworzących strukturę
    int count();

    /* ponieważ w metodzie findBlockByColor może być sytuacja, w której jest więcej niż jeden blok o danym kolorze
        dodaję metodę, która zwróci listę takich bloków
    * */
    List<Block> findBlocksByColor(String color);
}
