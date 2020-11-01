package model;
import java.io.Serializable;
import java.util.ArrayList;

public class Packet implements Serializable {

    private String ipAddress;
    private int portNum;
    private PlayerDetails playerDetails;
    private String winnerMsg;


    public Packet(String ipAddress, int portNum, String name) {
        this.ipAddress = ipAddress;
        this.portNum = portNum;
        this.playerDetails = new PlayerDetails(name);
    }

    public ArrayList<Card> giveHand(ArrayList<Card> hand){
        return null;
    }

    public String getIpAddress(){
        return ipAddress;
    }

    public int getPortNum() {
        return portNum;
    }

    public PlayerDetails getPlayerDetails() {
        return playerDetails;
    }



    public String getWinnerMsg() {
        return winnerMsg;
    }

    public void setWinnerMsg(String winnerMsg) {
        this.winnerMsg = winnerMsg;
    }


    /* Player details implementation */
    public class PlayerDetails implements Serializable{
        private String playerName;
        private ArrayList<Card> hand;
        private int bidAmount;
        private String betChoice;
        private boolean isOnline;

        public PlayerDetails(String playerName) {
            this.playerName = playerName;
            this.isOnline = true;
        }

        public String getPlayerName() {
            return playerName;
        }

        public void setPlayerName(String playerName) {
            this.playerName = playerName;
        }

        public ArrayList<Card> getHand() {
            return hand;
        }

        public void setHand(ArrayList<Card> hand) {
            this.hand = hand;
        }

        public int getBidAmount() {
            return bidAmount;
        }

        public void setBidAmount(int bidAmount) {
            this.bidAmount = bidAmount;
        }

        public String getBetChoice() {
            return betChoice;
        }

        public void setBetChoice(String betChoice) {
            this.betChoice = betChoice;
        }

        public boolean isOnline() {
            return isOnline;
        }

        public void setOnline(boolean online) {
            isOnline = online;
        }
    }


}