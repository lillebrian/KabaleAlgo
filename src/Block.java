import java.util.LinkedList;

public class Block {
    LinkedList<Card> block;

    public Block(LinkedList<Card> block) {
        this.block = block;
    }

    public Block(Block block) {
        LinkedList<Card> temp = new LinkedList<>(block.block);
        this.block = temp;
    }

    public LinkedList<Card> getBlock() {
        return block;
    }

    public Card getLeader() {
        return block.peekFirst();
    }

    public Card getDocker() {
        return block.peekLast();
    }
}
