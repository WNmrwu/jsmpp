package org.jsmpp.bean;

import org.jsmpp.util.IntUtil;

/**
 * Class represent SMPP Command. Contains only the header of SMPP PDU.
 * 
 * @author uudashr
 * @version 1.0
 * 
 */
public class Command {
    protected int commandLength;
    protected int commandId;
    protected int commandStatus;
    protected int sequenceNumber;

    /**
     * Default constructor.
     */
    public Command() {

    }

    /**
     * Get the command_id.
     * 
     * @return the command_id.
     */
    public int getCommandId() {
        return commandId;
    }

    /**
     * Get the command_id as hex string value.
     * 
     * @return the hex string value of command_id.
     */
    public String getCommandIdAsHex() {
        return IntUtil.toHexString(commandId);
    }

    /**
     * Set the command_id.
     * 
     * @param commandId is the new value of command_id..
     */
    public void setCommandId(int commandId) {
        this.commandId = commandId;
    }

    /**
     * Get the command_length.
     * 
     * @return the command_length.
     */
    public int getCommandLength() {
        return commandLength;
    }

    /**
     * Ser the command_length.
     * 
     * @param commandLength is the new value of command_length.
     */
    public void setCommandLength(int commandLength) {
        this.commandLength = commandLength;
    }

    /**
     * Get the command_status.
     * 
     * @return the command_status.
     */
    public int getCommandStatus() {
        return commandStatus;
    }

    /**
     * Get the command_status as hex string.
     * 
     * @return the hex string value of command_status.
     */
    public String getCommandStatusAsHex() {
        return IntUtil.toHexString(commandStatus);
    }

    /**
     * Set value of command_status.
     * 
     * @param commandStatus is the new value of command_status.
     */
    public void setCommandStatus(int commandStatus) {
        this.commandStatus = commandStatus;
    }

    /**
     * Get the sequence_number.
     * 
     * @return the value of sequence_number.
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Set value of sequence_number.
     * 
     * @param sequenceNumber is the new value of sequece_number.
     */
    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + commandId;
        result = PRIME * result + commandLength;
        result = PRIME * result + commandStatus;
        result = PRIME * result + sequenceNumber;
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Command other = (Command)obj;
        if (commandId != other.commandId)
            return false;
        if (commandLength != other.commandLength)
            return false;
        if (commandStatus != other.commandStatus)
            return false;
        if (sequenceNumber != other.sequenceNumber)
            return false;
        return true;
    }
}
