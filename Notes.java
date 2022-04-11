import java.util.Vector;

public class Notes {
    Vector<String> messages = new Vector<String>();

    public Notes(){

    }

    public void addMessage(String message){
        messages.add(message);
    }

    public void deleteMessage(int index){
        if(messages.isEmpty()){
            System.out.println("There are no messages to delete.");
        } else {
            messages.remove(index);
        }
    }

    public int messagesSize(){
        return messages.size();
    }

    public String returnNote(int index){
        if(index >= messagesSize()){
            return "The index you have entered is out of range.";
        }
        return messages.get(index);
    }
}
