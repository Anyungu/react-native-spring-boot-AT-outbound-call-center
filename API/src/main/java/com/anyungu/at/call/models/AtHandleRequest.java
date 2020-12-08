package com.anyungu.at.call.models;

public class AtHandleRequest {

    private String isActive;

    private String sessionId;

    private String direction;

    private String callerNumber;

    private String destinationNumber;

    private String dtmfDigits;

    private String recordingUrl;

    private String durationInSeconds;

    private String currencyCode;

    private String amount;

    private String clientDialedNumber;

    public String getIsActive() {
        return isActive;
    }

    public String getClientDialedNumber() {
        return clientDialedNumber;
    }

    public void setClientDialedNumber(String clientDialedNumber) {
        this.clientDialedNumber = clientDialedNumber;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCallerNumber() {
        return callerNumber;
    }

    public void setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
    }

    public String getDestinationNumber() {
        return destinationNumber;
    }

    public void setDestinationNumber(String destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

    public String getDtmfDigits() {
        return dtmfDigits;
    }

    public void setDtmfDigits(String dtmfDigits) {
        this.dtmfDigits = dtmfDigits;
    }

    public String getRecordingUrl() {
        return recordingUrl;
    }

    public void setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
    }

    public String getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(String durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
