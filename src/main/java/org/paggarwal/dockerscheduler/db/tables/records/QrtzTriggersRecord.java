/**
 * This class is generated by jOOQ
 */
package org.paggarwal.dockerscheduler.db.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Record3;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;
import org.paggarwal.dockerscheduler.db.tables.QrtzTriggers;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QrtzTriggersRecord extends UpdatableRecordImpl<QrtzTriggersRecord> implements Record16<String, String, String, String, String, String, Long, Long, Integer, String, String, Long, Long, String, Short, byte[]> {

	private static final long serialVersionUID = -1966571273;

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.SCHED_NAME</code>.
	 */
	public void setSchedName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.SCHED_NAME</code>.
	 */
	public String getSchedName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.TRIGGER_NAME</code>.
	 */
	public void setTriggerName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.TRIGGER_NAME</code>.
	 */
	public String getTriggerName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.TRIGGER_GROUP</code>.
	 */
	public void setTriggerGroup(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.TRIGGER_GROUP</code>.
	 */
	public String getTriggerGroup() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.JOB_NAME</code>.
	 */
	public void setJobName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.JOB_NAME</code>.
	 */
	public String getJobName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.JOB_GROUP</code>.
	 */
	public void setJobGroup(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.JOB_GROUP</code>.
	 */
	public String getJobGroup() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.DESCRIPTION</code>.
	 */
	public void setDescription(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.DESCRIPTION</code>.
	 */
	public String getDescription() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.NEXT_FIRE_TIME</code>.
	 */
	public void setNextFireTime(Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.NEXT_FIRE_TIME</code>.
	 */
	public Long getNextFireTime() {
		return (Long) getValue(6);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.PREV_FIRE_TIME</code>.
	 */
	public void setPrevFireTime(Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.PREV_FIRE_TIME</code>.
	 */
	public Long getPrevFireTime() {
		return (Long) getValue(7);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.PRIORITY</code>.
	 */
	public void setPriority(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.PRIORITY</code>.
	 */
	public Integer getPriority() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.TRIGGER_STATE</code>.
	 */
	public void setTriggerState(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.TRIGGER_STATE</code>.
	 */
	public String getTriggerState() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.TRIGGER_TYPE</code>.
	 */
	public void setTriggerType(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.TRIGGER_TYPE</code>.
	 */
	public String getTriggerType() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.START_TIME</code>.
	 */
	public void setStartTime(Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.START_TIME</code>.
	 */
	public Long getStartTime() {
		return (Long) getValue(11);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.END_TIME</code>.
	 */
	public void setEndTime(Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.END_TIME</code>.
	 */
	public Long getEndTime() {
		return (Long) getValue(12);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.CALENDAR_NAME</code>.
	 */
	public void setCalendarName(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.CALENDAR_NAME</code>.
	 */
	public String getCalendarName() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.MISFIRE_INSTR</code>.
	 */
	public void setMisfireInstr(Short value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.MISFIRE_INSTR</code>.
	 */
	public Short getMisfireInstr() {
		return (Short) getValue(14);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_TRIGGERS.JOB_DATA</code>.
	 */
	public void setJobData(byte[] value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_TRIGGERS.JOB_DATA</code>.
	 */
	public byte[] getJobData() {
		return (byte[]) getValue(15);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record3<String, String, String> key() {
		return (Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<String, String, String, String, String, String, Long, Long, Integer, String, String, Long, Long, String, Short, byte[]> fieldsRow() {
		return (Row16) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<String, String, String, String, String, String, Long, Long, Integer, String, String, Long, Long, String, Short, byte[]> valuesRow() {
		return (Row16) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_GROUP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return QrtzTriggers.QRTZ_TRIGGERS.JOB_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return QrtzTriggers.QRTZ_TRIGGERS.JOB_GROUP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return QrtzTriggers.QRTZ_TRIGGERS.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field7() {
		return QrtzTriggers.QRTZ_TRIGGERS.NEXT_FIRE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field8() {
		return QrtzTriggers.QRTZ_TRIGGERS.PREV_FIRE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return QrtzTriggers.QRTZ_TRIGGERS.PRIORITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field12() {
		return QrtzTriggers.QRTZ_TRIGGERS.START_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field13() {
		return QrtzTriggers.QRTZ_TRIGGERS.END_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field14() {
		return QrtzTriggers.QRTZ_TRIGGERS.CALENDAR_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field15() {
		return QrtzTriggers.QRTZ_TRIGGERS.MISFIRE_INSTR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field16() {
		return QrtzTriggers.QRTZ_TRIGGERS.JOB_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getSchedName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTriggerName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTriggerGroup();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getJobName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getJobGroup();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value7() {
		return getNextFireTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value8() {
		return getPrevFireTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getPriority();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getTriggerState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getTriggerType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value12() {
		return getStartTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value13() {
		return getEndTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value14() {
		return getCalendarName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value15() {
		return getMisfireInstr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value16() {
		return getJobData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value1(String value) {
		setSchedName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value2(String value) {
		setTriggerName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value3(String value) {
		setTriggerGroup(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value4(String value) {
		setJobName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value5(String value) {
		setJobGroup(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value6(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value7(Long value) {
		setNextFireTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value8(Long value) {
		setPrevFireTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value9(Integer value) {
		setPriority(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value10(String value) {
		setTriggerState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value11(String value) {
		setTriggerType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value12(Long value) {
		setStartTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value13(Long value) {
		setEndTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value14(String value) {
		setCalendarName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value15(Short value) {
		setMisfireInstr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord value16(byte[] value) {
		setJobData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzTriggersRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Long value7, Long value8, Integer value9, String value10, String value11, Long value12, Long value13, String value14, Short value15, byte[] value16) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		value15(value15);
		value16(value16);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached QrtzTriggersRecord
	 */
	public QrtzTriggersRecord() {
		super(QrtzTriggers.QRTZ_TRIGGERS);
	}

	/**
	 * Create a detached, initialised QrtzTriggersRecord
	 */
	public QrtzTriggersRecord(String schedName, String triggerName, String triggerGroup, String jobName, String jobGroup, String description, Long nextFireTime, Long prevFireTime, Integer priority, String triggerState, String triggerType, Long startTime, Long endTime, String calendarName, Short misfireInstr, byte[] jobData) {
		super(QrtzTriggers.QRTZ_TRIGGERS);

		setValue(0, schedName);
		setValue(1, triggerName);
		setValue(2, triggerGroup);
		setValue(3, jobName);
		setValue(4, jobGroup);
		setValue(5, description);
		setValue(6, nextFireTime);
		setValue(7, prevFireTime);
		setValue(8, priority);
		setValue(9, triggerState);
		setValue(10, triggerType);
		setValue(11, startTime);
		setValue(12, endTime);
		setValue(13, calendarName);
		setValue(14, misfireInstr);
		setValue(15, jobData);
	}
}
