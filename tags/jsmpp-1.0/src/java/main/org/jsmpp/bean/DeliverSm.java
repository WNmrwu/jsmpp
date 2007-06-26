package org.jsmpp.bean;

import org.jsmpp.SMPPConstant;

/**
 * @author uudashr
 *
 */
public class DeliverSm extends MessageRequest {
	
	public DeliverSm() {
		super();
	}
	
	/**
	 * Message Type.
	 * @return
	 */
	public boolean isSmscDeliveryReceipt() {
		return isSmscDeliveryReceipt(_esmClass);
	}
	
	/**
	 * Message Type.
	 * @param value
	 */
	public void setSmscDeliveryReceipt() {
		_esmClass = composeSmscDeliveryReceipt(_esmClass);
	}
	
	/**
	 * Message Type.
	 * @return
	 */
	public boolean isSmeManualAcknowledgment() {
		return isSmeManualAcknowledgment(_esmClass);
	}
	
	/**
	 * Message Type.
	 */
	public void setSmeManualAcknowledgment() {
		_esmClass = composeSmeManualAcknowledment(_esmClass);
	}
	
	/**
	 * Message Type.
	 * @return
	 */
	public boolean isConversationAbort() {
		return isConversationAbort(_esmClass);
	}
	
	/**
	 * Message Type.
	 */
	public void setConversationAbort() {
		_esmClass = composeConversationAbort(_esmClass);
	}
	
	/**
	 * Message Type.
	 * @return
	 */
	public boolean isIntermedietDeliveryNotification() {
		return isIntermedietDeliveryNotification(_esmClass);
	}
	
	/**
	 * Message Type.
	 */
	public void setIntermedietDeliveryNotification() {
		_esmClass = composeIntermedietDeliveryNotification(_esmClass);
	}
	
	/**
	 * SME originated Acknowledgement.
	 * @return
	 */
	public boolean isSmeAckNotRequested() {
		return isSmeAckNotRequested(_registeredDelivery);
	}
	
	/**
	 * SME originated Acknowledgement.
	 */
	public void setSmeAckNotRequested() {
		_registeredDelivery = composeSmeAckNotRequested(_registeredDelivery);
	}
	
	/**
	 * SME originated Acknowledgement.
	 * @return
	 */
	public boolean isSmeDeliveryAckRequested() {
		return isSmeDeliveryAckRequested(_registeredDelivery);
	}
	
	/**
	 * SME originated Acknowledgement.
	 */
	public void setSmeDeliveryAckRequested() {
		_registeredDelivery = composeSmeDeliveryAckRequested(_registeredDelivery);
	}
	
	/**
	 * SME originated Acknowledgement.
	 * @return
	 */
	public boolean isSmeManualAckRequested() {
		return isSmeManualAckRequested(_registeredDelivery);
	}
	
	/**
	 * 
	 * SME originated Acknowledgement.
	 */
	public void setSmeManualAckRequested() {
		_registeredDelivery = composeSmeManualAckRequested(_registeredDelivery);
	}
	
	/**
	 * SME originated Acknowledgement.
	 * @return
	 */
	public boolean isSmeDeliveryAndManualAckRequested() {
		return isSmeDeliveryAndManualAckRequested(_registeredDelivery);
	}
	
	/**
	 * SME originated Acknowledgement.
	 */
	public void setSmeDeliveryAndManualAckRequested() {
		_registeredDelivery = composeSmeDeliveryAndManualAckRequested(_registeredDelivery);
	}
	
	/**
	 * Message Type.
	 * Return esm_class of deliver_sm or data_sm indicate delivery receipt or not.
	 * @param esmClass
	 * @return <tt>true</tt> if esmClass indicate delivery receipt
	 */
	public static final boolean isSmscDeliveryReceipt(byte esmClass) {
		return isMessageType(esmClass, SMPPConstant.ESMCLS_SMSC_DELIV_RECEIPT);
	}
	
	/**
	 * Message Type.
	 * Set esm_class as delivery receipt
	 * @param esmClass
	 * @return
	 */
	public static final byte composeSmscDeliveryReceipt(byte esmClass) {
		return composeMessageType(esmClass, SMPPConstant.ESMCLS_SMSC_DELIV_RECEIPT);
	}
	
	/**
	 * Message Type.
	 * @param esmClass
	 * @return
	 */
	public static final boolean isSmeDeliveryAcknowledgment(byte esmClass) {
		return isMessageType(esmClass, SMPPConstant.ESMCLS_SME_DELIV_ACK);
	}
	
