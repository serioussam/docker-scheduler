/**
 * This class is generated by jOOQ
 */
package org.paggarwal.dockerscheduler.db.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.paggarwal.dockerscheduler.db.tables.QrtzLocks;


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
public class QrtzLocksRecord extends UpdatableRecordImpl<QrtzLocksRecord> implements Record2<String, String> {

	private static final long serialVersionUID = -505755146;

	/**
	 * Setter for <code>dockerscheduler.QRTZ_LOCKS.SCHED_NAME</code>.
	 */
	public void setSchedName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_LOCKS.SCHED_NAME</code>.
	 */
	public String getSchedName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>dockerscheduler.QRTZ_LOCKS.LOCK_NAME</code>.
	 */
	public void setLockName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dockerscheduler.QRTZ_LOCKS.LOCK_NAME</code>.
	 */
	public String getLockName() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<String, String> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return QrtzLocks.QRTZ_LOCKS.SCHED_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return QrtzLocks.QRTZ_LOCKS.LOCK_NAME;
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
		return getLockName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzLocksRecord value1(String value) {
		setSchedName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzLocksRecord value2(String value) {
		setLockName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzLocksRecord values(String value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached QrtzLocksRecord
	 */
	public QrtzLocksRecord() {
		super(QrtzLocks.QRTZ_LOCKS);
	}

	/**
	 * Create a detached, initialised QrtzLocksRecord
	 */
	public QrtzLocksRecord(String schedName, String lockName) {
		super(QrtzLocks.QRTZ_LOCKS);

		setValue(0, schedName);
		setValue(1, lockName);
	}
}