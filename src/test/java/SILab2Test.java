import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void EveryBranch(){
        //Returns True
        List<Item> items1 = List.of(
                new Item("Vino","0123",500,20),
                new Item("Cokolado","3456",60,30),
                new Item("Jogurt","1555",85,0),
                new Item(null,"7543",100,10)
        );
        int payment1 = 20000;
        assertTrue(SILab2.checkCart(items1,payment1));

        //Returns False
        List<Item> items2 = List.of(
                new Item("Cokolado","1555",150,2),
                new Item("Zejtin","1111",80,2),
                new Item(null,"7543",100,10)
        );
        int payment2 = 100;
        assertFalse(SILab2.checkCart(items2,payment2));

        //allItems list can't be null!
        List<Item> items3 = null;
        RuntimeException exception1 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items3,1000));
        assertEquals("allItems list can't be null!",exception1.getMessage());

        //Invalid character in item barcode!
        List<Item> items4 = List.of(
                new Item("Sok", "a256", 35, 5)
        );
        RuntimeException exception2 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items4,500));
        assertEquals("Invalid character in item barcode!",exception2.getMessage());

        //No barcode!
        List<Item> items5 = List.of(
                new Item("Riba",null,500,2)
        );
        RuntimeException exception3 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items5,1500));
        assertEquals("No barcode!",exception3.getMessage());
    }

    @Test
    public void MultipleCondition(){
        //1 => T T T
        List<Item> items1 = List.of(
                new Item("Jagodi","0123",350,10)
        );
        int payment1 = 4000;
        assertTrue(SILab2.checkCart(items1,payment1));

        //2 => T T F
        List<Item> items2 = List.of(
                new Item("Prasak za perenje","1345",500,5)
        );
        int payment2 = 3000;
        assertTrue(SILab2.checkCart(items2,payment2));

        //3 => T F T
        List<Item> items3 = List.of(
                new Item("Brasno","0555",400,0)
        );
        int payment3 = 500;
        assertTrue(SILab2.checkCart(items3,payment3));

        //4 => T F F
        List<Item> items4 = List.of(
                new Item("Igracka","5541",1500,0)
        );
        int payment4 = 2000;
        assertTrue(SILab2.checkCart(items4,payment4));

        //5 => F T T
        List<Item> items5 =  List.of(
                new Item("Leb","0000",35,2)
        );
        int payment5 = 100;
        assertTrue(SILab2.checkCart(items5,payment5));

        //6 => F T F
        List<Item> items6 = List.of(
                new Item("Cips","9423",80,5)
        );
        int payment6 = 500;
        assertTrue(SILab2.checkCart(items6,payment6));

        //7 => F F T
        List<Item> items7 = List.of(
                new Item("Resani","0921",55,0)
        );
        int payment7 = 100;
        assertTrue(SILab2.checkCart(items7,payment7));

        //8 => F F F
        List<Item> items8 = List.of(
                new Item("Mastiki","1295",35,0)
        );
        int payment8 = 50;
        assertTrue(SILab2.checkCart(items8,payment8));
    }

}
