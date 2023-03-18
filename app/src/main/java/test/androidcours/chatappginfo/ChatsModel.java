package test.androidcours.chatappginfo;

public class ChatsModel {
     private String chatName;
     private int chatImage;
     private String lastMsg;
     private String lastMsgTime;

     public ChatsModel() {

     }
     public ChatsModel(String chatName, int chatImage, String lastMsg, String lastMsgTime) {
          this.chatName = chatName;
          this.chatImage = chatImage;
          this.lastMsg = lastMsg;
          this.lastMsgTime = lastMsgTime;
     }

     public String getChatName() {
          return chatName;
     }

     public void setChatName(String chatName) {
          this.chatName = chatName;
     }

     public int getChatImage() {
          return chatImage;
     }

     public void setChatImage(int chatImage) {
          this.chatImage = chatImage;
     }

     public String getLastMsg() {
          return lastMsg;
     }

     public void setLastMsg(String lastMsg) {
          this.lastMsg = lastMsg;
     }

     public String getLastMsgTime() {
          return lastMsgTime;
     }

     public void setLastMsgTime(String lastMsgTime) {
          this.lastMsgTime = lastMsgTime;
     }
}
