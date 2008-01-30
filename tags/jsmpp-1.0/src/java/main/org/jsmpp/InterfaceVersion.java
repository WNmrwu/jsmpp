package org.jsmpp;

/**
 * Enum represent the interface version of SMPP.
 * 
 * @author uudashr
 * @version 1.0
 * 
 */
public enum InterfaceVersion {
    /**
     * Interface Version for SMPP version 3.3.
     */
    IF_33(SMPPConstant.IF_VERSION_33),

    /**
     * Interface Version for SMPP version 3.4.
     */
    IF_34(SMPPConstant.IF_VERSION_34),

    /**
     * Interface Version for SMPP version 5.0
     */
    IF_50(SMPPConstant.IF_VERSION_50);

    private byte value;

    private InterfaceVersion(byte value) {
        this.value = value;
    }

    /**
     * Get the value of interface version as defined on SMPP spesification.
     * 
     * @return the value of interface version.
     */
    public byte value() {
        return value;
    }

    /**
     * Get the <tt>InterfaceVersion</tt> by specified value.
     * 
     * @param value is the value associated by the enum constant.
     * @return the enum const assiciated with specified <tt>value</tt>.
     * @throws IllegalArgumentException if there is <tt>InterfaceVersion</tt>
     *         associated with specified <tt>value</tt>.
     */
    public static InterfaceVersion valueOf(byte value)
            throws IllegalArgumentException {
        for (InterfaceVersion val : values()) {
            if (val.value == value)
                return val;
        }

        throw new IllegalArgumentException(
                "No enum const InterfaceVersion with value " + value);
    }
}