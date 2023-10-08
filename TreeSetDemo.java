import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args) {
        List<Message> received = List.of(
            new Message(1, "Hello!"),
            new Message(2, "发工资了吗？"),
            new Message(2, "发工资了吗？"),
            new Message(3, "去哪吃饭？"),
            new Message(3, "去哪吃饭？"),
            new Message(4, "Bye")
        );
        List<Message> displayMessages = process(received);
        for (Message message : displayMessages) {
            System.out.println(message.text);
        }
    }

    static List<Message> process(List<Message> received) {
        // TODO: remove the duplicated text with the order of sequence
        // TreeSet<Message> set = new TreeSet<>(new Comparator<Message>() {
        //     @Override
        //     public int compare(Message o1, Message o2) {
        //         return o1.sequence - o2.sequence;
        //     }
        // });
        
        // set.addAll(received);
        // return new ArrayList<Message> (set);
    // the above is working ,used TreeSet with Comparator
    // Set <Integer> sequenceSet = new HashSet<>();
    // List <Message> displayMessages = new ArrayList<>();
    // for (Message message : received) {
    //     if (!sequenceSet.contains(message.sequence)) {
    //         sequenceSet.add(message.sequence);
    //             displayMessages.add(message);
    //            }
    //     }
    
    // return displayMessages;
    // this way use HashSet and ArrayList to store the sequence and filter the duplicate
    // var set=new TreeSet<Message>(Comparator.comparingInt(o->o.sequence));
TreeSet<Message> set = new TreeSet<>((o1, o2) -> o2.sequence - o1.sequence);
    set.addAll(received);
    return new ArrayList<Message>(set);
}
}

class Message {
    public final int sequence;
    public final String text;
    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }
}
