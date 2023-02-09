package org.work.kafka.api;

public class WinDepositDTO {

    private int playerId;
    private int winAmount;

    public WinDepositDTO(int playerId, int winAmount) {
        this.playerId = playerId;
        this.winAmount = winAmount;
    }
    public WinDepositDTO(){}

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getWinAmount() {
        return winAmount;
    }

    public void setWinAmount(int winAmount) {
        this.winAmount = winAmount;
    }
}