	/**
	 * Message Type.
	 * @param esmClass
	 * @return
	 */
	public static final byte composeSmeDeliveryAcknowledment(byte esmClass) {
		return composeMessageType(esmClass, SMPPConstant.ESMCLS_SME_DELIV_ACK);
	}
	
	/**
	 * Message Type.
	 * @param esmClass
	 * @return
	 */
	public static final boolean isSmeManualAcknowledgment(byte esmClass) {
		return isMessageType(esmClass, SMPPConstant.ESMCLS_SME_MANUAL_ACK);
	}
	
	/**
	 * Message Type.
	 * @param esmClass
	 * @return
	 */
	public static final byte composeSmeManualAcknowledment(byte esmClass) {
		return composeMessageType(esmClass, SMPPConstant.ESMCLS_SME_MANUAL_ACK);
	}
	
	/**
	 * Message Type.
	 * @param esmClass
	 * @return
	 */
	public static final boolean isConversationAbort(byte esmClass) {
		return isMessageType(esmClass, SMPPConstant.ESMCLS_CONV_ABORT);
	}
	
	/**
	 * Message Type.
	 * @param esmClass
	 * @return
	 */
	public static final byte composeConversationAbort(byte esmClass) {
		return composeMessageType(esmClass, SMPPConstant.ESMCLS_CONV_ABORT);
	}
	
	/**
	 * Message Type.
	 * @param esmClass
	 * @return
	 */
	public static final boolean isIntermedietDeliveryNotification(byte esmClass) {
		return isMessageType(esmClass, SMPPConstant.ESMCLS_INTRMD_DELIV_NOTIF);
	}
	
	/**
	 * Message Type.
	 * @param esmClass
	 * @return
	 */
	public static final byte composeIntermedietDeliveryNotification(byte esmClass) {
		return composeMessageType(esmClass, SMPPConstant.ESMCLS_INTRMD_DELIV_NOTIF);
	}
	
	/*
	 * SME originated Acknowledgement.
	 */
	
	/**
	 * SME originated Acknowledgement.
	 * @param registeredDeliery
	 * @return
	 */
	public static final boolean isSmeAckNotRequested(byte registeredDeliery) {
		return isSmeAck(registeredDeliery, SMPPConstant.REGDEL_SME_ACK_NO);
	}
	
	/**
	 * SME originated Acknowledgement.
	 * @param registeredDelivery
	 * @return
	 */
	public static final byte composeSmeAckNotRequested(byte registeredDelivery) {
		return composeSmeAck(registeredDelivery, SMPPConstant.REGDEL_SME_ACK_NO);
	}
	
	/**
	 * SME originated Acknowledgement.
	 * @param registeredDeliery
	 * @return
	 */
	public static final boolean isSmeDeliveryAckRequested(byte registeredDeliery) {
		return isSmeAck(registeredDeliery, SMPPConstant.REGDEL_SME_DELIVERY_ACK_REQUESTED);
	}
	
	/**
	 * SME originated Acknowledgement.
	 * @param registeredDelivery
	 * @return
	 */
	public static final byte composeSmeDeliveryAckRequested(byte registeredDelivery) {
		return composeSmeAck(registeredDelivery, SMPPConstant.REGDEL_SME_DELIVERY_ACK_REQUESTED);
	}
	
	/**
	 * SME originated Acknowledgement.
	 * @param registeredDelivery
	 * @return
	 */
	public static final boolean isSmeManualAckRequested(byte registeredDelivery) {
		return isSmeAck(registeredDelivery, SMPPConstant.REGDEL_SME_MANUAL_ACK_REQUESTED);
	}
	
	/**
	 * SME originated Acknowledgement.
	 * @param registeredDelivery
	 * @return
	 */
	public static final byte composeSmeManualAckRequested(byte registeredDelivery) {
		return composeSmeAck(registeredDelivery, SMPPConstant.REGDEL_SME_MANUAL_ACK_REQUESTED);
	}
	
	/**
	 * SME originated Acknowledgement.
	 * @param registeredDelivery
	 * @return
	 */
	public static final boolean isSmeDeliveryAndManualAckRequested(byte registeredDelivery) {
		return isSmeAck(registeredDelivery, SMPPConstant.REGDEL_SME_DELIVERY_MANUAL_ACK_REQUESTED);
	}
	
	/**
	 * SME originated Acknowledgement.
	 * @param registeredDelivery
	 * @return
	 */
	public static final byte composeSmeDeliveryAndManualAckRequested(byte registeredDelivery) {
		return composeSmeAck(registeredDelivery, SMPPConstant.REGDEL_SME_DELIVERY_MANUAL_ACK_REQUESTED);
	}
}
