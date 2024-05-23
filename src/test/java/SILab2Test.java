import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void everyBranch(){
        List<Item> items1 = new ArrayList<>();
        items1.add(new Item("Vino","0123",500,20));
        items1.add(new Item("Cokolado","3456",60,30));
        items1.add(new Item("Jogurt","1555",85,0));
        int payment1 = 20000;
        assertTrue(SILab2.checkCart(items1,payment1));

        List<Item> items2 = new ArrayList<>();
        items2.add(new Item("Cokolado","1555",150,2));
        items2.add(new Item("Zejtin","1111",80,2));
        int payment2 = 100;
        assertFalse(SILab2.checkCart(items2,payment2));

        //allItems list can't be null!
        List<Item> items3 = null;
        RuntimeException exception1 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items3,1000));
        assertEquals("allItems list can't be null!",exception1.getMessage());

        //Invalid character in item barcode!
        List<Item> items4 = new ArrayList<>();
        items4.add(new Item("Sok","a256",35,5));
        RuntimeException exception2 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items4,500));
        assertEquals("Invalid character in item barcode!",exception2.getMessage());

        //No barcode!
        List<Item> items5 = new ArrayList<>();
        items5.add(new Item("Riba",null,500,2));
        RuntimeException exception3 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items5,1500));
        assertEquals("No barcode!",exception3.getMessage());
    }

}
